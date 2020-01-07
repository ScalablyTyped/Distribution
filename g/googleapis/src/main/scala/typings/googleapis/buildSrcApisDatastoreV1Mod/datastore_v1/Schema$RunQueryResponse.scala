package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Datastore.RunQuery.
  */
@js.native
trait Schema$RunQueryResponse extends js.Object {
  /**
    * A batch of query results (always present).
    */
  var batch: js.UndefOr[Schema$QueryResultBatch] = js.native
  /**
    * The parsed form of the `GqlQuery` from the request, if it was set.
    */
  var query: js.UndefOr[Schema$Query] = js.native
}

object Schema$RunQueryResponse {
  @scala.inline
  def apply(batch: Schema$QueryResultBatch = null, query: Schema$Query = null): Schema$RunQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (batch != null) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RunQueryResponse]
  }
}

