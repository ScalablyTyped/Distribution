package typings.dv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Textline extends js.Object {
  var box: Box
}

object Textline {
  @scala.inline
  def apply(box: Box): Textline = {
    val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any])
    __obj.asInstanceOf[Textline]
  }
}

