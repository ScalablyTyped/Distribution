package typings.emailCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(email: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].apply(email.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def apply(email: String, options: EmailCheckOptions): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].apply(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("email-check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait EmailCheckOptions extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object EmailCheckOptions {
    
    inline def apply(): EmailCheckOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailCheckOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmailCheckOptions] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
