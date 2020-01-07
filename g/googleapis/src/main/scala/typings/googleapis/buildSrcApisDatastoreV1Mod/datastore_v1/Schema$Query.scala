package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A query for entities.
  */
@js.native
trait Schema$Query extends js.Object {
  /**
    * The properties to make distinct. The query results will contain the first
    * result for each distinct combination of values for the given properties
    * (if empty, all results are returned).
    */
  var distinctOn: js.UndefOr[js.Array[Schema$PropertyReference]] = js.native
  /**
    * An ending point for the query results. Query cursors are returned in
    * query result batches and [can only be used to limit the same
    * query](https://cloud.google.com/datastore/docs/concepts/queries#cursors_limits_and_offsets).
    */
  var endCursor: js.UndefOr[String] = js.native
  /**
    * The filter to apply.
    */
  var filter: js.UndefOr[Schema$Filter] = js.native
  /**
    * The kinds to query (if empty, returns entities of all kinds). Currently
    * at most 1 kind may be specified.
    */
  var kind: js.UndefOr[js.Array[Schema$KindExpression]] = js.native
  /**
    * The maximum number of results to return. Applies after all other
    * constraints. Optional. Unspecified is interpreted as no limit. Must be
    * &gt;= 0 if specified.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The number of results to skip. Applies before limit, but after all other
    * constraints. Optional. Must be &gt;= 0 if specified.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The order to apply to the query results (if empty, order is unspecified).
    */
  var order: js.UndefOr[js.Array[Schema$PropertyOrder]] = js.native
  /**
    * The projection to return. Defaults to returning all properties.
    */
  var projection: js.UndefOr[js.Array[Schema$Projection]] = js.native
  /**
    * A starting point for the query results. Query cursors are returned in
    * query result batches and [can only be used to continue the same
    * query](https://cloud.google.com/datastore/docs/concepts/queries#cursors_limits_and_offsets).
    */
  var startCursor: js.UndefOr[String] = js.native
}

object Schema$Query {
  @scala.inline
  def apply(
    distinctOn: js.Array[Schema$PropertyReference] = null,
    endCursor: String = null,
    filter: Schema$Filter = null,
    kind: js.Array[Schema$KindExpression] = null,
    limit: Int | Double = null,
    offset: Int | Double = null,
    order: js.Array[Schema$PropertyOrder] = null,
    projection: js.Array[Schema$Projection] = null,
    startCursor: String = null
  ): Schema$Query = {
    val __obj = js.Dynamic.literal()
    if (distinctOn != null) __obj.updateDynamic("distinctOn")(distinctOn.asInstanceOf[js.Any])
    if (endCursor != null) __obj.updateDynamic("endCursor")(endCursor.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (startCursor != null) __obj.updateDynamic("startCursor")(startCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Query]
  }
}

