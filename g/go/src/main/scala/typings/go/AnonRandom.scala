package typings.go

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRandom extends js.Object {
  def random(): Double
}

object AnonRandom {
  @scala.inline
  def apply(random: () => Double): AnonRandom = {
    val __obj = js.Dynamic.literal(random = js.Any.fromFunction0(random))
  
    __obj.asInstanceOf[AnonRandom]
  }
}

