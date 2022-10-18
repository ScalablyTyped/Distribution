package typings.firebaseAuth.distNodeEsmInternalMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAuth.distNodeEsmSrcModelAuthMod.ConfigInternal
import typings.firebaseAuth.firebaseAuthStrings.heartbeat
import typings.firebaseComponent.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/node-esm/internal", "AuthImpl")
@js.native
open class AuthImpl protected ()
  extends typings.firebaseAuth.distNodeEsmSrcCoreAuthAuthImplMod.AuthImpl {
  def this(app: FirebaseApp, heartbeatServiceProvider: Provider[heartbeat], config: ConfigInternal) = this()
}
