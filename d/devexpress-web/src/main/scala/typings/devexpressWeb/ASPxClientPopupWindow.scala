package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of a popup control's PopupWindow object.
  */
trait ASPxClientPopupWindow extends js.Object {
  /**
    * Gets the index of the current popup window within the popup control's ASPxPopupControl.Windows collection.
    */
  var index: Double
  /**
    * Gets the name that uniquely identifies the current popup window.
    */
  var name: String
  /**
    * Gets the popup control to which the current popup window belongs.
    */
  var popupControl: ASPxClientPopupControl
  /**
    * Returns the URL pointing to the image displayed within the <strong>window footer</strong>.
    */
  def GetFooterImageUrl(): String
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's <strong>footer</strong>.
    */
  def GetFooterNavigateUrl(): String
  /**
    * Returns the text displayed within the popup window's <strong>footer</strong>.
    */
  def GetFooterText(): String
  /**
    * Returns the URL pointing to the image displayed within the <strong>window header</strong>.
    */
  def GetHeaderImageUrl(): String
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's <strong>header</strong>.
    */
  def GetHeaderNavigateUrl(): String
  /**
    * Returns the text displayed within the window's <strong>header</strong>.
    */
  def GetHeaderText(): String
  /**
    * Specifies the URL which points to the image displayed within the <strong>window footer</strong>.
    * @param value A string value that is the URL to the image displayed within the window footer.
    */
  def SetFooterImageUrl(value: String): Unit
  /**
    * Specifies the URL where the web browser will navigate when the text or image is clicked within the popup window's <strong>footer</strong>.
    * @param value A string value which specifies the required navigation location.
    */
  def SetFooterNavigateUrl(value: String): Unit
  /**
    * Specifies the text displayed within the window's <strong>footer</strong>.
    * @param value A string value that specifies the window's footer text.
    */
  def SetFooterText(value: String): Unit
  /**
    * Specifies the URL which points to the image displayed within the <strong>window header</strong>.
    * @param value A string value that is the URL to the image displayed within the header.
    */
  def SetHeaderImageUrl(value: String): Unit
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's <strong>header</strong>.
    * @param value A string value which specifies the required navigation location.
    */
  def SetHeaderNavigateUrl(value: String): Unit
  /**
    * Specifies the text displayed within the window's <strong>header</strong>.
    * @param value A string value that specifies the window's header text.
    */
  def SetHeaderText(value: String): Unit
}

object ASPxClientPopupWindow {
  @scala.inline
  def apply(
    GetFooterImageUrl: () => String,
    GetFooterNavigateUrl: () => String,
    GetFooterText: () => String,
    GetHeaderImageUrl: () => String,
    GetHeaderNavigateUrl: () => String,
    GetHeaderText: () => String,
    SetFooterImageUrl: String => Unit,
    SetFooterNavigateUrl: String => Unit,
    SetFooterText: String => Unit,
    SetHeaderImageUrl: String => Unit,
    SetHeaderNavigateUrl: String => Unit,
    SetHeaderText: String => Unit,
    index: Double,
    name: String,
    popupControl: ASPxClientPopupControl
  ): ASPxClientPopupWindow = {
    val __obj = js.Dynamic.literal(GetFooterImageUrl = js.Any.fromFunction0(GetFooterImageUrl), GetFooterNavigateUrl = js.Any.fromFunction0(GetFooterNavigateUrl), GetFooterText = js.Any.fromFunction0(GetFooterText), GetHeaderImageUrl = js.Any.fromFunction0(GetHeaderImageUrl), GetHeaderNavigateUrl = js.Any.fromFunction0(GetHeaderNavigateUrl), GetHeaderText = js.Any.fromFunction0(GetHeaderText), SetFooterImageUrl = js.Any.fromFunction1(SetFooterImageUrl), SetFooterNavigateUrl = js.Any.fromFunction1(SetFooterNavigateUrl), SetFooterText = js.Any.fromFunction1(SetFooterText), SetHeaderImageUrl = js.Any.fromFunction1(SetHeaderImageUrl), SetHeaderNavigateUrl = js.Any.fromFunction1(SetHeaderNavigateUrl), SetHeaderText = js.Any.fromFunction1(SetHeaderText), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popupControl = popupControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindow]
  }
}

