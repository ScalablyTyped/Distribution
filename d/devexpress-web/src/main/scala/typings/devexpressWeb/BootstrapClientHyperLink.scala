package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapHyperLink control.
  */
@JSGlobal("BootstrapClientHyperLink")
@js.native
class BootstrapClientHyperLink () extends ASPxClientHyperLink {
  /**
    * Gets the CSS class of the icon displayed within the hyperlink badge.
    */
  def GetBadgeIconCssClass(): String = js.native
  /**
    * Gets the text displayed within the hyperlink badge.
    */
  def GetBadgeText(): String = js.native
  /**
    * Sets the CSS class of the icon displayed within the hyperlink badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  /**
    * Sets the text displayed within the hyperlink badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit = js.native
}

