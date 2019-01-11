package typings
package easyDashXapiDashSupertestLib.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createContext(): easyDashXapiDashSupertestLib.vmMod.Context = js.native
  def createContext(initSandbox: easyDashXapiDashSupertestLib.vmMod.Context): easyDashXapiDashSupertestLib.vmMod.Context = js.native
  def createScript(code: java.lang.String): easyDashXapiDashSupertestLib.vmMod.Script = js.native
  def createScript(code: java.lang.String, filename: java.lang.String): easyDashXapiDashSupertestLib.vmMod.Script = js.native
  def runInContext(code: java.lang.String, context: easyDashXapiDashSupertestLib.vmMod.Context): scala.Unit = js.native
  def runInContext(
    code: java.lang.String,
    context: easyDashXapiDashSupertestLib.vmMod.Context,
    filename: java.lang.String
  ): scala.Unit = js.native
  def runInNewContext(code: java.lang.String): scala.Unit = js.native
  def runInNewContext(code: java.lang.String, sandbox: easyDashXapiDashSupertestLib.vmMod.Context): scala.Unit = js.native
  def runInNewContext(
    code: java.lang.String,
    sandbox: easyDashXapiDashSupertestLib.vmMod.Context,
    filename: java.lang.String
  ): scala.Unit = js.native
  def runInThisContext(code: java.lang.String): scala.Unit = js.native
  def runInThisContext(code: java.lang.String, filename: java.lang.String): scala.Unit = js.native
}

