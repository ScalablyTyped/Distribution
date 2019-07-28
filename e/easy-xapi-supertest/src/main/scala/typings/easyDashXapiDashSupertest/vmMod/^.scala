package typings.easyDashXapiDashSupertest.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createContext(): Context = js.native
  def createContext(initSandbox: Context): Context = js.native
  def createScript(code: String): Script = js.native
  def createScript(code: String, filename: String): Script = js.native
  def runInContext(code: String, context: Context): Unit = js.native
  def runInContext(code: String, context: Context, filename: String): Unit = js.native
  def runInNewContext(code: String): Unit = js.native
  def runInNewContext(code: String, sandbox: Context): Unit = js.native
  def runInNewContext(code: String, sandbox: Context, filename: String): Unit = js.native
  def runInThisContext(code: String): Unit = js.native
  def runInThisContext(code: String, filename: String): Unit = js.native
}

