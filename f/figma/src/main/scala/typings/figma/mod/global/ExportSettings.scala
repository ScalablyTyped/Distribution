package typings.figma.mod.global

import typings.figma.figmaStrings.JPG
import typings.figma.figmaStrings.PDF
import typings.figma.figmaStrings.PNG
import typings.figma.figmaStrings.SVG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.figma.mod.global.ExportSettingsImage
  - typings.figma.mod.global.ExportSettingsSVG
  - typings.figma.mod.global.ExportSettingsPDF
*/
trait ExportSettings extends js.Object

object ExportSettings {
  @scala.inline
  def ExportSettingsImage(format: JPG | PNG): ExportSettings = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettings]
  }
  @scala.inline
  def ExportSettingsSVG(format: SVG): ExportSettings = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettings]
  }
  @scala.inline
  def ExportSettingsPDF(format: PDF): ExportSettings = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettings]
  }
}

