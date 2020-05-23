package typings.escpos.anon

import typings.escpos.escposStrings.CENTER
import typings.escpos.escposStrings.LEFT
import typings.escpos.escposStrings.RIGHT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cols extends js.Object {
  var align: LEFT | CENTER | RIGHT
  var cols: Double
  var text: String
}

object Cols {
  @scala.inline
  def apply(align: LEFT | CENTER | RIGHT, cols: Double, text: String): Cols = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cols]
  }
}

