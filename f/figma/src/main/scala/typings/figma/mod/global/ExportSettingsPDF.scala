package typings.figma.mod.global

import typings.figma.figmaStrings.PDF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSettingsPDF extends ExportSettings {
  
  val contentsOnly: js.UndefOr[Boolean] = js.native
  
  val format: PDF = js.native
  
  // defaults to true
  val suffix: js.UndefOr[String] = js.native
}
object ExportSettingsPDF {
  
  @scala.inline
  def apply(format: PDF): ExportSettingsPDF = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsPDF]
  }
  
  @scala.inline
  implicit class ExportSettingsPDFMutableBuilder[Self <: ExportSettingsPDF] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentsOnly(value: Boolean): Self = StObject.set(x, "contentsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsOnlyUndefined: Self = StObject.set(x, "contentsOnly", js.undefined)
    
    @scala.inline
    def setFormat(value: PDF): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
