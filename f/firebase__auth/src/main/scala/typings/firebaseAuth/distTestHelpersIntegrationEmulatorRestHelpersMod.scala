package typings.firebaseAuth

import typings.firebaseAuth.anon.LocalId
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTestHelpersIntegrationEmulatorRestHelpersMod {
  
  @JSImport("@firebase/auth/dist/test/helpers/integration/emulator_rest_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAnonAccount(): js.Promise[LocalId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnonAccount")().asInstanceOf[js.Promise[LocalId]]
  
  inline def getOobCodes(): js.Promise[js.Array[OobCodeSession]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOobCodes")().asInstanceOf[js.Promise[js.Array[OobCodeSession]]]
  
  inline def getPhoneVerificationCodes(): js.Promise[Record[String, VerificationSession]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPhoneVerificationCodes")().asInstanceOf[js.Promise[Record[String, VerificationSession]]]
  
  inline def resetEmulator(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resetEmulator")().asInstanceOf[js.Promise[Unit]]
  
  trait OobCodeSession extends StObject {
    
    var email: String
    
    var oobCode: String
    
    var oobLink: String
    
    var requestType: String
  }
  object OobCodeSession {
    
    inline def apply(email: String, oobCode: String, oobLink: String, requestType: String): OobCodeSession = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], oobCode = oobCode.asInstanceOf[js.Any], oobLink = oobLink.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any])
      __obj.asInstanceOf[OobCodeSession]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OobCodeSession] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
      
      inline def setOobLink(value: String): Self = StObject.set(x, "oobLink", value.asInstanceOf[js.Any])
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    }
  }
  
  trait VerificationSession extends StObject {
    
    var code: String
    
    var phoneNumber: String
    
    var sessionInfo: String
  }
  object VerificationSession {
    
    inline def apply(code: String, phoneNumber: String, sessionInfo: String): VerificationSession = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], sessionInfo = sessionInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationSession]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerificationSession] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    }
  }
}
