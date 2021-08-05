package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Increment extends StObject {
  
  var increment: Double
}
object Increment {
  
  inline def apply(increment: Double): Increment = {
    val __obj = js.Dynamic.literal(increment = increment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Increment]
  }
  
  extension [Self <: Increment](x: Self) {
    
    inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
  }
}
