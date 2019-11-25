package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerAccess extends js.Object {
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.undefined
  /** List of Container permissions. */
  var permission: js.UndefOr[String] = js.undefined
}

object ContainerAccess {
  @scala.inline
  def apply(containerId: String = null, permission: String = null): ContainerAccess = {
    val __obj = js.Dynamic.literal()
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerAccess]
  }
}

