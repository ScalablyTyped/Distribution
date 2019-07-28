package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientPopupControlResizeStateStatic extends js.Object {
  /**
    * A window has been collapsed. Returns 1.
    */
  var Collapsed: Double
  /**
    * A window has been expanded. Returns 2.
    */
  var Expanded: Double
  /**
    * A window has been maximized. Returns 3.
    */
  var Maximized: Double
  /**
    * A window has been resized. Returns 0.
    */
  var Resized: Double
  /**
    * A window has been restored after maximizing. Returns 4.
    */
  var RestoredAfterMaximized: Double
}

object ASPxClientPopupControlResizeStateStatic {
  @scala.inline
  def apply(
    Collapsed: Double,
    Expanded: Double,
    Maximized: Double,
    Resized: Double,
    RestoredAfterMaximized: Double
  ): ASPxClientPopupControlResizeStateStatic = {
    val __obj = js.Dynamic.literal(Collapsed = Collapsed, Expanded = Expanded, Maximized = Maximized, Resized = Resized, RestoredAfterMaximized = RestoredAfterMaximized)
  
    __obj.asInstanceOf[ASPxClientPopupControlResizeStateStatic]
  }
}

