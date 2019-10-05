package typings.googleDashAppsDashScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  var Buttons: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonSet */ js.Any = js.native
  def inputBox(prompt: String): String = js.native
  def inputBox(prompt: String, buttons: ButtonSet): String = js.native
  def inputBox(title: String, prompt: String, buttons: ButtonSet): String = js.native
  def msgBox(prompt: String): String = js.native
  def msgBox(prompt: String, buttons: ButtonSet): String = js.native
  def msgBox(title: String, prompt: String, buttons: ButtonSet): String = js.native
}

