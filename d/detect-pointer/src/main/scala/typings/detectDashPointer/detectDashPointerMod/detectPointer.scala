package typings.detectDashPointer.detectDashPointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectPointer extends js.Object {
  var anyCoarse: Boolean
  var anyFine: Boolean
  var anyNone: Boolean
  var coarse: Boolean
  var fine: Boolean
  var none: Boolean
  def update(): Unit
}

object detectPointer {
  @scala.inline
  def apply(
    anyCoarse: Boolean,
    anyFine: Boolean,
    anyNone: Boolean,
    coarse: Boolean,
    fine: Boolean,
    none: Boolean,
    update: () => Unit
  ): detectPointer = {
    val __obj = js.Dynamic.literal(anyCoarse = anyCoarse, anyFine = anyFine, anyNone = anyNone, coarse = coarse, fine = fine, none = none, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[detectPointer]
  }
}

