package typings.devextreme.mod.DevExpress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PdfExportGanttFont extends StObject {
  
  /**
    * 
    */
  var fontObject: js.Object
  
  /**
    * 
    */
  var name: String
  
  /**
    * 
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var weight: js.UndefOr[String | Double] = js.undefined
}
object PdfExportGanttFont {
  
  inline def apply(fontObject: js.Object, name: String): PdfExportGanttFont = {
    val __obj = js.Dynamic.literal(fontObject = fontObject.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfExportGanttFont]
  }
  
  extension [Self <: PdfExportGanttFont](x: Self) {
    
    inline def setFontObject(value: js.Object): Self = StObject.set(x, "fontObject", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWeight(value: String | Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
