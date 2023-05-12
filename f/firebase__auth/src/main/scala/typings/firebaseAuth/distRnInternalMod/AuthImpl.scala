package typings.firebaseAuth.distRnInternalMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheckInteropTypes.mod.AppCheckInternalComponentName
import typings.firebaseAuth.distRnSrcModelAuthMod.ConfigInternal
import typings.firebaseAuth.firebaseAuthStrings.heartbeat
import typings.firebaseComponent.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/rn/internal", "AuthImpl")
@js.native
open class AuthImpl protected ()
  extends typings.firebaseAuth.distRnSrcCoreAuthAuthImplMod.AuthImpl {
  def this(
    app: FirebaseApp,
    heartbeatServiceProvider: Provider[heartbeat],
    appCheckServiceProvider: Provider[AppCheckInternalComponentName],
    config: ConfigInternal
  ) = this()
}
