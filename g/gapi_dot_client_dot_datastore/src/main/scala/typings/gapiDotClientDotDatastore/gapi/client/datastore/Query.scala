package typings.gapiDotClientDotDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  /**
    * The properties to make distinct. The query results will contain the first
    * result for each distinct combination of values for the given properties
    * (if empty, all results are returned).
    */
  var distinctOn: js.UndefOr[js.Array[PropertyReference]] = js.undefined
  /**
    * An ending point for the query results. Query cursors are
    * returned in query result batches and
    * [can only be used to limit the same query](https://cloud.google.com/datastore/docs/concepts/queries#cursors_limits_and_offsets).
    */
  var endCursor: js.UndefOr[String] = js.undefined
  /** The filter to apply. */
  var filter: js.UndefOr[Filter] = js.undefined
  /**
    * The kinds to query (if empty, returns entities of all kinds).
    * Currently at most 1 kind may be specified.
    */
  var kind: js.UndefOr[js.Array[KindExpression]] = js.undefined
  /**
    * The maximum number of results to return. Applies after all other
    * constraints. Optional.
    * Unspecified is interpreted as no limit.
    * Must be >= 0 if specified.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * The number of results to skip. Applies before limit, but after all other
    * constraints. Optional. Must be >= 0 if specified.
    */
  var offset: js.UndefOr[Double] = js.undefined
  /** The order to apply to the query results (if empty, order is unspecified). */
  var order: js.UndefOr[js.Array[PropertyOrder]] = js.undefined
  /** The projection to return. Defaults to returning all properties. */
  var projection: js.UndefOr[js.Array[Projection]] = js.undefined
  /**
    * A starting point for the query results. Query cursors are
    * returned in query result batches and
    * [can only be used to continue the same query](https://cloud.google.com/datastore/docs/concepts/queries#cursors_limits_and_offsets).
    */
  var startCursor: js.UndefOr[String] = js.undefined
}

object Query {
  @scala.inline
  def apply(
    distinctOn: js.Array[PropertyReference] = null,
    endCursor: String = null,
    filter: Filter = null,
    kind: js.Array[KindExpression] = null,
    limit: Int | Double = null,
    offset: Int | Double = null,
    order: js.Array[PropertyOrder] = null,
    projection: js.Array[Projection] = null,
    startCursor: String = null
  ): Query = {
    val __obj = js.Dynamic.literal()
    if (distinctOn != null) __obj.updateDynamic("distinctOn")(distinctOn)
    if (endCursor != null) __obj.updateDynamic("endCursor")(endCursor)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (startCursor != null) __obj.updateDynamic("startCursor")(startCursor)
    __obj.asInstanceOf[Query]
  }
}

