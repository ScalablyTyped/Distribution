package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxButton control.
  */
@JSGlobal("ASPxClientButton")
@js.native
class ASPxClientButton () extends ASPxClientControl {
  /**
    * Occurs on the client side when the button's checked state is changed.
    */
  var CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]] = js.native
  /**
    * Occurs on the client side after a button is clicked.
    */
  var Click: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]] = js.native
  /**
    * Fires on the client side when the button receives input focus.
    */
  var GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]] = js.native
  /**
    * Fires on the client side when the button loses input focus.
    */
  var LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]] = js.native
  /**
    * Simulates a mouse click action on the button control.
    */
  def DoClick(): Unit = js.native
  /**
    * Sets input focus to the button.
    */
  def Focus(): Unit = js.native
  /**
    * Returns a value indicating whether the button is checked.
    */
  def GetChecked(): Boolean = js.native
  /**
    * Returns a value indicating whether the button is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns the URL pointing to the image displayed within the button.
    */
  def GetImageUrl(): String = js.native
  /**
    * Returns the text displayed within the button.
    */
  def GetText(): String = js.native
  /**
    * Sets a value that specifies the button's checked status.
    * @param value true if the button is checked; otherwise, false.
    */
  def SetChecked(value: Boolean): Unit = js.native
  /**
    * Sets a value specifying whether the button is enabled.
    * @param value true to enable the button; false to disable it.
    */
  def SetEnabled(value: Boolean): Unit = js.native
  /**
    * Sets the URL pointing to the image displayed within the button.
    * @param value A string value that is the URL to the image displayed within the button.
    */
  def SetImageUrl(value: String): Unit = js.native
  /**
    * Sets the text to be displayed within the button.
    * @param value A string value specifying the text to be displayed within the button.
    */
  def SetText(value: String): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientButton")
@js.native
object ASPxClientButton extends js.Object {
  /**
    * Converts the specified object to the ASPxClientButton type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientButton = js.native
}

