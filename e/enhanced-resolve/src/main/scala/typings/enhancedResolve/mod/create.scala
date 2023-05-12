package typings.enhancedResolve.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object create {
  
  inline def apply(options: ResolveOptionsOptionalFS): ResolveFunctionAsync = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ResolveFunctionAsync]
  
  @JSImport("enhanced-resolve", "create")
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(options: ResolveOptionsOptionalFS): ResolveFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[ResolveFunction]
}
