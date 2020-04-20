package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTl extends js.Object {
  var bl: AnonX
  var br: AnonX
  var tl: AnonX
  var tr: AnonX
}

object AnonTl {
  @scala.inline
  def apply(bl: AnonX, br: AnonX, tl: AnonX, tr: AnonX): AnonTl = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTl]
  }
}

