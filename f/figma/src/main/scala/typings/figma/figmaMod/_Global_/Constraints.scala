package typings.figma.figmaMod._Global_

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
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Constraints]
  }
}

