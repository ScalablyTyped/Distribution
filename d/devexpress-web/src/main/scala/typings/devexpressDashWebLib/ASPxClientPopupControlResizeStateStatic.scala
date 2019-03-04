package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientPopupControlResizeStateStatic extends js.Object {
  /**
    * A window has been collapsed. Returns 1.
    */
  var Collapsed: scala.Double
  /**
    * A window has been expanded. Returns 2.
    */
  var Expanded: scala.Double
  /**
    * A window has been maximized. Returns 3.
    */
  var Maximized: scala.Double
  /**
    * A window has been resized. Returns 0.
    */
  var Resized: scala.Double
  /**
    * A window has been restored after maximizing. Returns 4.
    */
  var RestoredAfterMaximized: scala.Double
}

object ASPxClientPopupControlResizeStateStatic {
  @scala.inline
  def apply(
    Collapsed: scala.Double,
    Expanded: scala.Double,
    Maximized: scala.Double,
    Resized: scala.Double,
    RestoredAfterMaximized: scala.Double
  ): ASPxClientPopupControlResizeStateStatic = {
    val __obj = js.Dynamic.literal(Collapsed = Collapsed, Expanded = Expanded, Maximized = Maximized, Resized = Resized, RestoredAfterMaximized = RestoredAfterMaximized)
  
    __obj.asInstanceOf[ASPxClientPopupControlResizeStateStatic]
  }
}

