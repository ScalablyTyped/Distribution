package typings.gapiDotClientDotSpanner.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialResultSet extends js.Object {
  /**
    * If true, then the final value in values is chunked, and must
    * be combined with more values from subsequent `PartialResultSet`s
    * to obtain a complete field value.
    */
  var chunkedValue: js.UndefOr[Boolean] = js.undefined
  /**
    * Metadata about the result set, such as row type information.
    * Only present in the first response.
    */
  var metadata: js.UndefOr[ResultSetMetadata] = js.undefined
  /**
    * Streaming calls might be interrupted for a variety of reasons, such
    * as TCP connection loss. If this occurs, the stream of results can
    * be resumed by re-sending the original request and including
    * `resume_token`. Note that executing any other transaction in the
    * same session invalidates the token.
    */
  var resumeToken: js.UndefOr[String] = js.undefined
  /**
    * Query plan and execution statistics for the query that produced this
    * streaming result set. These can be requested by setting
    * ExecuteSqlRequest.query_mode and are sent
    * only once with the last response in the stream.
    */
  var stats: js.UndefOr[ResultSetStats] = js.undefined
  /**
    * A streamed result set consists of a stream of values, which might
    * be split into many `PartialResultSet` messages to accommodate
    * large rows and/or large values. Every N complete values defines a
    * row, where N is equal to the number of entries in
    * metadata.row_type.fields.
    *
    * Most values are encoded based on type as described
    * here.
    *
    * It is possible that the last value in values is "chunked",
    * meaning that the rest of the value is sent in subsequent
    * `PartialResultSet`(s). This is denoted by the chunked_value
    * field. Two or more chunked values can be merged to form a
    * complete value as follows:
    *
    * &#42; `bool/number/null`: cannot be chunked
    * &#42; `string`: concatenate the strings
    * &#42; `list`: concatenate the lists. If the last element in a list is a
    * `string`, `list`, or `object`, merge it with the first element in
    * the next list by applying these rules recursively.
    * &#42; `object`: concatenate the (field name, field value) pairs. If a
    * field name is duplicated, then apply these rules recursively
    * to merge the field values.
    *
    * Some examples of merging:
    *
    * # Strings are concatenated.
    * "foo", "bar" => "foobar"
    *
    * # Lists of non-strings are concatenated.
    * [2, 3], [4] => [2, 3, 4]
    *
    * # Lists are concatenated, but the last and first elements are merged
    * # because they are strings.
    * ["a", "b"], ["c", "d"] => ["a", "bc", "d"]
    *
    * # Lists are concatenated, but the last and first elements are merged
    * # because they are lists. Recursively, the last and first elements
    * # of the inner lists are merged because they are strings.
    * ["a", ["b", "c"]], [["d"], "e"] => ["a", ["b", "cd"], "e"]
    *
    * # Non-overlapping object fields are combined.
    * {"a": "1"}, {"b": "2"} => {"a": "1", "b": 2"}
    *
    * # Overlapping object fields are merged.
    * {"a": "1"}, {"a": "2"} => {"a": "12"}
    *
    * # Examples of merging objects containing lists of strings.
    * {"a": ["1"]}, {"a": ["2"]} => {"a": ["12"]}
    *
    * For a more complete example, suppose a streaming SQL query is
    * yielding a result set whose rows contain a single string
    * field. The following `PartialResultSet`s might be yielded:
    *
    * {
    * "metadata": { ... }
    * "values": ["Hello", "W"]
    * "chunked_value": true
    * "resume_token": "Af65..."
    * }
    * {
    * "values": ["orl"]
    * "chunked_value": true
    * "resume_token": "Bqp2..."
    * }
    * {
    * "values": ["d"]
    * "resume_token": "Zx1B..."
    * }
    *
    * This sequence of `PartialResultSet`s encodes two rows, one
    * containing the field value `"Hello"`, and a second containing the
    * field value `"World" = "W" + "orl" + "d"`.
    */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object PartialResultSet {
  @scala.inline
  def apply(
    chunkedValue: js.UndefOr[Boolean] = js.undefined,
    metadata: ResultSetMetadata = null,
    resumeToken: String = null,
    stats: ResultSetStats = null,
    values: js.Array[_] = null
  ): PartialResultSet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkedValue)) __obj.updateDynamic("chunkedValue")(chunkedValue)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[PartialResultSet]
  }
}

