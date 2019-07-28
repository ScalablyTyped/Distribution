package typings.gapiDotClientDotScript.gapiNs.clientNs

import typings.gapiDotClientDotScript.gapiDotClientDotScriptStrings.script
import typings.gapiDotClientDotScript.gapiDotClientDotScriptStrings.v1
import typings.gapiDotClientDotScript.gapiNs.clientNs.scriptNs.ScriptsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val scripts: ScriptsResource = js.native
  /** Load Google Apps Script Execution API v1 */
  def load(name: script, version: v1): js.Thenable[Unit] = js.native
  def load(name: script, version: v1, callback: js.Function0[_]): Unit = js.native
}

