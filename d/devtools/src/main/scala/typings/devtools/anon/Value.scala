package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var elementId: String
  
  var `using`: String
  
  var value: String
}
object Value {
  
  @scala.inline
  def apply(elementId: String, `using`: String, value: String): Value = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("using")(`using`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsing(value: String): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
