package typings
package easyDashXapiDashSupertestLib.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createContext(): Context = js.native
  def createContext(initSandbox: Context): Context = js.native
  def createScript(code: java.lang.String): Script = js.native
  def createScript(code: java.lang.String, filename: java.lang.String): Script = js.native
  def runInContext(code: java.lang.String, context: Context): scala.Unit = js.native
  def runInContext(code: java.lang.String, context: Context, filename: java.lang.String): scala.Unit = js.native
  def runInNewContext(code: java.lang.String): scala.Unit = js.native
  def runInNewContext(code: java.lang.String, sandbox: Context): scala.Unit = js.native
  def runInNewContext(code: java.lang.String, sandbox: Context, filename: java.lang.String): scala.Unit = js.native
  def runInThisContext(code: java.lang.String): scala.Unit = js.native
  def runInThisContext(code: java.lang.String, filename: java.lang.String): scala.Unit = js.native
}

