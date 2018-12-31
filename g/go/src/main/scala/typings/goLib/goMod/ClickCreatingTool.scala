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
class ClickCreatingTool ()
  extends goLib.goMod.goNs.ClickCreatingTool

