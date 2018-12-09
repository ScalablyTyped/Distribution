package typings
package gapiDotClientDotScriptLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val scripts: gapiDotClientDotScriptLib.gapiNs.clientNs.scriptNs.ScriptsResource = js.native
  /** Load Google Apps Script Execution API v1 */
  def load(
    name: gapiDotClientDotScriptLib.gapiDotClientDotScriptLibStrings.script,
    version: gapiDotClientDotScriptLib.gapiDotClientDotScriptLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotScriptLib.gapiDotClientDotScriptLibStrings.script,
    version: gapiDotClientDotScriptLib.gapiDotClientDotScriptLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

