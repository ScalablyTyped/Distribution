package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object performanceMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/profile/Performance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPerformance(): Performance = ^.asInstanceOf[js.Dynamic].applyDynamic("createPerformance")().asInstanceOf[Performance]
  
  @js.native
  trait Performance extends StObject {
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def mark(name: String): Unit = js.native
    
    def markEnd(name: String): Unit = js.native
    
    def markStart(name: String): Unit = js.native
    
    def measure(name: String): Unit = js.native
    def measure(name: String, startMark: String): Unit = js.native
    def measure(name: String, startMark: String, endMark: String): Unit = js.native
    def measure(name: String, startMark: Unit, endMark: String): Unit = js.native
    
    def print(): Unit = js.native
  }
}
