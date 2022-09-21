package typings.firebaseAuth.nodeInternalMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAuth.nodeSrcModelAuthMod.ConfigInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/node/internal", "AuthImpl")
@js.native
open class AuthImpl protected ()
  extends typings.firebaseAuth.nodeSrcCoreAuthAuthImplMod.AuthImpl {
  def this(
    app: FirebaseApp,
    heartbeatServiceProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<'heartbeat'> */ Any,
    config: ConfigInternal
  ) = this()
}
