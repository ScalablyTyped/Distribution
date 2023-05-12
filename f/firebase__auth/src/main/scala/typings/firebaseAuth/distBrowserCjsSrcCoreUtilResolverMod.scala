package typings.firebaseAuth

import typings.firebaseAuth.distBrowserCjsSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distBrowserCjsSrcModelPopupRedirectMod.PopupRedirectResolverInternal
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.PopupRedirectResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcCoreUtilResolverMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/core/util/resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withDefaultResolver(auth: AuthInternal): PopupRedirectResolverInternal = ^.asInstanceOf[js.Dynamic].applyDynamic("_withDefaultResolver")(auth.asInstanceOf[js.Any]).asInstanceOf[PopupRedirectResolverInternal]
  inline def withDefaultResolver(auth: AuthInternal, resolverOverride: PopupRedirectResolver): PopupRedirectResolverInternal = (^.asInstanceOf[js.Dynamic].applyDynamic("_withDefaultResolver")(auth.asInstanceOf[js.Any], resolverOverride.asInstanceOf[js.Any])).asInstanceOf[PopupRedirectResolverInternal]
}
