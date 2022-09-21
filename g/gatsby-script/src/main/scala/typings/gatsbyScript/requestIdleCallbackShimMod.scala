package typings.gatsbyScript

import typings.std.IdleRequestCallback
import typings.std.IdleRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestIdleCallbackShimMod {
  
  @JSImport("gatsby-script/dist/request-idle-callback-shim", "requestIdleCallback")
  @js.native
  val requestIdleCallback: (js.Function2[
    /* callback */ IdleRequestCallback, 
    /* options */ js.UndefOr[IdleRequestOptions], 
    Double
  ]) & (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.requestIdleCallback */ Any) = js.native
}
