package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Accordion's BootstrapAccordionItem object.
  */
trait BootstrapClientAccordionItem extends ASPxClientNavBarItem {
  /**
    * Gets the group to which the current item belongs.
    * Value: A <see cref="BootstrapClientAccordionGroup" /> object representing the group to which the item belongs.
    */
  @JSName("group")
  var group_BootstrapClientAccordionItem: BootstrapClientAccordionGroup
  /**
    * Gets the BootstrapClientAccordion object to which the current item belongs.
    * Value: A <see cref="BootstrapClientAccordion" /> object that is the item's owner.
    */
  @JSName("navBar")
  var navBar_BootstrapClientAccordionItem: BootstrapClientAccordion
  /**
    * Gets the CSS class of the icon displayed within the accordion item badge.
    */
  def GetBadgeIconCssClass(): java.lang.String
  /**
    * Gets the text displayed within the accordion item badge.
    */
  def GetBadgeText(): java.lang.String
  /**
    * Gets the CSS class of the icon displayed by the Accordion item.
    */
  def GetIconCssClass(): java.lang.String
  /**
    * Sets the CSS class of the icon displayed within the accordion item badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: java.lang.String): scala.Unit
  /**
    * Sets the text displayed within the accordion item badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: java.lang.String): scala.Unit
  /**
    * Sets the CSS class of the icon displayed by the Accordion item.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: java.lang.String): scala.Unit
}

