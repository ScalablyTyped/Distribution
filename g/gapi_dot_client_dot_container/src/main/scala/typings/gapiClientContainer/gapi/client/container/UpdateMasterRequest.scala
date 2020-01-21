package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMasterRequest extends js.Object {
  /**
    * The Kubernetes version to change the master to. The only valid value is the
    * latest supported version. Use "-" to have the server automatically select
    * the latest version.
    */
  var masterVersion: js.UndefOr[String] = js.undefined
}

object UpdateMasterRequest {
  @scala.inline
  def apply(masterVersion: String = null): UpdateMasterRequest = {
    val __obj = js.Dynamic.literal()
    if (masterVersion != null) __obj.updateDynamic("masterVersion")(masterVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMasterRequest]
  }
}

