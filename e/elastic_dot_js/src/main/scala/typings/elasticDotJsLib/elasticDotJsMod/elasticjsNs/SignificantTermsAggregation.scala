package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignificantTermsAggregation extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.  Alias for the
    aggregation method.
    */
  def agg(agg: Aggregation): SignificantTermsAggregation
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): SignificantTermsAggregation
  /*
    Allows you to filter out unwanted facet entries using a regular
    expression.  You can also optionally pass in a set of flags to apply
    to the regular expression.  Valid flags are: CASE_INSENSITIVE,
    MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL,
    COMMENTS, and UNICODE_CHAR_CLASS.  Separate multiple flags with a |
    character.
    */
  def exclude(exclude: java.lang.String, flags: java.lang.String): SignificantTermsAggregation
  /*
    Sets the execution hint determines how the aggregation is computed.
    Supported values are: map and ordinals.
    */
  def executionHint(h: java.lang.String): SignificantTermsAggregation
  /*
    Sets the field to gather terms from.
    */
  def field(field: java.lang.String): SignificantTermsAggregation
  /*
    Sets the format expression for the terms.  Use for number or date
    formatting.
    */
  def format(f: java.lang.String): SignificantTermsAggregation
  /*
    Allows you to allow only specific entries using a regular
    expression.  You can also optionally pass in a set of flags to apply
    to the regular expression.  Valid flags are: CASE_INSENSITIVE,
    MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL,
    COMMENTS, and UNICODE_CHAR_CLASS.  Separate multiple flags with a |
    character.
    */
  def include(include: java.lang.String, flags: java.lang.String): SignificantTermsAggregation
  /*
    Only return terms that match more than a configured number of hits.
    */
  def minDocCount(num: scala.Double): SignificantTermsAggregation
  /*
    Determines how many terms the coordinating node will request from
    each shard.
    */
  def shardSize(shardSize: scala.Double): SignificantTermsAggregation
  /*
    Sets the number of aggregation entries that will be returned.
    */
  def size(size: scala.Double): SignificantTermsAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object SignificantTermsAggregation {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    agg: js.Function1[Aggregation, SignificantTermsAggregation],
    aggregation: js.Function1[Aggregation, SignificantTermsAggregation],
    exclude: js.Function2[java.lang.String, java.lang.String, SignificantTermsAggregation],
    executionHint: js.Function1[java.lang.String, SignificantTermsAggregation],
    field: js.Function1[java.lang.String, SignificantTermsAggregation],
    format: js.Function1[java.lang.String, SignificantTermsAggregation],
    include: js.Function2[java.lang.String, java.lang.String, SignificantTermsAggregation],
    minDocCount: js.Function1[scala.Double, SignificantTermsAggregation],
    shardSize: js.Function1[scala.Double, SignificantTermsAggregation],
    size: js.Function1[scala.Double, SignificantTermsAggregation],
    toJSON: js.Function0[js.Any]
  ): SignificantTermsAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("agg")(agg)
    __obj.updateDynamic("aggregation")(aggregation)
    __obj.updateDynamic("exclude")(exclude)
    __obj.updateDynamic("executionHint")(executionHint)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("include")(include)
    __obj.updateDynamic("minDocCount")(minDocCount)
    __obj.updateDynamic("shardSize")(shardSize)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[SignificantTermsAggregation]
  }
}

