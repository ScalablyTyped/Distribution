package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseInstallationsStrings.`app-offline`
import typings.firebaseInstallations.firebaseInstallationsStrings.`delete-pending-registration`
import typings.firebaseInstallations.firebaseInstallationsStrings.`installation-not-found`
import typings.firebaseInstallations.firebaseInstallationsStrings.`missing-app-config-values`
import typings.firebaseInstallations.firebaseInstallationsStrings.`not-registered`
import typings.firebaseInstallations.firebaseInstallationsStrings.`request-failed`
import typings.firebaseUtil.mod.ErrorFactory
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcUtilErrorsMod {
  
  @JSImport("@firebase/installations/dist/esm/src/util/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/installations/dist/esm/src/util/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[ErrorCode, ErrorParams] = js.native
  
  inline def isServerError(error: Any): /* is @firebase/installations.@firebase/installations/dist/esm/src/util/errors.ServerError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isServerError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/installations.@firebase/installations/dist/esm/src/util/errors.ServerError */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseInstallations.firebaseInstallationsStrings.`missing-app-config-values`
    - typings.firebaseInstallations.firebaseInstallationsStrings.`not-registered`
    - typings.firebaseInstallations.firebaseInstallationsStrings.`installation-not-found`
    - typings.firebaseInstallations.firebaseInstallationsStrings.`request-failed`
    - typings.firebaseInstallations.firebaseInstallationsStrings.`app-offline`
    - typings.firebaseInstallations.firebaseInstallationsStrings.`delete-pending-registration`
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    inline def APP_OFFLINE: `app-offline` = "app-offline".asInstanceOf[`app-offline`]
    
    inline def DELETE_PENDING_REGISTRATION: `delete-pending-registration` = "delete-pending-registration".asInstanceOf[`delete-pending-registration`]
    
    inline def INSTALLATION_NOT_FOUND: `installation-not-found` = "installation-not-found".asInstanceOf[`installation-not-found`]
    
    inline def MISSING_APP_CONFIG_VALUES: `missing-app-config-values` = "missing-app-config-values".asInstanceOf[`missing-app-config-values`]
    
    inline def NOT_REGISTERED: `not-registered` = "not-registered".asInstanceOf[`not-registered`]
    
    inline def REQUEST_FAILED: `request-failed` = "request-failed".asInstanceOf[`request-failed`]
  }
  
  @js.native
  trait ErrorParams extends StObject
  
  @js.native
  trait ServerError extends FirebaseError {
    
    @JSName("customData")
    var customData_ServerError: ServerErrorData = js.native
  }
  
  trait ServerErrorData extends StObject {
    
    var serverCode: Double
    
    var serverMessage: String
    
    var serverStatus: String
  }
  object ServerErrorData {
    
    inline def apply(serverCode: Double, serverMessage: String, serverStatus: String): ServerErrorData = {
      val __obj = js.Dynamic.literal(serverCode = serverCode.asInstanceOf[js.Any], serverMessage = serverMessage.asInstanceOf[js.Any], serverStatus = serverStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerErrorData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerErrorData] (val x: Self) extends AnyVal {
      
      inline def setServerCode(value: Double): Self = StObject.set(x, "serverCode", value.asInstanceOf[js.Any])
      
      inline def setServerMessage(value: String): Self = StObject.set(x, "serverMessage", value.asInstanceOf[js.Any])
      
      inline def setServerStatus(value: String): Self = StObject.set(x, "serverStatus", value.asInstanceOf[js.Any])
    }
  }
}
