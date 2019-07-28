package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists values that specify the position relative to the target column in which a moved column should be placed.
  */
trait ASPxClientGridColumnMovingTargetPosition extends js.Object {
  /**
    * A moved column should be placed at the bottom of the target column.
    */
  var Bottom: Double
  /**
    * A moved column should be placed to the left of the target column.
    */
  var Left: Double
  /**
    * A moved column should be placed to the right of the target column.
    */
  var Right: Double
  /**
    * A moved column should be placed at the top of the target column.
    */
  var Top: Double
}

object ASPxClientGridColumnMovingTargetPosition {
  @scala.inline
  def apply(Bottom: Double, Left: Double, Right: Double, Top: Double): ASPxClientGridColumnMovingTargetPosition = {
    val __obj = js.Dynamic.literal(Bottom = Bottom, Left = Left, Right = Right, Top = Top)
  
    __obj.asInstanceOf[ASPxClientGridColumnMovingTargetPosition]
  }
}

