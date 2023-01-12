package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolyLine extends StObject {
  
  var x1: js.UndefOr[String] = js.undefined
  
  var x2: js.UndefOr[String] = js.undefined
  
  var y1: js.UndefOr[String] = js.undefined
  
  var y2: js.UndefOr[String] = js.undefined
}
object PolyLine {
  
  inline def apply(): PolyLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolyLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolyLine] (val x: Self) extends AnyVal {
    
    inline def setX1(value: String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    inline def setX2(value: String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    inline def setY1(value: String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    inline def setY2(value: String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
