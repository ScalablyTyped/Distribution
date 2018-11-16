package typings
package googleDashClosureDashCompilerLib.googleDashClosureDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compiler extends js.Object {
  var javaPath: java.lang.String = js.native
  var spawnOptions: ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def getFullCommand(): java.lang.String = js.native
  def logger(args: js.Any*): scala.Unit = js.native
  def run(): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def run(
    callback: js.Function3[
      /* exitCode */ scala.Double, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
}

