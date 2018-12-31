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
class DragSelectingTool ()
  extends goLib.goMod.goNs.DragSelectingTool

