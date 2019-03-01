package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var browser: Anon_Alarms
}

object Window {
  @scala.inline
  def apply(browser: Anon_Alarms): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("browser")(browser)
    __obj.asInstanceOf[Window]
  }
}

