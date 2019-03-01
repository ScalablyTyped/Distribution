package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitResponse extends js.Object {
  /**
    * The number of index entries updated during the commit, or zero if none were
    * updated.
    */
  var indexUpdates: js.UndefOr[scala.Double] = js.undefined
  /**
    * The result of performing the mutations.
    * The i-th mutation result corresponds to the i-th mutation in the request.
    */
  var mutationResults: js.UndefOr[js.Array[MutationResult]] = js.undefined
}

object CommitResponse {
  @scala.inline
  def apply(indexUpdates: scala.Int | scala.Double = null, mutationResults: js.Array[MutationResult] = null): CommitResponse = {
    val __obj = js.Dynamic.literal()
    if (indexUpdates != null) __obj.updateDynamic("indexUpdates")(indexUpdates.asInstanceOf[js.Any])
    if (mutationResults != null) __obj.updateDynamic("mutationResults")(mutationResults)
    __obj.asInstanceOf[CommitResponse]
  }
}

