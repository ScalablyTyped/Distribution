package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object solutionBuilderMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/program/solution-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def invalidateSolutionBuilder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateSolutionBuilder")().asInstanceOf[Unit]
  inline def invalidateSolutionBuilder(withHost: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateSolutionBuilder")(withHost.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useSolutionBuilder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useSolutionBuilder")().asInstanceOf[Unit]
}
