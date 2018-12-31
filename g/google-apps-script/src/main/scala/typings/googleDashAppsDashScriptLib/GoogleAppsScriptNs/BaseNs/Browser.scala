package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  var Buttons: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Base.ButtonSet */ js.Any = js.native
  def inputBox(prompt: java.lang.String): java.lang.String = js.native
  def inputBox(prompt: java.lang.String, buttons: ButtonSet): java.lang.String = js.native
  def inputBox(title: java.lang.String, prompt: java.lang.String, buttons: ButtonSet): java.lang.String = js.native
  def msgBox(prompt: java.lang.String): java.lang.String = js.native
  def msgBox(prompt: java.lang.String, buttons: ButtonSet): java.lang.String = js.native
  def msgBox(title: java.lang.String, prompt: java.lang.String, buttons: ButtonSet): java.lang.String = js.native
}

