package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Protection> */
trait PartialProtection extends js.Object {
  var locked: js.UndefOr[Boolean] = js.undefined
}

object PartialProtection {
  @scala.inline
  def apply(locked: js.UndefOr[Boolean] = js.undefined): PartialProtection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialProtection]
  }
}

