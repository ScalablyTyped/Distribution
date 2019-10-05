package typings.flowdoc.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var h: Double
  var w: Double
}

object Size {
  @scala.inline
  def apply(h: Double, w: Double): Size = {
    val __obj = js.Dynamic.literal(h = h, w = w)
  
    __obj.asInstanceOf[Size]
  }
}

