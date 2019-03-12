package typings
package emscriptenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  def imul(a: scala.Double, b: scala.Double): scala.Double
}

object Math {
  @scala.inline
  def apply(imul: (scala.Double, scala.Double) => scala.Double): Math = {
    val __obj = js.Dynamic.literal(imul = js.Any.fromFunction2(imul))
  
    __obj.asInstanceOf[Math]
  }
}

