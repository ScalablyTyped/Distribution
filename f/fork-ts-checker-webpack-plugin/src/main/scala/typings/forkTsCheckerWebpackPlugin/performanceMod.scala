package typings.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/profile/Performance", JSImport.Namespace)
@js.native
object performanceMod extends js.Object {
  
  def createPerformance(): Performance = js.native
  
  @js.native
  trait Performance extends js.Object {
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def mark(name: String): Unit = js.native
    
    def markEnd(name: String): Unit = js.native
    
    def markStart(name: String): Unit = js.native
    
    def measure(name: String): Unit = js.native
    def measure(name: String, startMark: js.UndefOr[scala.Nothing], endMark: String): Unit = js.native
    def measure(name: String, startMark: String): Unit = js.native
    def measure(name: String, startMark: String, endMark: String): Unit = js.native
    
    def print(): Unit = js.native
  }
}
