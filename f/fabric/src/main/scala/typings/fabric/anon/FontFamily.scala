package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFamily extends js.Object {
  var fontFamily: String
  var fontSize: Double
  var fontStyle: String
  var fontWieght: String
}

object FontFamily {
  @scala.inline
  def apply(fontFamily: String, fontSize: Double, fontStyle: String, fontWieght: String): FontFamily = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWieght = fontWieght.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamily]
  }
}

