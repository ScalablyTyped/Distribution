package typings
package devexpressDashWebLib

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
  def execute(text: java.lang.String): scala.Boolean = js.native
  /**
    * Executes the InsertTextCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param text A string value specifying a text to insert.
    * @param interval An object specifying the text range in the active sub-document that will be replaced with the inserted text.
    */
  def execute(text: java.lang.String, interval: Interval): scala.Boolean = js.native
  /**
    * Executes the InsertTextCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param text A string value specifying a text to insert.
    * @param interval An object specifying the text range that will be replaced with the inserted text.
    * @param subDocumentId An integer value specifying the sub-document.
    */
  def execute(text: java.lang.String, interval: Interval, subDocumentId: scala.Double): scala.Boolean = js.native
  /**
    * Executes the InsertTextCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param text A string value specifying a text to insert.
    * @param position An integer value specifying the text's position where to insert the text.
    */
  def execute(text: java.lang.String, position: scala.Double): scala.Boolean = js.native
  /**
    * Executes the InsertTextCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param text A string value specifying a text to insert.
    * @param position An integer value specifying the text's position where to insert the text.
    * @param subDocumentId An integer value specifying the sub-document.
    */
  def execute(text: java.lang.String, position: scala.Double, subDocumentId: scala.Double): scala.Boolean = js.native
}

