package typings.emberRouting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Outlet extends js.Object {
  var outlet: js.UndefOr[String] = js.undefined
  var parentView: js.UndefOr[String] = js.undefined
}

object Outlet {
  @scala.inline
  def apply(outlet: String = null, parentView: String = null): Outlet = {
    val __obj = js.Dynamic.literal()
    if (outlet != null) __obj.updateDynamic("outlet")(outlet.asInstanceOf[js.Any])
    if (parentView != null) __obj.updateDynamic("parentView")(parentView.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outlet]
  }
}

