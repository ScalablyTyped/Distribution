package typings
package fullcalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonIcons extends js.Object {
  var buttonIcons: Anon_Next
  var header: Anon_Center
  var themeButtonIcons: Anon_NextNextYear
}

object Anon_ButtonIcons {
  @scala.inline
  def apply(buttonIcons: Anon_Next, header: Anon_Center, themeButtonIcons: Anon_NextNextYear): Anon_ButtonIcons = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttonIcons")(buttonIcons)
    __obj.updateDynamic("header")(header)
    __obj.updateDynamic("themeButtonIcons")(themeButtonIcons)
    __obj.asInstanceOf[Anon_ButtonIcons]
  }
}

