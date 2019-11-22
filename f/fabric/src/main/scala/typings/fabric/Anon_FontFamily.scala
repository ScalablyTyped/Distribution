package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamily extends js.Object {
  var fontFamily: String
  var fontSize: Double
  var fontStyle: String
  var fontWieght: String
}

object Anon_FontFamily {
  @scala.inline
  def apply(fontFamily: String, fontSize: Double, fontStyle: String, fontWieght: String): Anon_FontFamily = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily, fontSize = fontSize, fontStyle = fontStyle, fontWieght = fontWieght)
  
    __obj.asInstanceOf[Anon_FontFamily]
  }
}

