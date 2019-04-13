package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The DragSelectingTool lets the user select multiple parts with a rectangular area.
  * There is a temporary part, the .box,
  * that shows the current area encompassed between the mouse-down
  * point and the current mouse point.
  * The default drag selection box is a blue rectangle.
  * You can change the .box to customize its appearance -- see its documentation for an example.
  */
@JSImport("go", "DragSelectingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.dragSelectingTool, which you can modify.
  */
class DragSelectingTool () extends Tool {
  /**Gets or sets the Part used as the "rubber-band selection box" that is stretched to follow the mouse, as feedback for what area will be passed to .selectInRect upon a mouse-up.*/
  var box: Part = js.native
  /**Gets or sets the time in milliseconds for which the mouse must be stationary before this tool can be started.*/
  var delay: scala.Double = js.native
  /**Gets or sets whether a selectable Part may be only partly or must be completely enclosed by the rectangle given to .selectInRect.*/
  var isPartialInclusion: scala.Boolean = js.native
  /**
    * This just returns a Rect stretching from the mouse-down point to the current mouse point.
    */
  def computeBoxBounds(): Rect = js.native
  /**
    * This method is called to select some parts within the area of a given rectangle.
    *@param {Rect} r
    */
  def selectInRect(r: Rect): scala.Unit = js.native
}

