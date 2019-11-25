package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGB extends js.Object {
  val b: Double
  val g: Double
  val r: Double
}

object RGB {
  @scala.inline
  def apply(b: Double, g: Double, r: Double): RGB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RGB]
  }
}

