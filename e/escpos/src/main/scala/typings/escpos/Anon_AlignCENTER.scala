package typings.escpos

import typings.escpos.escposStrings.CENTER
import typings.escpos.escposStrings.LEFT
import typings.escpos.escposStrings.RIGHT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignCENTER extends js.Object {
  var align: LEFT | CENTER | RIGHT
  var cols: Double
  var text: String
}

object Anon_AlignCENTER {
  @scala.inline
  def apply(align: LEFT | CENTER | RIGHT, cols: Double, text: String): Anon_AlignCENTER = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cols = cols, text = text)
  
    __obj.asInstanceOf[Anon_AlignCENTER]
  }
}

