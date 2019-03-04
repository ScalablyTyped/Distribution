package typings
package devexpressDashWebLib

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
  var Bottom: scala.Double
  /**
    * A moved column should be placed to the left of the target column.
    */
  var Left: scala.Double
  /**
    * A moved column should be placed to the right of the target column.
    */
  var Right: scala.Double
  /**
    * A moved column should be placed at the top of the target column.
    */
  var Top: scala.Double
}

object ASPxClientGridColumnMovingTargetPosition {
  @scala.inline
  def apply(Bottom: scala.Double, Left: scala.Double, Right: scala.Double, Top: scala.Double): ASPxClientGridColumnMovingTargetPosition = {
    val __obj = js.Dynamic.literal(Bottom = Bottom, Left = Left, Right = Right, Top = Top)
  
    __obj.asInstanceOf[ASPxClientGridColumnMovingTargetPosition]
  }
}

