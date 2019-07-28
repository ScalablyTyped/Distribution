package typings.gapiDotClientDotTagmanager.gapiNs.clientNs.tagmanagerNs

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
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (permission != null) __obj.updateDynamic("permission")(permission)
    __obj.asInstanceOf[ContainerAccess]
  }
}

