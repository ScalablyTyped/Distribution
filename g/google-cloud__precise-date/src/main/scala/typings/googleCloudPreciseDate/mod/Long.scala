package typings.googleCloudPreciseDate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Long extends js.Object {
  def toNumber(): Double
}

object Long {
  @scala.inline
  def apply(toNumber: () => Double): Long = {
    val __obj = js.Dynamic.literal(toNumber = js.Any.fromFunction0(toNumber))
  
    __obj.asInstanceOf[Long]
  }
}

