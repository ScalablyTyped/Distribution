package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Borders extends StObject {
  
  var bottom: Border
  
  var left: Border
  
  var right: Border
  
  var top: Border
}
object Borders {
  
  inline def apply(bottom: Border, left: Border, right: Border, top: Border): Borders = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borders]
  }
  
  extension [Self <: Borders](x: Self) {
    
    inline def setBottom(value: Border): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Border): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Border): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Border): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
