package typings.googleClosureCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compiler_ extends js.Object {
  var javaPath: String = js.native
  var spawnOptions: StringDictionary[String] = js.native
  def getFullCommand(): String = js.native
  def logger(args: js.Any*): Unit = js.native
  def run(): ChildProcess = js.native
  def run(callback: js.Function3[/* exitCode */ Double, /* stdout */ String, /* stderr */ String, Unit]): ChildProcess = js.native
}

