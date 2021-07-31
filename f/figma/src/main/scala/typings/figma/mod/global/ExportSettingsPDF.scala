package typings.figma.mod.global

import typings.figma.figmaStrings.PDF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSettingsPDF
  extends StObject
     with ExportSettings {
  
  val contentsOnly: js.UndefOr[Boolean] = js.undefined
  
  val format: PDF
  
  // defaults to true
  val suffix: js.UndefOr[String] = js.undefined
}
object ExportSettingsPDF {
  
  @scala.inline
  def apply(): ExportSettingsPDF = {
    val __obj = js.Dynamic.literal(format = "PDF")
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
