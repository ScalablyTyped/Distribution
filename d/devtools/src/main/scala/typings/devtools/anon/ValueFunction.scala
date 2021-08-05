package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueFunction extends StObject {
  
  var value: js.Function
}
object ValueFunction {
  
  inline def apply(value: js.Function): ValueFunction = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueFunction]
  }
  
  extension [Self <: ValueFunction](x: Self) {
    
    inline def setValue(value: js.Function): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
