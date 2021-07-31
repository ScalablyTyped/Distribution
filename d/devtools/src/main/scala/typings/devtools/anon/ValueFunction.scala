package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueFunction extends StObject {
  
  var value: js.Function
}
object ValueFunction {
  
  @scala.inline
  def apply(value: js.Function): ValueFunction = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueFunction]
  }
  
  @scala.inline
  implicit class ValueFunctionMutableBuilder[Self <: ValueFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Function): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
