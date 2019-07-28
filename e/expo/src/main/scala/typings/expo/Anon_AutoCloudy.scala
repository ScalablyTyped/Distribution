package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoCloudy extends js.Object {
  var auto: String
  var cloudy: String
  var fluorescent: String
  var incandescent: String
  var shadow: String
  var sunny: String
}

object Anon_AutoCloudy {
  @scala.inline
  def apply(
    auto: String,
    cloudy: String,
    fluorescent: String,
    incandescent: String,
    shadow: String,
    sunny: String
  ): Anon_AutoCloudy = {
    val __obj = js.Dynamic.literal(auto = auto, cloudy = cloudy, fluorescent = fluorescent, incandescent = incandescent, shadow = shadow, sunny = sunny)
  
    __obj.asInstanceOf[Anon_AutoCloudy]
  }
}

