package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxButton control.
  */
trait ASPxClientButton extends ASPxClientControl {
  /**
    * Occurs on the client side when the button's checked state is changed.
    */
  var CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]]
  /**
    * Occurs on the client side after a button is clicked.
    */
  var Click: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]]
  /**
    * Fires on the client side when the button receives input focus.
    */
  var GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]]
  /**
    * Fires on the client side when the button loses input focus.
    */
  var LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]]
  /**
    * Simulates a mouse click action on the button control.
    */
  def DoClick(): scala.Unit
  /**
    * Sets input focus to the button.
    */
  def Focus(): scala.Unit
  /**
    * Returns a value indicating whether the button is checked.
    */
  def GetChecked(): scala.Boolean
  /**
    * Returns a value indicating whether the button is enabled.
    */
  def GetEnabled(): scala.Boolean
  /**
    * Returns the URL pointing to the image displayed within the button.
    */
  def GetImageUrl(): java.lang.String
  /**
    * Returns the text displayed within the button.
    */
  def GetText(): java.lang.String
  /**
    * Sets a value that specifies the button's checked status.
    * @param value true if the button is checked; otherwise, false.
    */
  def SetChecked(value: scala.Boolean): scala.Unit
  /**
    * Sets a value specifying whether the button is enabled.
    * @param value true to enable the button; false to disable it.
    */
  def SetEnabled(value: scala.Boolean): scala.Unit
  /**
    * Sets the URL pointing to the image displayed within the button.
    * @param value A string value that is the URL to the image displayed within the button.
    */
  def SetImageUrl(value: java.lang.String): scala.Unit
  /**
    * Sets the text to be displayed within the button.
    * @param value A string value specifying the text to be displayed within the button.
    */
  def SetText(value: java.lang.String): scala.Unit
}

