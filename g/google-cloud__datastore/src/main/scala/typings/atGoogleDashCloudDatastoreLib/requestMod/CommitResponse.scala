package typings
package atGoogleDashCloudDatastoreLib.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitResponse extends js.Object {
  var indexUpdates: scala.Double
  var mutationResults: js.Array[MutationResult]
}

object CommitResponse {
  @scala.inline
  def apply(indexUpdates: scala.Double, mutationResults: js.Array[MutationResult]): CommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("indexUpdates")(indexUpdates)
    __obj.updateDynamic("mutationResults")(mutationResults)
    __obj.asInstanceOf[CommitResponse]
  }
}

