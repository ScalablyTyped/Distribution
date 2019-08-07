package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the navbar's NavBarItem object.
  */
@JSGlobal("ASPxClientNavBarItem")
@js.native
class ASPxClientNavBarItem () extends js.Object {
  /**
    * Gets the group to which the current item belongs.
    */
  var group: ASPxClientNavBarGroup = js.native
  /**
    * Gets the item's index within a collection of a group's items.
    */
  var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the item.
    */
  var name: String = js.native
  /**
    * Gets the navbar to which the current item belongs.
    */
  var navBar: ASPxClientNavBar = js.native
  /**
    * Returns a value indicating whether an item is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns the URL which points to the image displayed within the item.
    */
  def GetImageUrl(): String = js.native
  /**
    * Gets an URL which defines the item's navigation location.
    */
  def GetNavigateUrl(): String = js.native
  /**
    * Returns text displayed within the item.
    */
  def GetText(): String = js.native
  /**
    * Returns a value specifying whether an item is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Specifies whether the item is enabled.
    * @param value true if the item is enabled; otherwise, false.
    */
  def SetEnabled(value: Boolean): Unit = js.native
  /**
    * Specifies the URL which points to the image displayed within the item.
    * @param value A string value that specifies the URL to the image displayed within the item.
    */
  def SetImageUrl(value: String): Unit = js.native
  /**
    * Specifies a URL which defines the item's navigation location.
    * @param value A string value which represents the URL to where the client web browser will navigate when the item is clicked.
    */
  def SetNavigateUrl(value: String): Unit = js.native
  /**
    * Specifies the text displayed within the item.
    * @param value A string value that represents the text displayed within the item.
    */
  def SetText(value: String): Unit = js.native
  /**
    * Specifies whether the item is visible.
    * @param value true is the item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit = js.native
}

