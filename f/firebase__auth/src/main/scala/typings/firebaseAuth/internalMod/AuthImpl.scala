package typings.firebaseAuth.internalMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAuth.modelAuthMod.ConfigInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/cordova/internal", "AuthImpl")
@js.native
open class AuthImpl protected ()
  extends typings.firebaseAuth.authImplMod.AuthImpl {
  def this(
    app: FirebaseApp,
    heartbeatServiceProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<'heartbeat'> */ Any,
    config: ConfigInternal
  ) = this()
}
