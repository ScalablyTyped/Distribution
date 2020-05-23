package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Accordion's BootstrapAccordionGroup object.
  */
@JSGlobal("BootstrapClientAccordionGroup")
@js.native
class BootstrapClientAccordionGroup ()
  extends typings.devexpressWeb.BootstrapClientAccordionGroup {
  /**
    * Gets the group's index within a collection of a navbar's groups.
    */
  /* CompleteClass */
  override var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the group.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Gets the navbar to which the current group belongs.
    */
  /* CompleteClass */
  override var navBar: typings.devexpressWeb.ASPxClientNavBar = js.native
  /**
    * Gets the BootstrapClientAccordion object to which the current group belongs.
    */
  /* CompleteClass */
  @JSName("navBar")
  override var navBar_BootstrapClientAccordionGroup: typings.devexpressWeb.BootstrapClientAccordion = js.native
  /**
    * Returns a value specifying whether a group is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  /**
    * Returns a value specifying whether the group is expanded.
    */
  /* CompleteClass */
  override def GetExpanded(): Boolean = js.native
  /**
    * Gets the CSS class of the icon displayed within an accordion group header badge.
    */
  /* CompleteClass */
  override def GetHeaderBadgeIconCssClass(): String = js.native
  /**
    * Gets the text displayed within an accordion group header badge.
    */
  /* CompleteClass */
  override def GetHeaderBadgeText(): String = js.native
  /**
    * Returns the group's item specified by its index. An ASPxClientNavBarItem object representing the item located at the specified index within the current group.
    * @param index An integer value specifying the zero-based index of the item to be retrieved.
    */
  /* CompleteClass */
  override def GetItem(index: Double): typings.devexpressWeb.ASPxClientNavBarItem = js.native
  /**
    * Returns a group item specified by its name. An ASPxClientNavBarItem object that represents the item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  /* CompleteClass */
  override def GetItemByName(name: String): typings.devexpressWeb.ASPxClientNavBarItem = js.native
  /**
    * Returns the number of items in the group.
    */
  /* CompleteClass */
  override def GetItemCount(): Double = js.native
  /**
    * Returns text displayed within a group.
    */
  /* CompleteClass */
  override def GetText(): String = js.native
  /**
    * Returns a value specifying whether a group is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  /**
    * Sets the group's expansion state.
    * @param value true to expand the group; false to collapse the group.
    */
  /* CompleteClass */
  override def SetExpanded(value: Boolean): Unit = js.native
  /**
    * Sets the CSS class of the icon displayed within an accordion group header badge.
    * @param cssClass A String containing the name of a CSS class.
    */
  /* CompleteClass */
  override def SetHeaderBadgeIconCssClass(cssClass: String): Unit = js.native
  /**
    * Sets the text displayed within an accordion group header badge.
    * @param text A String specifying the badge text.
    */
  /* CompleteClass */
  override def SetHeaderBadgeText(text: String): Unit = js.native
  /**
    * Specifies the text displayed within a group.
    * @param text A string value that is the text displayed within the navbar group.
    */
  /* CompleteClass */
  override def SetText(text: String): Unit = js.native
  /**
    * Specifies whether the group is visible.
    * @param value true if the group is visible; otherwise, false.
    */
  /* CompleteClass */
  override def SetVisible(value: Boolean): Unit = js.native
}

