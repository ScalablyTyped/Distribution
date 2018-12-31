package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The TextEditingTool is used to let the user interactively edit text in place.
  * You do not normally need to create an instance of this tool
  * because one already exists as the ToolManager.clickSelectingTool.
  */
@JSImport("go", "TextEditingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.textEditingTool, which you can modify.
  */
class TextEditingTool ()
  extends goLib.goMod.goNs.TextEditingTool

/**
  * The TextEditingTool is used to let the user interactively edit text in place.
  * You do not normally need to create an instance of this tool
  * because one already exists as the ToolManager.clickSelectingTool.
  */
@JSImport("go", "TextEditingTool")
@js.native
object TextEditingTool extends js.Object {
  /**The user has typed ENTER.*/
  var Enter: goLib.goMod.goNs.EnumValue = js.native
  /**The text editing control has lost focus.*/
  var LostFocus: goLib.goMod.goNs.EnumValue = js.native
  /**The user has clicked somewhere else in the diagram.*/
  var MouseDown: goLib.goMod.goNs.EnumValue = js.native
  /**A single click on a TextBlock with TextBlock.editable property set to true will start in-place editing.*/
  var SingleClick: goLib.goMod.goNs.EnumValue = js.native
  /**A single click on a TextBlock with TextBlock.editable property set to true will start in-place editing, but only if the Part that the TextBlock is in is already selected.*/
  var SingleClickSelected: goLib.goMod.goNs.EnumValue = js.native
  /**The user has typed TAB.*/
  var Tab: goLib.goMod.goNs.EnumValue = js.native
}

