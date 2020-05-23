package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tl extends js.Object {
  var bl: X
  var br: X
  var tl: X
  var tr: X
}

object Tl {
  @scala.inline
  def apply(bl: X, br: X, tl: X, tr: X): Tl = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tl]
  }
}

