package typings.forkTsCheckerWebpackPlugin

import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWorkerLibEmitMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/emit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def emitDtsIfNeeded(program: BuilderProgram): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitDtsIfNeeded")(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def emitDtsIfNeeded(program: Program): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitDtsIfNeeded")(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
