package typings.figma.mod.global

import typings.figma.figmaStrings.PDF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettingsPDF extends ExportSettings {
  val contentsOnly: js.UndefOr[Boolean] = js.undefined
  val format: PDF
   // defaults to true
  val suffix: js.UndefOr[String] = js.undefined
}

object ExportSettingsPDF {
  @scala.inline
  def apply(format: PDF, contentsOnly: js.UndefOr[Boolean] = js.undefined, suffix: String = null): ExportSettingsPDF = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (!js.isUndefined(contentsOnly)) __obj.updateDynamic("contentsOnly")(contentsOnly.get.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsPDF]
  }
}

