package typings.dumbPasswords

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Frequency extends StObject {
    
    var frequency: Double
    
    var message: js.UndefOr[String] = js.undefined
    
    var password: String
  }
  object Frequency {
    
    inline def apply(frequency: Double, password: String): Frequency = {
      val __obj = js.Dynamic.literal(frequency = frequency.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Frequency]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Frequency] (val x: Self) extends AnyVal {
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
}
