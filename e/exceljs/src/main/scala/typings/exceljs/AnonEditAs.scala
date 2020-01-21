package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEditAs extends js.Object {
  var editAs: js.UndefOr[String] = js.undefined
}

object AnonEditAs {
  @scala.inline
  def apply(editAs: String = null): AnonEditAs = {
    val __obj = js.Dynamic.literal()
    if (editAs != null) __obj.updateDynamic("editAs")(editAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEditAs]
  }
}

