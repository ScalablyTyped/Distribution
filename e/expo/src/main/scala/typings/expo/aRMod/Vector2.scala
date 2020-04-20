package typings.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vector2 extends js.Object {
  var x: Double
  var y: Double
}

object Vector2 {
  @scala.inline
  def apply(x: Double, y: Double): Vector2 = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vector2]
  }
}

