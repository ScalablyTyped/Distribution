package typings.detectPointer.mod

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
    val __obj = js.Dynamic.literal(anyCoarse = anyCoarse.asInstanceOf[js.Any], anyFine = anyFine.asInstanceOf[js.Any], anyNone = anyNone.asInstanceOf[js.Any], coarse = coarse.asInstanceOf[js.Any], fine = fine.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[detectPointer]
  }
}

