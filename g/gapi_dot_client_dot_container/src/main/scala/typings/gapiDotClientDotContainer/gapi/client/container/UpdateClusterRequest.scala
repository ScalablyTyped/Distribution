package typings.gapiDotClientDotContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClusterRequest extends js.Object {
  /** A description of the update. */
  var update: js.UndefOr[ClusterUpdate] = js.undefined
}

object UpdateClusterRequest {
  @scala.inline
  def apply(update: ClusterUpdate = null): UpdateClusterRequest = {
    val __obj = js.Dynamic.literal()
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterRequest]
  }
}

