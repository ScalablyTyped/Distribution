package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client point object.
  */
trait ASPxClientPoint extends js.Object {
  /**
    * Gets the point's X-coordinate.
    */
  def GetX(): Double
  /**
    * Gets the point's Y-coordinate.
    */
  def GetY(): Double
}

object ASPxClientPoint {
  @scala.inline
  def apply(GetX: () => Double, GetY: () => Double): ASPxClientPoint = {
    val __obj = js.Dynamic.literal(GetX = js.Any.fromFunction0(GetX), GetY = js.Any.fromFunction0(GetY))
  
    __obj.asInstanceOf[ASPxClientPoint]
  }
}

