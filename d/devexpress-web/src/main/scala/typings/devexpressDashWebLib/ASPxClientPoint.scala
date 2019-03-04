package typings
package devexpressDashWebLib

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
  def GetX(): scala.Double
  /**
    * Gets the point's Y-coordinate.
    */
  def GetY(): scala.Double
}

object ASPxClientPoint {
  @scala.inline
  def apply(GetX: js.Function0[scala.Double], GetY: js.Function0[scala.Double]): ASPxClientPoint = {
    val __obj = js.Dynamic.literal(GetX = GetX, GetY = GetY)
  
    __obj.asInstanceOf[ASPxClientPoint]
  }
}

