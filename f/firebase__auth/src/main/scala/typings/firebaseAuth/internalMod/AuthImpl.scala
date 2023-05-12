package typings.firebaseAuth.internalMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheckInteropTypes.mod.AppCheckInternalComponentName
import typings.firebaseAuth.distSrcModelAuthMod.ConfigInternal
import typings.firebaseAuth.firebaseAuthStrings.heartbeat
import typings.firebaseComponent.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/internal", "AuthImpl")
@js.native
open class AuthImpl protected ()
  extends typings.firebaseAuth.distInternalMod.AuthImpl {
  def this(
    app: FirebaseApp,
    heartbeatServiceProvider: Provider[heartbeat],
    appCheckServiceProvider: Provider[AppCheckInternalComponentName],
    config: ConfigInternal
  ) = this()
}
