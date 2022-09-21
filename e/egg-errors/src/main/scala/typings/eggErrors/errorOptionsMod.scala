package typings.eggErrors

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorOptionsMod {
  
  @JSImport("egg-errors/lib/error_options", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ErrorOptions {
    
    /* CompleteClass */
    var message: String = js.native
  }
  
  trait ErrorOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var code: js.UndefOr[String] = js.undefined
    
    var message: String
  }
  object ErrorOptions {
    
    inline def apply(message: String): ErrorOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorOptions]
    }
    
    extension [Self <: ErrorOptions](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
