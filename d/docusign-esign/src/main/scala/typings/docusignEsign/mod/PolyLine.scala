package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolyLine extends StObject {
  
  var x1: js.UndefOr[String] = js.native
  
  var x2: js.UndefOr[String] = js.native
  
  var y1: js.UndefOr[String] = js.native
  
  var y2: js.UndefOr[String] = js.native
}
object PolyLine {
  
  @scala.inline
  def apply(): PolyLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolyLine]
  }
  
  @scala.inline
  implicit class PolyLineMutableBuilder[Self <: PolyLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX1(value: String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    @scala.inline
    def setX2(value: String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setY1(value: String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    @scala.inline
    def setY2(value: String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
