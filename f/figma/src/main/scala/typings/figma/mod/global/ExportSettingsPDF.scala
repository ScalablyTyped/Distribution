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
  
  inline def apply(): ExportSettingsPDF = {
    val __obj = js.Dynamic.literal(format = "PDF")
    __obj.asInstanceOf[ExportSettingsPDF]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportSettingsPDF] (val x: Self) extends AnyVal {
    
    inline def setContentsOnly(value: Boolean): Self = StObject.set(x, "contentsOnly", value.asInstanceOf[js.Any])
    
    inline def setContentsOnlyUndefined: Self = StObject.set(x, "contentsOnly", js.undefined)
    
    inline def setFormat(value: PDF): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
