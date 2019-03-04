package typings
package detectDashPointerLib.detectDashPointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectPointer extends js.Object {
  var anyCoarse: scala.Boolean
  var anyFine: scala.Boolean
  var anyNone: scala.Boolean
  var coarse: scala.Boolean
  var fine: scala.Boolean
  var none: scala.Boolean
  def update(): scala.Unit
}

object detectPointer {
  @scala.inline
  def apply(
    anyCoarse: scala.Boolean,
    anyFine: scala.Boolean,
    anyNone: scala.Boolean,
    coarse: scala.Boolean,
    fine: scala.Boolean,
    none: scala.Boolean,
    update: js.Function0[scala.Unit]
  ): detectPointer = {
    val __obj = js.Dynamic.literal(anyCoarse = anyCoarse, anyFine = anyFine, anyNone = anyNone, coarse = coarse, fine = fine, none = none, update = update)
  
    __obj.asInstanceOf[detectPointer]
  }
}

