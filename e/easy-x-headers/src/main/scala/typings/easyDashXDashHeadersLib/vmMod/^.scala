package typings
package easyDashXDashHeadersLib.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createContext(): easyDashXDashHeadersLib.vmMod.Context = js.native
  def createContext(initSandbox: easyDashXDashHeadersLib.vmMod.Context): easyDashXDashHeadersLib.vmMod.Context = js.native
  def createScript(code: java.lang.String): easyDashXDashHeadersLib.vmMod.Script = js.native
  def createScript(code: java.lang.String, filename: java.lang.String): easyDashXDashHeadersLib.vmMod.Script = js.native
  def runInContext(code: java.lang.String, context: easyDashXDashHeadersLib.vmMod.Context): scala.Unit = js.native
  def runInContext(code: java.lang.String, context: easyDashXDashHeadersLib.vmMod.Context, filename: java.lang.String): scala.Unit = js.native
  def runInNewContext(code: java.lang.String): scala.Unit = js.native
  def runInNewContext(code: java.lang.String, sandbox: easyDashXDashHeadersLib.vmMod.Context): scala.Unit = js.native
  def runInNewContext(code: java.lang.String, sandbox: easyDashXDashHeadersLib.vmMod.Context, filename: java.lang.String): scala.Unit = js.native
  def runInThisContext(code: java.lang.String): scala.Unit = js.native
  def runInThisContext(code: java.lang.String, filename: java.lang.String): scala.Unit = js.native
}

