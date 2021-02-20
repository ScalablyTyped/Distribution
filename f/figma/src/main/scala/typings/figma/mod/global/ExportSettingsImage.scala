package typings.figma.mod.global

import typings.figma.figmaStrings.JPG
import typings.figma.figmaStrings.PNG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSettingsImage extends ExportSettings {
  
  val constraint: js.UndefOr[ExportSettingsConstraints] = js.native
  
  val contentsOnly: js.UndefOr[Boolean] = js.native
  
  val format: JPG | PNG = js.native
  
  // defaults to true
  val suffix: js.UndefOr[String] = js.native
}
object ExportSettingsImage {
  
  @scala.inline
  def apply(format: JPG | PNG): ExportSettingsImage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsImage]
  }
  
  @scala.inline
  implicit class ExportSettingsImageMutableBuilder[Self <: ExportSettingsImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraint(value: ExportSettingsConstraints): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    @scala.inline
    def setContentsOnly(value: Boolean): Self = StObject.set(x, "contentsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsOnlyUndefined: Self = StObject.set(x, "contentsOnly", js.undefined)
    
    @scala.inline
    def setFormat(value: JPG | PNG): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
