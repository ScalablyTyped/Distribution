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

object BootstrapClientAccordionItem {
  @scala.inline
  def apply(
    GetBadgeIconCssClass: js.Function0[java.lang.String],
    GetBadgeText: js.Function0[java.lang.String],
    GetEnabled: js.Function0[scala.Boolean],
    GetIconCssClass: js.Function0[java.lang.String],
    GetImageUrl: js.Function0[java.lang.String],
    GetNavigateUrl: js.Function0[java.lang.String],
    GetText: js.Function0[java.lang.String],
    GetVisible: js.Function0[scala.Boolean],
    SetBadgeIconCssClass: js.Function1[java.lang.String, scala.Unit],
    SetBadgeText: js.Function1[java.lang.String, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetIconCssClass: js.Function1[java.lang.String, scala.Unit],
    SetImageUrl: js.Function1[java.lang.String, scala.Unit],
    SetNavigateUrl: js.Function1[java.lang.String, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    group: BootstrapClientAccordionGroup,
    index: scala.Double,
    name: java.lang.String,
    navBar: BootstrapClientAccordion
  ): BootstrapClientAccordionItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetBadgeIconCssClass")(GetBadgeIconCssClass)
    __obj.updateDynamic("GetBadgeText")(GetBadgeText)
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetIconCssClass")(GetIconCssClass)
    __obj.updateDynamic("GetImageUrl")(GetImageUrl)
    __obj.updateDynamic("GetNavigateUrl")(GetNavigateUrl)
    __obj.updateDynamic("GetText")(GetText)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("SetBadgeIconCssClass")(SetBadgeIconCssClass)
    __obj.updateDynamic("SetBadgeText")(SetBadgeText)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetIconCssClass")(SetIconCssClass)
    __obj.updateDynamic("SetImageUrl")(SetImageUrl)
    __obj.updateDynamic("SetNavigateUrl")(SetNavigateUrl)
    __obj.updateDynamic("SetText")(SetText)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("navBar")(navBar)
    __obj.asInstanceOf[BootstrapClientAccordionItem]
  }
}

