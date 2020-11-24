package typings.googleClosureCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compiler_ extends js.Object {
  
  def getFullCommand(): String = js.native
  
  var javaPath: String = js.native
  
  def logger(args: js.Any*): Unit = js.native
  
  def run(): ChildProcess = js.native
  def run(callback: js.Function3[/* exitCode */ Double, /* stdout */ String, /* stderr */ String, Unit]): ChildProcess = js.native
  
  var spawnOptions: StringDictionary[String] = js.native
}
