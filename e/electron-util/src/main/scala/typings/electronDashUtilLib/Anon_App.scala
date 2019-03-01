package typings
package electronDashUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var BrowserWindow: js.Any
  var app: js.Any
  var dialog: js.Any
}

object Anon_App {
  @scala.inline
  def apply(BrowserWindow: js.Any, app: js.Any, dialog: js.Any): Anon_App = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BrowserWindow")(BrowserWindow)
    __obj.updateDynamic("app")(app)
    __obj.updateDynamic("dialog")(dialog)
    __obj.asInstanceOf[Anon_App]
  }
}

