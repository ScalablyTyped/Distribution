package typings.firebaseAuth

import typings.firebaseAuth.firebaseAuthStrings.`auth-internal`
import typings.firebaseAuth.firebaseAuthStrings.auth
import typings.firebaseAuth.rnSrcCoreUtilVersionMod.ClientPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rnSrcCoreAuthRegisterMod {
  
  @JSImport("@firebase/auth/dist/rn/src/core/auth/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerAuth(clientPlatform: ClientPlatform): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAuth")(clientPlatform.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.firebaseAuthStrings.auth
    - typings.firebaseAuth.firebaseAuthStrings.`auth-internal`
  */
  trait ComponentName extends StObject
  object ComponentName {
    
    inline def AUTH: auth = "auth".asInstanceOf[auth]
    
    inline def AUTH_INTERNAL: `auth-internal` = "auth-internal".asInstanceOf[`auth-internal`]
  }
}
