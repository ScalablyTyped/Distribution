package typings.figlet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Defaults_ extends js.Object {
  var font: Fonts_
  var fontPath: String
}

object Defaults_ {
  @scala.inline
  def apply(font: Fonts_, fontPath: String): Defaults_ = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], fontPath = fontPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaults_]
  }
}

