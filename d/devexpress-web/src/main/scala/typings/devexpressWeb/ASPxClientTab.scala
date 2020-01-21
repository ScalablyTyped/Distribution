package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of a tab control's Tab or a page control's TabPage object.
  */
@JSGlobal("ASPxClientTab")
@js.native
class ASPxClientTab () extends js.Object {
  /**
    * Gets the index of the current tab (tabbed page) within the control's collection of tabs (tabbed pages).
    */
  var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the current tab.
    */
  var name: String = js.native
  /**
    * Gets the tab control to which the current tab belongs.
    */
  var tabControl: ASPxClientTabControlBase = js.native
  /**
    * Returns the URL pointing to the image displayed within the active tab.
    */
  def GetActiveImageUrl(): String = js.native
  /**
    * Returns a value specifying whether a tab is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns the URL pointing to the image displayed within the tab.
    */
  def GetImageUrl(): String = js.native
  /**
    * Gets an URL which defines the navigation location for the tab.
    */
  def GetNavigateUrl(): String = js.native
  /**
    * Returns text displayed within the tab.
    */
  def GetText(): String = js.native
  /**
    * Returns a value specifying whether a tab is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Specifies the URL which points to the image displayed within the active tab.
    * @param value A string value that is the URL to the image displayed within the active tab.
    */
  def SetActiveImageUrl(value: String): Unit = js.native
  /**
    * Specifies whether the tab is enabled.
    * @param value true to enable the tab; otherwise, false.
    */
  def SetEnabled(value: Boolean): Unit = js.native
  /**
    * Specifies the URL which points to the image displayed within the tab.
    * @param value A string value that is the URL to the image displayed within the tab.
    */
  def SetImageUrl(value: String): Unit = js.native
  /**
    * Specifies a URL which defines the navigation location for the tab.
    * @param value A string value which is a URL to where the client web browser will navigate when the tab is clicked.
    */
  def SetNavigateUrl(value: String): Unit = js.native
  /**
    * Specifies the text displayed within the tab.
    * @param value A string value that is the text displayed within the tab.
    */
  def SetText(value: String): Unit = js.native
  /**
    * Specifies whether the tab is visible.
    * @param value true is the tab is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit = js.native
}

