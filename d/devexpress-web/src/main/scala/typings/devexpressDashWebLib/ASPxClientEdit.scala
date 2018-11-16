package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Serves as the base object for all the editors that support validation.
 */

trait ASPxClientEdit extends ASPxClientEditBase {
  /**
       * Fires on the client side when the editor receives input focus.
       */
  var GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]]
  /**
       * Fires on the client side when the editor loses input focus.
       */
  var LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]]
  /**
       * Allows you to specify whether the value entered into the editor is valid, and whether the editor is allowed to lose focus.
       */
  var Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]]
  /**
       * Fires after the editor's value has been changed by end-user interactions.
       */
  var ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]]
  /**
       * Sets input focus to the editor.
       */
  def Focus(): scala.Unit
  /**
       * Gets the error text to be displayed within the editor's error frame if the editor's validation fails.
       */
  def GetErrorText(): java.lang.String
  /**
       * Returns an HTML element that represents the control's input element.
       */
  def GetInputElement(): js.Object
  /**
       * Gets a value that indicates whether the editor's value passes validation.
       */
  def GetIsValid(): scala.Boolean
  /**
       * Sets the error text to be displayed within the editor's error frame if the editor's validation fails.
       * @param errorText A string value representing the error text.
       */
  def SetErrorText(errorText: java.lang.String): scala.Unit
  /**
       * Sets a value that specifies whether the editor's value is valid.
       * @param isValid True if the editor's value is valid; otherwise, False.
       */
  def SetIsValid(isValid: scala.Boolean): scala.Unit
  /**
       * Performs the editor's validation.
       */
  def Validate(): scala.Unit
}

