package typings.forkTsCheckerWebpackPlugin

import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWorkerLibTsbuildinfoMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/tsbuildinfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def emitTsBuildInfoIfNeeded(builderProgram: BuilderProgram): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitTsBuildInfoIfNeeded")(builderProgram.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getTsBuildInfoEmitPath(compilerOptions: CompilerOptions): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTsBuildInfoEmitPath")(compilerOptions.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def invalidateTsBuildInfo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateTsBuildInfo")().asInstanceOf[Unit]
}
