package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Col extends StObject {
  
  var col: js.UndefOr[Double] = js.undefined
  
  var colspan: js.UndefOr[Double] = js.undefined
  
  var row: js.UndefOr[Double] = js.undefined
  
  var rowspan: js.UndefOr[Double] = js.undefined
  
  var screen: js.UndefOr[String] = js.undefined
}
object Col {
  
  inline def apply(): Col = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Col]
  }
  
  extension [Self <: Col](x: Self) {
    
    inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setColUndefined: Self = StObject.set(x, "col", js.undefined)
    
    inline def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
    
    inline def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setRowspan(value: Double): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
    
    inline def setRowspanUndefined: Self = StObject.set(x, "rowspan", js.undefined)
    
    inline def setScreen(value: String): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
  }
}
