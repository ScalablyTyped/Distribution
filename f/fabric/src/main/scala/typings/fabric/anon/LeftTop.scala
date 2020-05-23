package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeftTop extends js.Object {
  var left: Double
  var top: Double
}

object LeftTop {
  @scala.inline
  def apply(left: Double, top: Double): LeftTop = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftTop]
  }
}

