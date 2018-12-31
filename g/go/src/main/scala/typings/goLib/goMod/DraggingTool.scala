package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The DraggingTool is used to move or copy selected parts with the mouse.
  * Dragging the selection moves parts for which Part.canMove is true.
  * If the user holds down the Control key, this tool will make a copy of the parts being dragged,
  * for those parts for which Part.canCopy is true.
  */
@JSImport("go", "DraggingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.draggingTool, which you can modify.
  */
class DraggingTool ()
  extends goLib.goMod.goNs.DraggingTool

