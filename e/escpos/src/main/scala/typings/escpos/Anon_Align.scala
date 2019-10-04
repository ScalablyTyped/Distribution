package typings.escpos

import typings.escpos.escposStrings.CENTER
import typings.escpos.escposStrings.LEFT
import typings.escpos.escposStrings.RIGHT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: LEFT | CENTER | RIGHT
  var text: String
  var width: Double
}

object Anon_Align {
  @scala.inline
  def apply(align: LEFT | CENTER | RIGHT, text: String, width: Double): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], text = text, width = width)
  
    __obj.asInstanceOf[Anon_Align]
  }
}

