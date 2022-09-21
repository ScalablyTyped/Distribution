package typings.firebaseAppCheckInteropTypes

import typings.firebaseAppCheckInteropTypes.firebaseAppCheckInteropTypesStrings.`app-check-internal`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type AppCheckInternalComponentName = `app-check-internal`
  
  type AppCheckTokenListener = js.Function1[/* token */ AppCheckTokenResult, Unit]
  
  // If the error field is defined, the token field will be populated with a dummy token
  trait AppCheckTokenResult extends StObject {
    
    val error: js.UndefOr[js.Error] = js.undefined
    
    val token: String
  }
  object AppCheckTokenResult {
    
    inline def apply(token: String): AppCheckTokenResult = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCheckTokenResult]
    }
    
    extension [Self <: AppCheckTokenResult](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FirebaseAppCheckInternal extends StObject {
    
    // Registers a listener to changes in the token state. There can be more than one listener
    // registered at the same time for one or more FirebaseAppAttestation instances. The
    // listeners call back on the UI thread whenever the current token associated with this
    // FirebaseAppAttestation changes.
    def addTokenListener(listener: AppCheckTokenListener): Unit = js.native
    
    // Get the current AttestationToken. Attaches to the most recent in-flight request if one
    // is present. Returns null if no token is present and no token requests are in-flight.
    def getToken(): js.Promise[AppCheckTokenResult] = js.native
    def getToken(forceRefresh: Boolean): js.Promise[AppCheckTokenResult] = js.native
    
    // Unregisters a listener to changes in the token state.
    def removeTokenListener(listener: AppCheckTokenListener): Unit = js.native
  }
  
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `app-check-internal`: FirebaseAppCheckInternal
    }
    object NameServiceMapping {
      
      inline def apply(`app-check-internal`: FirebaseAppCheckInternal): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("app-check-internal")(`app-check-internal`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def `setApp-check-internal`(value: FirebaseAppCheckInternal): Self = StObject.set(x, "app-check-internal", value.asInstanceOf[js.Any])
      }
    }
  }
}
