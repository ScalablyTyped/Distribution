package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Accordion's BootstrapAccordionGroup object.
  */
trait BootstrapClientAccordionGroup extends ASPxClientNavBarGroup {
  /**
    * Gets the BootstrapClientAccordion object to which the current group belongs.
    * Value: A <see cref="BootstrapClientAccordion" /> object that is the group's owner.
    */
  @JSName("navBar")
  var navBar_BootstrapClientAccordionGroup: BootstrapClientAccordion
  /**
    * Gets the CSS class of the icon displayed within an accordion group header badge.
    */
  def GetHeaderBadgeIconCssClass(): java.lang.String
  /**
    * Gets the text displayed within an accordion group header badge.
    */
  def GetHeaderBadgeText(): java.lang.String
  /**
    * Sets the CSS class of the icon displayed within an accordion group header badge.
    * @param cssClass A String containing the name of a CSS class.
    */
  def SetHeaderBadgeIconCssClass(cssClass: java.lang.String): scala.Unit
  /**
    * Sets the text displayed within an accordion group header badge.
    * @param text A String specifying the badge text.
    */
  def SetHeaderBadgeText(text: java.lang.String): scala.Unit
}

