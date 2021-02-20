package typings.expoWebBrowser

import typings.expoWebBrowser.expoWebBrowserStrings.failed
import typings.expoWebBrowser.expoWebBrowserStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Message extends StObject {
    
    var message: String = js.native
    
    var `type`: success | failed = js.native
  }
  object Message {
    
    @scala.inline
    def apply(message: String, `type`: success | failed): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: success | failed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SkipRedirectCheck extends StObject {
    
    var skipRedirectCheck: js.UndefOr[Boolean] = js.native
  }
  object SkipRedirectCheck {
    
    @scala.inline
    def apply(): SkipRedirectCheck = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipRedirectCheck]
    }
    
    @scala.inline
    implicit class SkipRedirectCheckMutableBuilder[Self <: SkipRedirectCheck] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSkipRedirectCheck(value: Boolean): Self = StObject.set(x, "skipRedirectCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipRedirectCheckUndefined: Self = StObject.set(x, "skipRedirectCheck", js.undefined)
    }
  }
}
