package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstraintMixin extends js.Object {
  var constraints: Constraints
}

object ConstraintMixin {
  @scala.inline
  def apply(constraints: Constraints): ConstraintMixin = {
    val __obj = js.Dynamic.literal(constraints = constraints)
  
    __obj.asInstanceOf[ConstraintMixin]
  }
}

