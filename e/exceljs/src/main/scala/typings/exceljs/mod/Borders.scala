package typings.exceljs.mod

import typings.exceljs.anon.PartialBorder
import typings.exceljs.anon.PartialBorderDiagonal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Borders extends StObject {
  
  var bottom: PartialBorder
  
  var diagonal: PartialBorderDiagonal
  
  var left: PartialBorder
  
  var right: PartialBorder
  
  var top: PartialBorder
}
object Borders {
  
  inline def apply(
    bottom: PartialBorder,
    diagonal: PartialBorderDiagonal,
    left: PartialBorder,
    right: PartialBorder,
    top: PartialBorder
  ): Borders = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], diagonal = diagonal.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Borders] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: PartialBorder): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setDiagonal(value: PartialBorderDiagonal): Self = StObject.set(x, "diagonal", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: PartialBorder): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: PartialBorder): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: PartialBorder): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
