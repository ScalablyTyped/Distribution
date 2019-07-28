package typings.durandal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalRelativeRouteSettings extends js.Object {
  var dynamicHash: js.UndefOr[String] = js.undefined
  var fromParent: js.UndefOr[Boolean] = js.undefined
  var moduleId: js.UndefOr[String] = js.undefined
  var route: js.UndefOr[String] = js.undefined
}

object DurandalRelativeRouteSettings {
  @scala.inline
  def apply(
    dynamicHash: String = null,
    fromParent: js.UndefOr[Boolean] = js.undefined,
    moduleId: String = null,
    route: String = null
  ): DurandalRelativeRouteSettings = {
    val __obj = js.Dynamic.literal()
    if (dynamicHash != null) __obj.updateDynamic("dynamicHash")(dynamicHash)
    if (!js.isUndefined(fromParent)) __obj.updateDynamic("fromParent")(fromParent)
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId)
    if (route != null) __obj.updateDynamic("route")(route)
    __obj.asInstanceOf[DurandalRelativeRouteSettings]
  }
}

