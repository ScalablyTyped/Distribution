package typings.enhancedResolve.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResolverFactory {
  
  @JSImport("enhanced-resolve", "ResolverFactory")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("enhanced-resolve", "ResolverFactory.createResolver")
  @js.native
  def createResolver: js.Function1[/* options */ UserResolveOptions, Resolver] = js.native
  inline def createResolver_=(x: js.Function1[/* options */ UserResolveOptions, Resolver]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createResolver")(x.asInstanceOf[js.Any])
}
