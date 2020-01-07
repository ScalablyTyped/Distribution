package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.RunQuery.
  */
@js.native
trait Schema$RunQueryRequest extends js.Object {
  /**
    * The GQL query to run.
    */
  var gqlQuery: js.UndefOr[Schema$GqlQuery] = js.native
  /**
    * Entities are partitioned into subsets, identified by a partition ID.
    * Queries are scoped to a single partition. This partition ID is normalized
    * with the standard default context partition ID.
    */
  var partitionId: js.UndefOr[Schema$PartitionId] = js.native
  /**
    * The query to run.
    */
  var query: js.UndefOr[Schema$Query] = js.native
  /**
    * The options for this query.
    */
  var readOptions: js.UndefOr[Schema$ReadOptions] = js.native
}

object Schema$RunQueryRequest {
  @scala.inline
  def apply(
    gqlQuery: Schema$GqlQuery = null,
    partitionId: Schema$PartitionId = null,
    query: Schema$Query = null,
    readOptions: Schema$ReadOptions = null
  ): Schema$RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    if (gqlQuery != null) __obj.updateDynamic("gqlQuery")(gqlQuery.asInstanceOf[js.Any])
    if (partitionId != null) __obj.updateDynamic("partitionId")(partitionId.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (readOptions != null) __obj.updateDynamic("readOptions")(readOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RunQueryRequest]
  }
}

