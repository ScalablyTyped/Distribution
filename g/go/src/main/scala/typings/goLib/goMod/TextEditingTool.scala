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
class TextEditingTool () extends Tool {
  /**Gets or sets the HTML element that edits the text.*/
  var currentTextEditor: stdLib.Element = js.native
  /**Gets or sets the HTML element that edits the text.*/
  var defaultTextEditor: stdLib.Element = js.native
  /**Gets or sets how user gestures can start in-place editing of text.*/
  var starting: EnumValue = js.native
  /**Gets or sets the TextBlock that is being edited.*/
  var textBlock: TextBlock = js.native
  /**
    * Finish editing by trying to accept the new text.
    * @param {EnumValue} reason The reason must be either TextEditingTool.LostFocus,
    * TextEditingTool.MouseDown, TextEditingTool.Tab, or TextEditingTool.Enter.
    */
  def acceptText(reason: EnumValue): scala.Unit = js.native
  /**
    * This predicate checks any TextBlock.textValidation predicate and this tool's .textValidation predicate to make sure the TextBlock.text property may be set to the new string.
    * @param {TextBlock} textblock the TextBlock that is being edited.
    * @param {string} oldstr the previous string value.
    * @param {string} newstr the proposed new string value.
    */
  def isValidText(textblock: TextBlock, oldstr: java.lang.String, newstr: java.lang.String): scala.Boolean = js.native
  /**Gets or sets the predicate that determines whether or not a string of text is valid.*/
  def textValidation(tb: TextBlock, oldstr: java.lang.String, newstr: java.lang.String): scala.Boolean = js.native
}

/* static members */
@JSImport("go", "TextEditingTool")
@js.native
object TextEditingTool extends js.Object {
  /**The user has typed ENTER.*/
  var Enter: goLib.goMod.EnumValue = js.native
  /**The text editing control has lost focus.*/
  var LostFocus: goLib.goMod.EnumValue = js.native
  /**The user has clicked somewhere else in the diagram.*/
  var MouseDown: goLib.goMod.EnumValue = js.native
  /**A single click on a TextBlock with TextBlock.editable property set to true will start in-place editing.*/
  var SingleClick: goLib.goMod.EnumValue = js.native
  /**A single click on a TextBlock with TextBlock.editable property set to true will start in-place editing, but only if the Part that the TextBlock is in is already selected.*/
  var SingleClickSelected: goLib.goMod.EnumValue = js.native
  /**The user has typed TAB.*/
  var Tab: goLib.goMod.EnumValue = js.native
}

