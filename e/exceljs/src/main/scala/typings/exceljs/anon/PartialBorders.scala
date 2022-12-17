package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Borders> */
trait PartialBorders extends StObject {
  
  var bottom: js.UndefOr[PartialBorder] = js.undefined
  
  var diagonal: js.UndefOr[PartialBorderDiagonal] = js.undefined
  
  var left: js.UndefOr[PartialBorder] = js.undefined
  
  var right: js.UndefOr[PartialBorder] = js.undefined
  
  var top: js.UndefOr[PartialBorder] = js.undefined
}
object PartialBorders {
  
  inline def apply(): PartialBorders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBorders]
  }
  
  extension [Self <: PartialBorders](x: Self) {
    
    inline def setBottom(value: PartialBorder): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setDiagonal(value: PartialBorderDiagonal): Self = StObject.set(x, "diagonal", value.asInstanceOf[js.Any])
    
    inline def setDiagonalUndefined: Self = StObject.set(x, "diagonal", js.undefined)
    
    inline def setLeft(value: PartialBorder): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: PartialBorder): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: PartialBorder): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
