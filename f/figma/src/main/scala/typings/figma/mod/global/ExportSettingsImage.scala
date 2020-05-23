package typings.figma.mod.global

import typings.figma.figmaStrings.JPG
import typings.figma.figmaStrings.PNG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettingsImage extends ExportSettings {
  val constraint: js.UndefOr[ExportSettingsConstraints] = js.undefined
  val contentsOnly: js.UndefOr[Boolean] = js.undefined
  val format: JPG | PNG
   // defaults to true
  val suffix: js.UndefOr[String] = js.undefined
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
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (!js.isUndefined(contentsOnly)) __obj.updateDynamic("contentsOnly")(contentsOnly.get.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsImage]
  }
}

