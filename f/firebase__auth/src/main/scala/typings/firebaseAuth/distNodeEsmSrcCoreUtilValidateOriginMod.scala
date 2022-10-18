package typings.firebaseAuth

import typings.firebaseAuth.distNodeEsmSrcModelAuthMod.AuthInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreUtilValidateOriginMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/core/util/validate_origin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateOrigin(auth: AuthInternal): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("_validateOrigin")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
