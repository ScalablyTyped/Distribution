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

object BootstrapClientAccordionGroup {
  @scala.inline
  def apply(
    GetEnabled: () => scala.Boolean,
    GetExpanded: () => scala.Boolean,
    GetHeaderBadgeIconCssClass: () => java.lang.String,
    GetHeaderBadgeText: () => java.lang.String,
    GetItem: scala.Double => BootstrapClientAccordionItem,
    GetItemByName: java.lang.String => BootstrapClientAccordionItem,
    GetItemCount: () => scala.Double,
    GetText: () => java.lang.String,
    GetVisible: () => scala.Boolean,
    SetExpanded: scala.Boolean => scala.Unit,
    SetHeaderBadgeIconCssClass: java.lang.String => scala.Unit,
    SetHeaderBadgeText: java.lang.String => scala.Unit,
    SetText: java.lang.String => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    index: scala.Double,
    name: java.lang.String,
    navBar: BootstrapClientAccordion
  ): BootstrapClientAccordionGroup = {
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetExpanded = js.Any.fromFunction0(GetExpanded), GetHeaderBadgeIconCssClass = js.Any.fromFunction0(GetHeaderBadgeIconCssClass), GetHeaderBadgeText = js.Any.fromFunction0(GetHeaderBadgeText), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetExpanded = js.Any.fromFunction1(SetExpanded), SetHeaderBadgeIconCssClass = js.Any.fromFunction1(SetHeaderBadgeIconCssClass), SetHeaderBadgeText = js.Any.fromFunction1(SetHeaderBadgeText), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index, name = name, navBar = navBar)
  
    __obj.asInstanceOf[BootstrapClientAccordionGroup]
  }
}

