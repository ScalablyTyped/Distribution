package typings.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBA extends js.Object {
  val a: Double
  val b: Double
  val g: Double
  val r: Double
}

object RGBA {
  @scala.inline
  def apply(a: Double, b: Double, g: Double, r: Double): RGBA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBA]
  }
}

