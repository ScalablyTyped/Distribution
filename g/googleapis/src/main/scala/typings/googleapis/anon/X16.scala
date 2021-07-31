package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X16 extends StObject {
  
  var x16: js.UndefOr[String] = js.undefined
  
  var x32: js.UndefOr[String] = js.undefined
}
object X16 {
  
  @scala.inline
  def apply(): X16 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X16]
  }
  
  @scala.inline
  implicit class X16MutableBuilder[Self <: X16] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX16(value: String): Self = StObject.set(x, "x16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX16Undefined: Self = StObject.set(x, "x16", js.undefined)
    
    @scala.inline
    def setX32(value: String): Self = StObject.set(x, "x32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX32Undefined: Self = StObject.set(x, "x32", js.undefined)
  }
}
