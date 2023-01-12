package typings.firebaseAuthInteropTypes

import typings.firebaseAuthInteropTypes.firebaseAuthInteropTypesStrings.`auth-internal`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait FirebaseAuthInternal extends StObject {
    
    def addAuthTokenListener(fn: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
    
    def getToken(): js.Promise[FirebaseAuthTokenData | Null] = js.native
    def getToken(refreshToken: Boolean): js.Promise[FirebaseAuthTokenData | Null] = js.native
    
    def getUid(): String | Null = js.native
    
    def removeAuthTokenListener(fn: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
  }
  
  type FirebaseAuthInternalName = `auth-internal`
  
  trait FirebaseAuthTokenData extends StObject {
    
    var accessToken: String
  }
  object FirebaseAuthTokenData {
    
    inline def apply(accessToken: String): FirebaseAuthTokenData = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseAuthTokenData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirebaseAuthTokenData] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `auth-internal`: FirebaseAuthInternal
    }
    object NameServiceMapping {
      
      inline def apply(`auth-internal`: FirebaseAuthInternal): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("auth-internal")(`auth-internal`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        inline def `setAuth-internal`(value: FirebaseAuthInternal): Self = StObject.set(x, "auth-internal", value.asInstanceOf[js.Any])
      }
    }
  }
}
