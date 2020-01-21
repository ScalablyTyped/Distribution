package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of a popup control's PopupWindow object.
  */
@JSGlobal("ASPxClientPopupWindow")
@js.native
class ASPxClientPopupWindow () extends js.Object {
  /**
    * Gets the index of the current popup window within the popup control's ASPxPopupControl.Windows collection.
    */
  var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the current popup window.
    */
  var name: String = js.native
  /**
    * Gets the popup control to which the current popup window belongs.
    */
  var popupControl: ASPxClientPopupControl = js.native
  /**
    * Returns the URL pointing to the image displayed within the <strong>window footer</strong>.
    */
  def GetFooterImageUrl(): String = js.native
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's <strong>footer</strong>.
    */
  def GetFooterNavigateUrl(): String = js.native
  /**
    * Returns the text displayed within the popup window's <strong>footer</strong>.
    */
  def GetFooterText(): String = js.native
  /**
    * Returns the URL pointing to the image displayed within the <strong>window header</strong>.
    */
  def GetHeaderImageUrl(): String = js.native
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's <strong>header</strong>.
    */
  def GetHeaderNavigateUrl(): String = js.native
  /**
    * Returns the text displayed within the window's <strong>header</strong>.
    */
  def GetHeaderText(): String = js.native
  /**
    * Specifies the URL which points to the image displayed within the <strong>window footer</strong>.
    * @param value A string value that is the URL to the image displayed within the window footer.
    */
  def SetFooterImageUrl(value: String): Unit = js.native
  /**
    * Specifies the URL where the web browser will navigate when the text or image is clicked within the popup window's <strong>footer</strong>.
    * @param value A string value which specifies the required navigation location.
    */
  def SetFooterNavigateUrl(value: String): Unit = js.native
  /**
    * Specifies the text displayed within the window's <strong>footer</strong>.
    * @param value A string value that specifies the window's footer text.
    */
  def SetFooterText(value: String): Unit = js.native
  /**
    * Specifies the URL which points to the image displayed within the <strong>window header</strong>.
    * @param value A string value that is the URL to the image displayed within the header.
    */
  def SetHeaderImageUrl(value: String): Unit = js.native
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's <strong>header</strong>.
    * @param value A string value which specifies the required navigation location.
    */
  def SetHeaderNavigateUrl(value: String): Unit = js.native
  /**
    * Specifies the text displayed within the window's <strong>header</strong>.
    * @param value A string value that specifies the window's header text.
    */
  def SetHeaderText(value: String): Unit = js.native
}

