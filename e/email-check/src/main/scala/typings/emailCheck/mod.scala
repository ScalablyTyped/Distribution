package typings.emailCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("email-check", JSImport.Namespace)
  @js.native
  def apply(email: String): js.Promise[Boolean] = js.native
  @JSImport("email-check", JSImport.Namespace)
  @js.native
  def apply(email: String, options: EmailCheckOptions): js.Promise[Boolean] = js.native
  
  @js.native
  trait EmailCheckOptions extends StObject {
    
    var from: js.UndefOr[String] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object EmailCheckOptions {
    
    @scala.inline
    def apply(): EmailCheckOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailCheckOptions]
    }
    
    @scala.inline
    implicit class EmailCheckOptionsMutableBuilder[Self <: EmailCheckOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
