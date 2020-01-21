package typings.gapiClientScript.gapi.client

import typings.gapiClientScript.gapiClientScriptStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  /** Load Google Apps Script Execution API v1 */
  def apply(name: typings.gapiClientScript.gapiClientScriptStrings.script, version: v1): js.Thenable[Unit] = js.native
  def apply(
    name: typings.gapiClientScript.gapiClientScriptStrings.script,
    version: v1,
    callback: js.Function0[_]
  ): Unit = js.native
}

