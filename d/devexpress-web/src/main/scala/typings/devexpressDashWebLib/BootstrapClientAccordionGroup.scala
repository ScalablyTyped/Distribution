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
    GetEnabled: js.Function0[scala.Boolean],
    GetExpanded: js.Function0[scala.Boolean],
    GetHeaderBadgeIconCssClass: js.Function0[java.lang.String],
    GetHeaderBadgeText: js.Function0[java.lang.String],
    GetItem: js.Function1[scala.Double, BootstrapClientAccordionItem],
    GetItemByName: js.Function1[java.lang.String, BootstrapClientAccordionItem],
    GetItemCount: js.Function0[scala.Double],
    GetText: js.Function0[java.lang.String],
    GetVisible: js.Function0[scala.Boolean],
    SetExpanded: js.Function1[scala.Boolean, scala.Unit],
    SetHeaderBadgeIconCssClass: js.Function1[java.lang.String, scala.Unit],
    SetHeaderBadgeText: js.Function1[java.lang.String, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    index: scala.Double,
    name: java.lang.String,
    navBar: BootstrapClientAccordion
  ): BootstrapClientAccordionGroup = {
    val __obj = js.Dynamic.literal(GetEnabled = GetEnabled, GetExpanded = GetExpanded, GetHeaderBadgeIconCssClass = GetHeaderBadgeIconCssClass, GetHeaderBadgeText = GetHeaderBadgeText, GetItem = GetItem, GetItemByName = GetItemByName, GetItemCount = GetItemCount, GetText = GetText, GetVisible = GetVisible, SetExpanded = SetExpanded, SetHeaderBadgeIconCssClass = SetHeaderBadgeIconCssClass, SetHeaderBadgeText = SetHeaderBadgeText, SetText = SetText, SetVisible = SetVisible, index = index, name = name, navBar = navBar)
  
    __obj.asInstanceOf[BootstrapClientAccordionGroup]
  }
}

