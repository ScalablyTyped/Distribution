package typings.googleGax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFinish extends js.Object {
  def finish(): js.Array[js.Object]
}

object AnonFinish {
  @scala.inline
  def apply(finish: () => js.Array[js.Object]): AnonFinish = {
    val __obj = js.Dynamic.literal(finish = js.Any.fromFunction0(finish))
  
    __obj.asInstanceOf[AnonFinish]
  }
}

