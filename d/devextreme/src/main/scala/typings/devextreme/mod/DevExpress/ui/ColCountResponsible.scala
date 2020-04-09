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
  def apply(lg: Int | Double = null, md: Int | Double = null, sm: Int | Double = null, xs: Int | Double = null): ColCountResponsible = {
    val __obj = js.Dynamic.literal()
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColCountResponsible]
  }
}

