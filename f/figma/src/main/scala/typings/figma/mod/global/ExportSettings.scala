package typings.figma.mod.global

import typings.figma.figmaStrings.JPG
import typings.figma.figmaStrings.PNG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.figma.mod.global.ExportSettingsImage
  - typings.figma.mod.global.ExportSettingsSVG
  - typings.figma.mod.global.ExportSettingsPDF
*/
trait ExportSettings extends StObject
object ExportSettings {
  
  @scala.inline
  def ExportSettingsImage(format: JPG | PNG): typings.figma.mod.global.ExportSettingsImage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.mod.global.ExportSettingsImage]
  }
  
  @scala.inline
  def ExportSettingsPDF(): typings.figma.mod.global.ExportSettingsPDF = {
    val __obj = js.Dynamic.literal(format = "PDF")
    __obj.asInstanceOf[typings.figma.mod.global.ExportSettingsPDF]
  }
  
  @scala.inline
  def ExportSettingsSVG(): typings.figma.mod.global.ExportSettingsSVG = {
    val __obj = js.Dynamic.literal(format = "SVG")
    __obj.asInstanceOf[typings.figma.mod.global.ExportSettingsSVG]
  }
}
