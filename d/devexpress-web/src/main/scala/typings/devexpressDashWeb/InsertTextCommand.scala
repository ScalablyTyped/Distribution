package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert text at the current position in the document.
  */
@js.native
trait InsertTextCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTextCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param text A string value specifying a text to insert.
    */
  def execute(text: String): Boolean = js.native
  /**
    * Executes the InsertTextCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param text A string value specifying a text to insert.
    * @param interval An object specifying the text range in the active sub-document that will be replaced with the inserted text.
    */
  def execute(text: String, interval: Interval): Boolean = js.native
  /**
    * Executes the InsertTextCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param text A string value specifying a text to insert.
    * @param interval An object specifying the text range that will be replaced with the inserted text.
    * @param subDocumentId An integer value specifying the sub-document.
    */
  def execute(text: String, interval: Interval, subDocumentId: Double): Boolean = js.native
  /**
    * Executes the InsertTextCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param text A string value specifying a text to insert.
    * @param position An integer value specifying the text's position where to insert the text.
    */
  def execute(text: String, position: Double): Boolean = js.native
  /**
    * Executes the InsertTextCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param text A string value specifying a text to insert.
    * @param position An integer value specifying the text's position where to insert the text.
    * @param subDocumentId An integer value specifying the sub-document.
    */
  def execute(text: String, position: Double, subDocumentId: Double): Boolean = js.native
}

