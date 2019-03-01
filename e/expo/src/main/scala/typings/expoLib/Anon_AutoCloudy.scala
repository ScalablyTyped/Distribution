package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoCloudy extends js.Object {
  var auto: java.lang.String
  var cloudy: java.lang.String
  var fluorescent: java.lang.String
  var incandescent: java.lang.String
  var shadow: java.lang.String
  var sunny: java.lang.String
}

object Anon_AutoCloudy {
  @scala.inline
  def apply(
    auto: java.lang.String,
    cloudy: java.lang.String,
    fluorescent: java.lang.String,
    incandescent: java.lang.String,
    shadow: java.lang.String,
    sunny: java.lang.String
  ): Anon_AutoCloudy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auto")(auto)
    __obj.updateDynamic("cloudy")(cloudy)
    __obj.updateDynamic("fluorescent")(fluorescent)
    __obj.updateDynamic("incandescent")(incandescent)
    __obj.updateDynamic("shadow")(shadow)
    __obj.updateDynamic("sunny")(sunny)
    __obj.asInstanceOf[Anon_AutoCloudy]
  }
}

