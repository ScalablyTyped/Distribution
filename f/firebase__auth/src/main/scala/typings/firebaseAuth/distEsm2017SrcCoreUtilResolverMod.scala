package typings.firebaseAuth

import typings.firebaseAuth.distEsm2017SrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distEsm2017SrcModelPopupRedirectMod.PopupRedirectResolverInternal
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.PopupRedirectResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcCoreUtilResolverMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/core/util/resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withDefaultResolver(auth: AuthInternal): PopupRedirectResolverInternal = ^.asInstanceOf[js.Dynamic].applyDynamic("_withDefaultResolver")(auth.asInstanceOf[js.Any]).asInstanceOf[PopupRedirectResolverInternal]
  inline def withDefaultResolver(auth: AuthInternal, resolverOverride: PopupRedirectResolver): PopupRedirectResolverInternal = (^.asInstanceOf[js.Dynamic].applyDynamic("_withDefaultResolver")(auth.asInstanceOf[js.Any], resolverOverride.asInstanceOf[js.Any])).asInstanceOf[PopupRedirectResolverInternal]
}
