package typings.expoWebBrowser

import typings.expoWebBrowser.expoWebBrowserStrings.failed
import typings.expoWebBrowser.expoWebBrowserStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Message extends StObject {
    
    var message: String
    
    var `type`: success | failed
  }
  object Message {
    
    inline def apply(message: String, `type`: success | failed): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: success | failed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SkipRedirectCheck extends StObject {
    
    var skipRedirectCheck: js.UndefOr[Boolean] = js.undefined
  }
  object SkipRedirectCheck {
    
    inline def apply(): SkipRedirectCheck = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipRedirectCheck]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkipRedirectCheck] (val x: Self) extends AnyVal {
      
      inline def setSkipRedirectCheck(value: Boolean): Self = StObject.set(x, "skipRedirectCheck", value.asInstanceOf[js.Any])
      
      inline def setSkipRedirectCheckUndefined: Self = StObject.set(x, "skipRedirectCheck", js.undefined)
    }
  }
}
