package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColCountResponsible extends js.Object {
  /** The count of columns for a large screen size. */
  var lg: js.UndefOr[Double] = js.undefined
  /** The count of columns for a middle-sized screen. */
  var md: js.UndefOr[Double] = js.undefined
  /** The count of columns for a small-sized screen. */
  var sm: js.UndefOr[Double] = js.undefined
  /** The count of columns for an extra small-sized screen. */
  var xs: js.UndefOr[Double] = js.undefined
}

object ColCountResponsible {
  @scala.inline
  def apply(lg: Int | Double = null, md: Int | Double = null, sm: Int | Double = null, xs: Int | Double = null): ColCountResponsible = {
    val __obj = js.Dynamic.literal()
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColCountResponsible]
  }
}

