package typings.firebaseAuth.distEsm5InternalMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAuth.distEsm5SrcModelAuthMod.ConfigInternal
import typings.firebaseAuth.firebaseAuthStrings.heartbeat
import typings.firebaseComponent.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/esm5/internal", "AuthImpl")
@js.native
open class AuthImpl protected ()
  extends typings.firebaseAuth.distEsm5SrcCoreAuthAuthImplMod.AuthImpl {
  def this(app: FirebaseApp, heartbeatServiceProvider: Provider[heartbeat], config: ConfigInternal) = this()
}
