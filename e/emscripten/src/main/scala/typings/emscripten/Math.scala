package typings.emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  def imul(a: Double, b: Double): Double
}

object Math {
  @scala.inline
  def apply(imul: (Double, Double) => Double): Math = {
    val __obj = js.Dynamic.literal(imul = js.Any.fromFunction2(imul))
  
    __obj.asInstanceOf[Math]
  }
}

