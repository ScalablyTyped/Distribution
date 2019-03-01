package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client rectangle object.
  */
trait ASPxClientRect extends js.Object {
  /**
    * Gets the Y-coordinate of the rectangle's bottom edge.
    */
  def GetBottom(): scala.Double
  /**
    * Gets the rectangle's height.
    */
  def GetHeight(): scala.Double
  /**
    * Gets the X-coordinate of the rectangle's left edge.
    */
  def GetLeft(): scala.Double
  /**
    * Gets the X-coordinate of the rectangle's right edge.
    */
  def GetRight(): scala.Double
  /**
    * Gets the Y-coordinate of the rectangle's top edge.
    */
  def GetTop(): scala.Double
  /**
    * Gets the rectangle's width.
    */
  def GetWidth(): scala.Double
}

object ASPxClientRect {
  @scala.inline
  def apply(
    GetBottom: js.Function0[scala.Double],
    GetHeight: js.Function0[scala.Double],
    GetLeft: js.Function0[scala.Double],
    GetRight: js.Function0[scala.Double],
    GetTop: js.Function0[scala.Double],
    GetWidth: js.Function0[scala.Double]
  ): ASPxClientRect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetBottom")(GetBottom)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetLeft")(GetLeft)
    __obj.updateDynamic("GetRight")(GetRight)
    __obj.updateDynamic("GetTop")(GetTop)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.asInstanceOf[ASPxClientRect]
  }
}

