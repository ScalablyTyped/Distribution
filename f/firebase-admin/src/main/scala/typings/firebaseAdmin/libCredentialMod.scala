package typings.firebaseAdmin

import typings.firebaseAdmin.credentialMod.ServiceAccount
import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCredentialMod {
  
  object credential {
    
    @JSImport("firebase-admin/lib/credential", "credential")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof applicationDefaultFn` */
    inline def applicationDefault(): typings.firebaseAdmin.credentialMod.Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("applicationDefault")().asInstanceOf[typings.firebaseAdmin.credentialMod.Credential]
    inline def applicationDefault(httpAgent: Agent): typings.firebaseAdmin.credentialMod.Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("applicationDefault")(httpAgent.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.credentialMod.Credential]
    
    /* was `typeof certFn` */
    inline def cert(serviceAccountPathOrObject: String): typings.firebaseAdmin.credentialMod.Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.credentialMod.Credential]
    inline def cert(serviceAccountPathOrObject: String, httpAgent: Agent): typings.firebaseAdmin.credentialMod.Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAdmin.credentialMod.Credential]
    inline def cert(serviceAccountPathOrObject: ServiceAccount): typings.firebaseAdmin.credentialMod.Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.credentialMod.Credential]
    inline def cert(serviceAccountPathOrObject: ServiceAccount, httpAgent: Agent): typings.firebaseAdmin.credentialMod.Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAdmin.credentialMod.Credential]
    
    /* was `typeof refreshTokenFn` */
    inline def refreshToken(refreshTokenPathOrObject: String): typings.firebaseAdmin.credentialMod.Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.credentialMod.Credential]
    inline def refreshToken(refreshTokenPathOrObject: String, httpAgent: Agent): typings.firebaseAdmin.credentialMod.Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAdmin.credentialMod.Credential]
    inline def refreshToken(refreshTokenPathOrObject: js.Object): typings.firebaseAdmin.credentialMod.Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.credentialMod.Credential]
    inline def refreshToken(refreshTokenPathOrObject: js.Object, httpAgent: Agent): typings.firebaseAdmin.credentialMod.Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAdmin.credentialMod.Credential]
    
    /**
      * Interface that provides Google OAuth2 access tokens used to authenticate
      * with Firebase services.
      *
      * In most cases, you will not need to implement this yourself and can instead
      * use the default implementations provided by the `admin.credential` namespace.
      */
    type Credential = typings.firebaseAdmin.credentialMod.Credential
  }
}
