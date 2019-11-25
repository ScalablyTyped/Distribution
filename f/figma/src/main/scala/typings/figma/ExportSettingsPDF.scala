package typings.figma

import typings.figma.figmaStrings.PDF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettingsPDF extends ExportSettings {
  var contentsOnly: js.UndefOr[Boolean] = js.undefined
  var format: PDF
   // defaults to true
  var suffix: js.UndefOr[String] = js.undefined
}

object ExportSettingsPDF {
  @scala.inline
  def apply(format: PDF, contentsOnly: js.UndefOr[Boolean] = js.undefined, suffix: String = null): ExportSettingsPDF = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (!js.isUndefined(contentsOnly)) __obj.updateDynamic("contentsOnly")(contentsOnly.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsPDF]
  }
}

