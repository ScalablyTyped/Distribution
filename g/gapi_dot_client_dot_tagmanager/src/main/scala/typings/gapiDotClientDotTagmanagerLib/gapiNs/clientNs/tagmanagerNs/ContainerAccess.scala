package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerAccess extends js.Object {
  /** GTM Container ID. */
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  /** List of Container permissions. */
  var permission: js.UndefOr[java.lang.String] = js.undefined
}

object ContainerAccess {
  @scala.inline
  def apply(containerId: java.lang.String = null, permission: java.lang.String = null): ContainerAccess = {
    val __obj = js.Dynamic.literal()
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (permission != null) __obj.updateDynamic("permission")(permission)
    __obj.asInstanceOf[ContainerAccess]
  }
}

