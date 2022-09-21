package typings.fastify.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input[I] extends StObject {
  
  var input: I
}
object Input {
  
  inline def apply[I](input: I): Input[I] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input[I]]
  }
  
  extension [Self <: Input[?], I](x: Self & Input[I]) {
    
    inline def setInput(value: I): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
