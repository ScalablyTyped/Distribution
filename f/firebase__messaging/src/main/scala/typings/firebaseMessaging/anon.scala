package typings.firebaseMessaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ApplicationPubKey extends StObject {
    
    var applicationPubKey: js.UndefOr[String] = js.undefined
    
    var auth: String
    
    var endpoint: String
    
    var p256dh: String
  }
  object ApplicationPubKey {
    
    inline def apply(auth: String, endpoint: String, p256dh: String): ApplicationPubKey = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationPubKey]
    }
    
    extension [Self <: ApplicationPubKey](x: Self) {
      
      inline def setApplicationPubKey(value: String): Self = StObject.set(x, "applicationPubKey", value.asInstanceOf[js.Any])
      
      inline def setApplicationPubKeyUndefined: Self = StObject.set(x, "applicationPubKey", js.undefined)
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setP256dh(value: String): Self = StObject.set(x, "p256dh", value.asInstanceOf[js.Any])
    }
  }
  
  trait BrowserErrorMessage extends StObject {
    
    var browserErrorMessage: String
  }
  object BrowserErrorMessage {
    
    inline def apply(browserErrorMessage: String): BrowserErrorMessage = {
      val __obj = js.Dynamic.literal(browserErrorMessage = browserErrorMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserErrorMessage]
    }
    
    extension [Self <: BrowserErrorMessage](x: Self) {
      
      inline def setBrowserErrorMessage(value: String): Self = StObject.set(x, "browserErrorMessage", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorInfo extends StObject {
    
    var errorInfo: String
  }
  object ErrorInfo {
    
    inline def apply(errorInfo: String): ErrorInfo = {
      val __obj = js.Dynamic.literal(errorInfo = errorInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorInfo]
    }
    
    extension [Self <: ErrorInfo](x: Self) {
      
      inline def setErrorInfo(value: String): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var message: String
  }
  object Message {
    
    inline def apply(message: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueName extends StObject {
    
    var valueName: String
  }
  object ValueName {
    
    inline def apply(valueName: String): ValueName = {
      val __obj = js.Dynamic.literal(valueName = valueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueName]
    }
    
    extension [Self <: ValueName](x: Self) {
      
      inline def setValueName(value: String): Self = StObject.set(x, "valueName", value.asInstanceOf[js.Any])
    }
  }
}
