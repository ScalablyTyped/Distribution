package typings.emailCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(email: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].apply(email.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def apply(email: String, options: EmailCheckOptions): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].apply(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("email-check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait EmailCheckOptions extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
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
