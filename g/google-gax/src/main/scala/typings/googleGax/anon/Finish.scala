package typings.googleGax.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Finish extends js.Object {
  def finish(): js.Array[js.Object]
}

object Finish {
  @scala.inline
  def apply(finish: () => js.Array[js.Object]): Finish = {
    val __obj = js.Dynamic.literal(finish = js.Any.fromFunction0(finish))
    __obj.asInstanceOf[Finish]
  }
}

