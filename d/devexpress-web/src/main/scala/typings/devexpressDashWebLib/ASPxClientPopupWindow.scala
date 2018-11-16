package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of a popup control's PopupWindow object.
 */

trait ASPxClientPopupWindow extends js.Object {
  /**
       * Gets the index of the current popup window within the popup control's Windows collection.
       * Value: An integer value representing the zero-based index of the current popup window within the Windows collection of the popup control to which the window belongs.
       */
  var index: scala.Double
  /**
       * Gets the name that uniquely identifies the current popup window.
       * Value: A string value that represents a value assigned to the popup window's Name property.
       */
  var name: java.lang.String
  /**
       * Gets the popup control to which the current popup window belongs.
       * Value: An ASPxClientPopupControl object representing the popup control to which the window belongs.
       */
  var popupControl: ASPxClientPopupControl
  /**
       * Returns the URL pointing to the image displayed within the window footer.
       */
  def GetFooterImageUrl(): java.lang.String
  /**
       * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's footer.
       */
  def GetFooterNavigateUrl(): java.lang.String
  /**
       * Returns the text displayed within the popup window's footer.
       */
  def GetFooterText(): java.lang.String
  /**
       * Returns the URL pointing to the image displayed within the window header.
       */
  def GetHeaderImageUrl(): java.lang.String
  /**
       * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's header.
       */
  def GetHeaderNavigateUrl(): java.lang.String
  /**
       * Returns the text displayed within the window's header.
       */
  def GetHeaderText(): java.lang.String
  /**
       * Specifies the URL which points to the image displayed within the window footer.
       * @param value A string value that is the URL to the image displayed within the window footer.
       */
  def SetFooterImageUrl(value: java.lang.String): scala.Unit
  /**
       * Specifies the URL where the web browser will navigate when the text or image is clicked within the popup window's footer.
       * @param value A string value which specifies the required navigation location.
       */
  def SetFooterNavigateUrl(value: java.lang.String): scala.Unit
  /**
       * Specifies the text displayed within the window's footer.
       * @param value A string value that specifies the window's footer text.
       */
  def SetFooterText(value: java.lang.String): scala.Unit
  /**
       * Specifies the URL which points to the image displayed within the window header.
       * @param value A string value that is the URL to the image displayed within the header.
       */
  def SetHeaderImageUrl(value: java.lang.String): scala.Unit
  /**
       * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's header.
       * @param value A string value which specifies the required navigation location.
       */
  def SetHeaderNavigateUrl(value: java.lang.String): scala.Unit
  /**
       * Specifies the text displayed within the window's header.
       * @param value A string value that specifies the window's header text.
       */
  def SetHeaderText(value: java.lang.String): scala.Unit
}

