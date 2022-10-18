package typings.forkTsCheckerWebpackPlugin

import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWorkerLibTracingMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/tracing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dumpTracingLegendIfNeeded(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dumpTracingLegendIfNeeded")().asInstanceOf[Unit]
  
  inline def startTracingIfNeeded(compilerOptions: CompilerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startTracingIfNeeded")(compilerOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stopTracingIfNeeded(program: BuilderProgram): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopTracingIfNeeded")(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def stopTracingIfNeeded(program: Program): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopTracingIfNeeded")(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
