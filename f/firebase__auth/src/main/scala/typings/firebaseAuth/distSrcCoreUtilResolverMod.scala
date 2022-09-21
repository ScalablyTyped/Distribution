package typings.firebaseAuth

import typings.firebaseAuth.distSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distSrcModelPopupRedirectMod.PopupRedirectResolverInternal
import typings.firebaseAuth.distSrcModelPublicTypesMod.PopupRedirectResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreUtilResolverMod {
  
  @JSImport("@firebase/auth/dist/src/core/util/resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withDefaultResolver(auth: AuthInternal): PopupRedirectResolverInternal = ^.asInstanceOf[js.Dynamic].applyDynamic("_withDefaultResolver")(auth.asInstanceOf[js.Any]).asInstanceOf[PopupRedirectResolverInternal]
  inline def withDefaultResolver(auth: AuthInternal, resolverOverride: PopupRedirectResolver): PopupRedirectResolverInternal = (^.asInstanceOf[js.Dynamic].applyDynamic("_withDefaultResolver")(auth.asInstanceOf[js.Any], resolverOverride.asInstanceOf[js.Any])).asInstanceOf[PopupRedirectResolverInternal]
}
