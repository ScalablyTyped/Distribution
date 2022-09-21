package typings.firebaseAuth

import typings.firebaseAuth.rnSrcModelAuthMod.AuthInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rnSrcCoreUtilValidateOriginMod {
  
  @JSImport("@firebase/auth/dist/rn/src/core/util/validate_origin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateOrigin(auth: AuthInternal): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("_validateOrigin")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
