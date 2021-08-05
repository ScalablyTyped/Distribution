package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Typeofts
import typings.forkTsCheckerWebpackPlugin.performanceMod.Performance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptPerformanceMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/profile/TypeScriptPerformance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectTypeScriptPerformance(typescript: Typeofts, performance: Performance): Performance = (^.asInstanceOf[js.Dynamic].applyDynamic("connectTypeScriptPerformance")(typescript.asInstanceOf[js.Any], performance.asInstanceOf[js.Any])).asInstanceOf[Performance]
  
  @js.native
  trait TypeScriptPerformance extends StObject {
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def mark(name: String): Unit = js.native
    
    def measure(name: String): Unit = js.native
    def measure(name: String, startMark: String): Unit = js.native
    def measure(name: String, startMark: String, endMark: String): Unit = js.native
    def measure(name: String, startMark: Unit, endMark: String): Unit = js.native
  }
}
