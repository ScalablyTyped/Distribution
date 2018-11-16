package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the BootstrapCheckBox control.
 */

trait BootstrapClientCheckBox extends ASPxClientEdit {
  /**
       * Occurs on the client side when the editor's checked state has been changed.
       */
  var CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[BootstrapClientCheckBox]]
  /**
       * Returns a value which specifies a check box checked state.
       */
  def GetCheckState(): java.lang.String
  /**
       * Returns a value indicating whether the check box editor is checked.
       */
  def GetChecked(): scala.Boolean
  /**
       * Returns the text displayed within the editor.
       */
  def GetText(): java.lang.String
  /**
       * Sets a value specifying the state of a check box.
       * @param checkState A string value matches one of the CheckState enumeration values.
       */
  def SetCheckState(checkState: java.lang.String): scala.Unit
  /**
       * Sets a value which specifies the checked status of the check box editor.
       * @param isChecked true if the check box editor is checked; otherwise, false.
       */
  def SetChecked(isChecked: scala.Boolean): scala.Unit
  /**
       * Sets the text to be displayed within the editor.
       * @param text A string value specifying the text to be displayed within the editor.
       */
  def SetText(text: java.lang.String): scala.Unit
}

