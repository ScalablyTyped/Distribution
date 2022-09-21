package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object programMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/program/program", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def invalidateProgram(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateProgram")().asInstanceOf[Unit]
  inline def invalidateProgram(withHost: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateProgram")(withHost.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useProgram(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useProgram")().asInstanceOf[Unit]
}
