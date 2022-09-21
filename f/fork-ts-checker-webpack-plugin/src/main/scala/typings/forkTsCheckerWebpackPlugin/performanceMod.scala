package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object performanceMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/performance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disablePerformanceIfNeeded(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disablePerformanceIfNeeded")().asInstanceOf[Unit]
  
  inline def enablePerformanceIfNeeded(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enablePerformanceIfNeeded")().asInstanceOf[Unit]
  
  inline def printPerformanceMeasuresIfNeeded(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printPerformanceMeasuresIfNeeded")().asInstanceOf[Unit]
}
