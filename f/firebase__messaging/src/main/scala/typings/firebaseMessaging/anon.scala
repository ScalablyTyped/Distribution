package typings.firebaseMessaging

import typings.firebaseMessaging.mod.FirebaseApp
import typings.firebaseMessagingTypes.mod.FirebaseMessaging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ApplicationPubKey extends StObject {
    
    var applicationPubKey: js.UndefOr[String] = js.native
    
    var auth: String = js.native
    
    var endpoint: String = js.native
    
    var p256dh: String = js.native
  }
  object ApplicationPubKey {
    
    @scala.inline
    def apply(auth: String, endpoint: String, p256dh: String): ApplicationPubKey = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationPubKey]
    }
    
    @scala.inline
    implicit class ApplicationPubKeyMutableBuilder[Self <: ApplicationPubKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationPubKey(value: String): Self = StObject.set(x, "applicationPubKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationPubKeyUndefined: Self = StObject.set(x, "applicationPubKey", js.undefined)
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP256dh(value: String): Self = StObject.set(x, "p256dh", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BrowserErrorMessage extends StObject {
    
    var browserErrorMessage: String = js.native
  }
  object BrowserErrorMessage {
    
    @scala.inline
    def apply(browserErrorMessage: String): BrowserErrorMessage = {
      val __obj = js.Dynamic.literal(browserErrorMessage = browserErrorMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserErrorMessage]
    }
    
    @scala.inline
    implicit class BrowserErrorMessageMutableBuilder[Self <: BrowserErrorMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserErrorMessage(value: String): Self = StObject.set(x, "browserErrorMessage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(): FirebaseMessaging = js.native
    def apply(app: FirebaseApp): FirebaseMessaging = js.native
    
    def isSupported(): Boolean = js.native
  }
  
  @js.native
  trait ErrorInfo extends StObject {
    
    var errorInfo: String = js.native
  }
  object ErrorInfo {
    
    @scala.inline
    def apply(errorInfo: String): ErrorInfo = {
      val __obj = js.Dynamic.literal(errorInfo = errorInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorInfo]
    }
    
    @scala.inline
    implicit class ErrorInfoMutableBuilder[Self <: ErrorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorInfo(value: String): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Message extends StObject {
    
    var message: String = js.native
  }
  object Message {
    
    @scala.inline
    def apply(message: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServiceWorkerRegistration extends StObject {
    
    var serviceWorkerRegistration: js.UndefOr[typings.std.ServiceWorkerRegistration] = js.native
    
    var vapidKey: js.UndefOr[String] = js.native
  }
  object ServiceWorkerRegistration {
    
    @scala.inline
    def apply(): ServiceWorkerRegistration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceWorkerRegistration]
    }
    
    @scala.inline
    implicit class ServiceWorkerRegistrationMutableBuilder[Self <: ServiceWorkerRegistration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServiceWorkerRegistration(value: typings.std.ServiceWorkerRegistration): Self = StObject.set(x, "serviceWorkerRegistration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceWorkerRegistrationUndefined: Self = StObject.set(x, "serviceWorkerRegistration", js.undefined)
      
      @scala.inline
      def setVapidKey(value: String): Self = StObject.set(x, "vapidKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVapidKeyUndefined: Self = StObject.set(x, "vapidKey", js.undefined)
    }
  }
  
  @js.native
  trait ValueName extends StObject {
    
    var valueName: String = js.native
  }
  object ValueName {
    
    @scala.inline
    def apply(valueName: String): ValueName = {
      val __obj = js.Dynamic.literal(valueName = valueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueName]
    }
    
    @scala.inline
    implicit class ValueNameMutableBuilder[Self <: ValueName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValueName(value: String): Self = StObject.set(x, "valueName", value.asInstanceOf[js.Any])
    }
  }
}
