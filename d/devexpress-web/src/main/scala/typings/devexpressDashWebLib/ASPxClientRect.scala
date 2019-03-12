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
    GetBottom: () => scala.Double,
    GetHeight: () => scala.Double,
    GetLeft: () => scala.Double,
    GetRight: () => scala.Double,
    GetTop: () => scala.Double,
    GetWidth: () => scala.Double
  ): ASPxClientRect = {
    val __obj = js.Dynamic.literal(GetBottom = js.Any.fromFunction0(GetBottom), GetHeight = js.Any.fromFunction0(GetHeight), GetLeft = js.Any.fromFunction0(GetLeft), GetRight = js.Any.fromFunction0(GetRight), GetTop = js.Any.fromFunction0(GetTop), GetWidth = js.Any.fromFunction0(GetWidth))
  
    __obj.asInstanceOf[ASPxClientRect]
  }
}

