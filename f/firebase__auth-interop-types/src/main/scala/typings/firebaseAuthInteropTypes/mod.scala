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
    
    @scala.inline
    def apply(accessToken: String): FirebaseAuthTokenData = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseAuthTokenData]
    }
    
    @scala.inline
    implicit class FirebaseAuthTokenDataMutableBuilder[Self <: FirebaseAuthTokenData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    }
  }
  
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `auth-internal`: FirebaseAuthInternal
    }
    object NameServiceMapping {
      
      @scala.inline
      def apply(`auth-internal`: FirebaseAuthInternal): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("auth-internal")(`auth-internal`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit class NameServiceMappingMutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        @scala.inline
        def `setAuth-internal`(value: FirebaseAuthInternal): Self = StObject.set(x, "auth-internal", value.asInstanceOf[js.Any])
      }
    }
  }
}
