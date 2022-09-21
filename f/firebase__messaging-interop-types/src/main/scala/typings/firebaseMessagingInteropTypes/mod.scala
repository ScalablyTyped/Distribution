package typings.firebaseMessagingInteropTypes

import typings.firebaseMessagingInteropTypes.firebaseMessagingInteropTypesStrings.`messaging-internal`
import typings.std.ServiceWorkerRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait GetTokenOptions extends StObject {
    
    var serviceWorkerRegistration: js.UndefOr[ServiceWorkerRegistration] = js.undefined
    
    var vapidKey: js.UndefOr[String] = js.undefined
  }
  object GetTokenOptions {
    
    inline def apply(): GetTokenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTokenOptions]
    }
    
    extension [Self <: GetTokenOptions](x: Self) {
      
      inline def setServiceWorkerRegistration(value: ServiceWorkerRegistration): Self = StObject.set(x, "serviceWorkerRegistration", value.asInstanceOf[js.Any])
      
      inline def setServiceWorkerRegistrationUndefined: Self = StObject.set(x, "serviceWorkerRegistration", js.undefined)
      
      inline def setVapidKey(value: String): Self = StObject.set(x, "vapidKey", value.asInstanceOf[js.Any])
      
      inline def setVapidKeyUndefined: Self = StObject.set(x, "vapidKey", js.undefined)
    }
  }
  
  @js.native
  trait MessagingInternal extends StObject {
    
    def getToken(): js.Promise[String] = js.native
    def getToken(options: GetTokenOptions): js.Promise[String] = js.native
  }
  
  type MessagingInternalComponentName = `messaging-internal`
  
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `messaging-internal`: MessagingInternal
    }
    object NameServiceMapping {
      
      inline def apply(`messaging-internal`: MessagingInternal): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("messaging-internal")(`messaging-internal`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def `setMessaging-internal`(value: MessagingInternal): Self = StObject.set(x, "messaging-internal", value.asInstanceOf[js.Any])
      }
    }
  }
}
