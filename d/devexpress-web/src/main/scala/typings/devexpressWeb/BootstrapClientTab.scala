package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of a tab control's BootstrapTab or a page control's BootstrapTabPage object.
  */
@JSGlobal("BootstrapClientTab")
@js.native
class BootstrapClientTab () extends ASPxClientTab {
  /**
    * Gets the CSS class of an icon displayed by the tab when it is active.
    */
  def GetActiveIconCssClass(): String = js.native
  /**
    * Gets the CSS class of the icon displayed within the tab badge.
    */
  def GetBadgeIconCssClass(): String = js.native
  /**
    * Gets the text displayed within the tab badge.
    */
  def GetBadgeText(): String = js.native
  /**
    * Gets the CSS class of the icon displayed by the tab.
    */
  def GetIconCssClass(): String = js.native
  /**
    * Sets the CSS class of an icon displayed by the tab when it is active.
    * @param cssClass A String containing the name of a CSS class.
    */
  def SetActiveIconCssClass(cssClass: String): Unit = js.native
  /**
    * Sets the CSS class of the icon displayed within the tab badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  /**
    * Sets the text displayed within the tab badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit = js.native
  /**
    * Sets the CSS class of the icon displayed by the tab.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: String): Unit = js.native
}

