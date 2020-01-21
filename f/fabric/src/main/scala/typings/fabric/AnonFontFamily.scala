package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFontFamily extends js.Object {
  var fontFamily: String
  var fontSize: Double
  var fontStyle: String
  var fontWieght: String
}

object AnonFontFamily {
  @scala.inline
  def apply(fontFamily: String, fontSize: Double, fontStyle: String, fontWieght: String): AnonFontFamily = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWieght = fontWieght.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFontFamily]
  }
}

