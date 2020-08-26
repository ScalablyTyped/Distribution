package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.performanceMod.Performance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/profile/TypeScriptPerformance", JSImport.Namespace)
@js.native
object typeScriptPerformanceMod extends js.Object {
  @js.native
  trait TypeScriptPerformance extends js.Object {
    def disable(): Unit = js.native
    def enable(): Unit = js.native
    def mark(name: String): Unit = js.native
    def measure(name: String): Unit = js.native
    def measure(name: String, startMark: js.UndefOr[scala.Nothing], endMark: String): Unit = js.native
    def measure(name: String, startMark: String): Unit = js.native
    def measure(name: String, startMark: String, endMark: String): Unit = js.native
  }
  
  def connectTypeScriptPerformance(performance: Performance): Performance = js.native
}

