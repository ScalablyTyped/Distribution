package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Accordion's BootstrapAccordionItem object.
  */
@js.native
trait BootstrapClientAccordionItem extends ASPxClientNavBarItem {
  /**
    * Gets the group to which the current item belongs.
    */
  @JSName("group")
  var group_BootstrapClientAccordionItem: BootstrapClientAccordionGroup = js.native
  /**
    * Gets the BootstrapClientAccordion object to which the current item belongs.
    */
  @JSName("navBar")
  var navBar_BootstrapClientAccordionItem: BootstrapClientAccordion = js.native
  /**
    * Gets the CSS class of the icon displayed within the accordion item badge.
    */
  def GetBadgeIconCssClass(): String = js.native
  /**
    * Gets the text displayed within the accordion item badge.
    */
  def GetBadgeText(): String = js.native
  /**
    * Gets the CSS class of the icon displayed by the Accordion item.
    */
  def GetIconCssClass(): String = js.native
  /**
    * Sets the CSS class of the icon displayed within the accordion item badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  /**
    * Sets the text displayed within the accordion item badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit = js.native
  /**
    * Sets the CSS class of the icon displayed by the Accordion item.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: String): Unit = js.native
}

object BootstrapClientAccordionItem {
  @scala.inline
  def apply(
    GetBadgeIconCssClass: () => String,
    GetBadgeText: () => String,
    GetEnabled: () => Boolean,
    GetIconCssClass: () => String,
    GetImageUrl: () => String,
    GetNavigateUrl: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetBadgeIconCssClass: String => Unit,
    SetBadgeText: String => Unit,
    SetEnabled: Boolean => Unit,
    SetIconCssClass: String => Unit,
    SetImageUrl: String => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    group: BootstrapClientAccordionGroup,
    index: Double,
    name: String,
    navBar: BootstrapClientAccordion
  ): BootstrapClientAccordionItem = {
    val __obj = js.Dynamic.literal(GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetEnabled = js.Any.fromFunction0(GetEnabled), GetIconCssClass = js.Any.fromFunction0(GetIconCssClass), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetEnabled = js.Any.fromFunction1(SetEnabled), SetIconCssClass = js.Any.fromFunction1(SetIconCssClass), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navBar = navBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientAccordionItem]
  }
  @scala.inline
  implicit class BootstrapClientAccordionItemOps[Self <: BootstrapClientAccordionItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetBadgeIconCssClass(value: () => String): Self = this.set("GetBadgeIconCssClass", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBadgeText(value: () => String): Self = this.set("GetBadgeText", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIconCssClass(value: () => String): Self = this.set("GetIconCssClass", js.Any.fromFunction0(value))
    @scala.inline
    def setSetBadgeIconCssClass(value: String => Unit): Self = this.set("SetBadgeIconCssClass", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBadgeText(value: String => Unit): Self = this.set("SetBadgeText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIconCssClass(value: String => Unit): Self = this.set("SetIconCssClass", js.Any.fromFunction1(value))
    @scala.inline
    def setGroup(value: BootstrapClientAccordionGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavBar(value: BootstrapClientAccordion): Self = this.set("navBar", value.asInstanceOf[js.Any])
  }
  
}

