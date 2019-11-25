package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vector extends js.Object {
  val x: Double
  val y: Double
}

object Vector {
  @scala.inline
  def apply(x: Double, y: Double): Vector = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Vector]
  }
}

