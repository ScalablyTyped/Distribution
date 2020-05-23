package typings.go.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Random extends js.Object {
  def random(): Double
}

object Random {
  @scala.inline
  def apply(random: () => Double): Random = {
    val __obj = js.Dynamic.literal(random = js.Any.fromFunction0(random))
    __obj.asInstanceOf[Random]
  }
}

