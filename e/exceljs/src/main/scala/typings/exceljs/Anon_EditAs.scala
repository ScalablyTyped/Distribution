package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EditAs extends js.Object {
  var editAs: js.UndefOr[String] = js.undefined
}

object Anon_EditAs {
  @scala.inline
  def apply(editAs: String = null): Anon_EditAs = {
    val __obj = js.Dynamic.literal()
    if (editAs != null) __obj.updateDynamic("editAs")(editAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EditAs]
  }
}

