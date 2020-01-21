package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base for client-side objects which allow single-line text input.
  */
@JSGlobal("ASPxClientTextEdit")
@js.native
class ASPxClientTextEdit () extends ASPxClientEdit {
  /**
    * Occurs on the client-side when an end-user presses a key while the editor has focus.
    */
  var KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]] = js.native
  /**
    * Occurs on the client-side when an end-user presses and releases a key while the editor has focus.
    */
  var KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]] = js.native
  /**
    * Occurs on the client-side when an end-user releases a pressed key while the editor has focus.
    */
  var KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]] = js.native
  /**
    * Fires on the client side when the editor's text is changed and focus moves out of the editor by end-user interactions.
    */
  var TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTextEdit]] = js.native
  /**
    * Fires on the client side when the editor's input value is changed before the focus moves out of the editor by end-user interactions.
    */
  var UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]] = js.native
  /**
    * Obtains the caret position within the edited text.
    */
  def GetCaretPosition(): Double = js.native
  /**
    * Returns the text displayed within the editor.
    */
  def GetText(): String = js.native
  /**
    * Selects all text in the text editor.
    */
  def SelectAll(): Unit = js.native
  /**
    * Sets the caret position within the edited text.
    * @param position An integer value that specifies the zero-based index of a text character that shall precede the caret.
    */
  def SetCaretPosition(position: Double): Unit = js.native
  /**
    * Selects the specified portion of the editor's text.
    * @param startPos A zero-based integer value specifying the selection's starting position.
    * @param endPos A zero-based integer value specifying the selection's ending position.
    * @param scrollToSelection true to scroll the editor's contents to make the selection visible; otherwise, false.
    */
  def SetSelection(startPos: Double, endPos: Double, scrollToSelection: Boolean): Unit = js.native
  /**
    * Sets the text to be displayed within the editor.
    * @param text A string value specifying the text to be displayed within the editor.
    */
  def SetText(text: String): Unit = js.native
}

