package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ClickCreatingTool lets the user create a node by clicking where they want the new node to be.
  * By default a double-click is required to start this tool;
  * set .isDoubleClick to false if you want a single-click to create a node.
  */
@JSImport("go", "ClickCreatingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.clickCreatingTool, which you can modify.
  */
class ClickCreatingTool () extends Tool {
  /**Gets or sets a data object that will be copied and added to the diagram's model each time this tool executes. The value must be an Object or null.*/
  var archetypeNodeData: js.Any = js.native
  /**Gets or sets whether a double click rather than a single-click is required to insert a new Part at the mouse-up point.*/
  var isDoubleClick: scala.Boolean = js.native
  /**
    * Create a node by adding a copy of the .archetypeNodeData object to the diagram's model, assign its Part.location to be the given point, and select the new part.
    * @param {Point} loc a Point in document coordinates.
    */
  def insertPart(loc: Point): Part = js.native
}

