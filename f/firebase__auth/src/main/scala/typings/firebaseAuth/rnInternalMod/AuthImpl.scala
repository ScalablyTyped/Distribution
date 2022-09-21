package typings.firebaseAuth.rnInternalMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAuth.rnSrcModelAuthMod.ConfigInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/rn/internal", "AuthImpl")
@js.native
open class AuthImpl protected ()
  extends typings.firebaseAuth.rnSrcCoreAuthAuthImplMod.AuthImpl {
  def this(
    app: FirebaseApp,
    heartbeatServiceProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<'heartbeat'> */ Any,
    config: ConfigInternal
  ) = this()
}
