package typings.go

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Random extends js.Object {
  def random(): Double
}

object Anon_Random {
  @scala.inline
  def apply(random: () => Double): Anon_Random = {
    val __obj = js.Dynamic.literal(random = js.Any.fromFunction0(random))
  
    __obj.asInstanceOf[Anon_Random]
  }
}

