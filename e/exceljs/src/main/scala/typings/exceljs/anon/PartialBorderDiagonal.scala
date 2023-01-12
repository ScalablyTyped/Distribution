package typings.exceljs.anon

import typings.exceljs.mod.BorderStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.BorderDiagonal> */
trait PartialBorderDiagonal extends StObject {
  
  var color: js.UndefOr[PartialColor] = js.undefined
  
  var down: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[BorderStyle] = js.undefined
  
  var up: js.UndefOr[Boolean] = js.undefined
}
object PartialBorderDiagonal {
  
  inline def apply(): PartialBorderDiagonal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBorderDiagonal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBorderDiagonal] (val x: Self) extends AnyVal {
    
    inline def setColor(value: PartialColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setStyle(value: BorderStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
