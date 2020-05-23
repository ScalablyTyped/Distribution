package typings.gapiClientScript

import typings.gapiClientScript.gapi.client.script.ScriptsResource
import typings.gapiClientScript.gapiClientScriptStrings.script
import typings.gapiClientScript.gapiClientScriptStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val scripts: ScriptsResource = js.native
      /** Load Google Apps Script Execution API v1 */
      def load(name: script, version: v1): js.Thenable[Unit] = js.native
      def load(name: script, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

