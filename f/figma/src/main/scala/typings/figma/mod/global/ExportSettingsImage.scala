package typings.figma.mod.global

import typings.figma.figmaStrings.JPG
import typings.figma.figmaStrings.PNG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSettingsImage
  extends StObject
     with ExportSettings {
  
  val constraint: js.UndefOr[ExportSettingsConstraints] = js.undefined
  
  val contentsOnly: js.UndefOr[Boolean] = js.undefined
  
  val format: JPG | PNG
  
  // defaults to true
  val suffix: js.UndefOr[String] = js.undefined
}
object ExportSettingsImage {
  
  inline def apply(format: JPG | PNG): ExportSettingsImage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsImage]
  }
  
  extension [Self <: ExportSettingsImage](x: Self) {
    
    inline def setConstraint(value: ExportSettingsConstraints): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    inline def setContentsOnly(value: Boolean): Self = StObject.set(x, "contentsOnly", value.asInstanceOf[js.Any])
    
    inline def setContentsOnlyUndefined: Self = StObject.set(x, "contentsOnly", js.undefined)
    
    inline def setFormat(value: JPG | PNG): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
