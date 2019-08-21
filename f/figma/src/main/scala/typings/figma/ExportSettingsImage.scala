package typings.figma

import typings.figma.figmaStrings.JPG
import typings.figma.figmaStrings.PNG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettingsImage extends ExportSettings {
  var constraint: js.UndefOr[ExportSettingsConstraints] = js.undefined
  var contentsOnly: js.UndefOr[Boolean] = js.undefined
  var format: JPG | PNG
      // defaults to true
  var suffix: js.UndefOr[String] = js.undefined
}

object ExportSettingsImage {
  @scala.inline
  def apply(
    format: JPG | PNG,
    constraint: ExportSettingsConstraints = null,
    contentsOnly: js.UndefOr[Boolean] = js.undefined,
    suffix: String = null
  ): ExportSettingsImage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (!js.isUndefined(contentsOnly)) __obj.updateDynamic("contentsOnly")(contentsOnly)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[ExportSettingsImage]
  }
}

