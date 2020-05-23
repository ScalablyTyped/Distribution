package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColCountResponsible extends js.Object {
  /** @name ColCountResponsible.lg */
  var lg: js.UndefOr[Double] = js.undefined
  /** @name ColCountResponsible.md */
  var md: js.UndefOr[Double] = js.undefined
  /** @name ColCountResponsible.sm */
  var sm: js.UndefOr[Double] = js.undefined
  /** @name ColCountResponsible.xs */
  var xs: js.UndefOr[Double] = js.undefined
}

object ColCountResponsible {
  @scala.inline
  def apply(
    lg: js.UndefOr[Double] = js.undefined,
    md: js.UndefOr[Double] = js.undefined,
    sm: js.UndefOr[Double] = js.undefined,
    xs: js.UndefOr[Double] = js.undefined
  ): ColCountResponsible = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lg)) __obj.updateDynamic("lg")(lg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(md)) __obj.updateDynamic("md")(md.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sm)) __obj.updateDynamic("sm")(sm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xs)) __obj.updateDynamic("xs")(xs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColCountResponsible]
  }
}

