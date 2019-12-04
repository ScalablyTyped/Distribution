package typings.flatpickr.distTypesGlobalsMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  def fp_incr(n: Double): Date
}

object Date {
  @scala.inline
  def apply(fp_incr: Double => Date): Date = {
    val __obj = js.Dynamic.literal(fp_incr = js.Any.fromFunction1(fp_incr))
  
    __obj.asInstanceOf[Date]
  }
}

