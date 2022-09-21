package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object watchProgramMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/program/watch-program", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def invalidateWatchProgram(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateWatchProgram")().asInstanceOf[Unit]
  inline def invalidateWatchProgram(withHost: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateWatchProgram")(withHost.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def invalidateWatchProgramRootFileNames(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateWatchProgramRootFileNames")().asInstanceOf[Unit]
  
  inline def useWatchProgram(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatchProgram")().asInstanceOf[Unit]
}
