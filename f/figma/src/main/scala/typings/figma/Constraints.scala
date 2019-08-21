package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraints extends js.Object {
  val horizontal: ConstraintType
  val vertical: ConstraintType
}

object Constraints {
  @scala.inline
  def apply(horizontal: ConstraintType, vertical: ConstraintType): Constraints = {
    val __obj = js.Dynamic.literal(horizontal = horizontal, vertical = vertical)
  
    __obj.asInstanceOf[Constraints]
  }
}

