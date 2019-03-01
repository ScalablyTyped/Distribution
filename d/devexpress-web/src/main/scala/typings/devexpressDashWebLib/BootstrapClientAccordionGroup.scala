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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetExpanded")(GetExpanded)
    __obj.updateDynamic("GetHeaderBadgeIconCssClass")(GetHeaderBadgeIconCssClass)
    __obj.updateDynamic("GetHeaderBadgeText")(GetHeaderBadgeText)
    __obj.updateDynamic("GetItem")(GetItem)
    __obj.updateDynamic("GetItemByName")(GetItemByName)
    __obj.updateDynamic("GetItemCount")(GetItemCount)
    __obj.updateDynamic("GetText")(GetText)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("SetExpanded")(SetExpanded)
    __obj.updateDynamic("SetHeaderBadgeIconCssClass")(SetHeaderBadgeIconCssClass)
    __obj.updateDynamic("SetHeaderBadgeText")(SetHeaderBadgeText)
    __obj.updateDynamic("SetText")(SetText)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("navBar")(navBar)
    __obj.asInstanceOf[BootstrapClientAccordionGroup]
  }
}

