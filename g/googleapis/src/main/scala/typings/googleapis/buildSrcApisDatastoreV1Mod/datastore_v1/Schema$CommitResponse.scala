package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Datastore.Commit.
  */
@js.native
trait Schema$CommitResponse extends js.Object {
  /**
    * The number of index entries updated during the commit, or zero if none
    * were updated.
    */
  var indexUpdates: js.UndefOr[Double] = js.native
  /**
    * The result of performing the mutations. The i-th mutation result
    * corresponds to the i-th mutation in the request.
    */
  var mutationResults: js.UndefOr[js.Array[Schema$MutationResult]] = js.native
}

object Schema$CommitResponse {
  @scala.inline
  def apply(indexUpdates: Int | Double = null, mutationResults: js.Array[Schema$MutationResult] = null): Schema$CommitResponse = {
    val __obj = js.Dynamic.literal()
    if (indexUpdates != null) __obj.updateDynamic("indexUpdates")(indexUpdates.asInstanceOf[js.Any])
    if (mutationResults != null) __obj.updateDynamic("mutationResults")(mutationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CommitResponse]
  }
}

