package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Floating Action Button's BootstrapFABAction object.
  */
@JSGlobal("BootstrapClientFABAction")
@js.native
class BootstrapClientFABAction ()
  extends typings.devexpressWeb.BootstrapClientFABAction {
  /* CompleteClass */
  override def GetActionIconCssClass(): String = js.native
  /**
    * Gets the FAB action item. Specifies the FAB action item.
    * @param index Specifies the item's index in the collection.
    */
  /* CompleteClass */
  override def GetActionItem(index: Double): typings.devexpressWeb.ASPxClientFABActionItem = js.native
  /**
    * Returns an action item with the specified name. An ASPxClientFABActionItem that is the action item with the specified name.
    * @param name A string value specifying the action item name.
    */
  /* CompleteClass */
  override def GetActionItemByName(name: String): typings.devexpressWeb.ASPxClientFABActionItem = js.native
  /**
    * Returns the number of items in the action/action group.
    */
  /* CompleteClass */
  override def GetActionItemCount(): Double = js.native
  /**
    * Gets the action item's name.
    */
  /* CompleteClass */
  override def GetActionName(): String = js.native
  /* CompleteClass */
  override def GetBadgeCssClass(): String = js.native
  /* CompleteClass */
  override def GetBadgeIconCssClass(): String = js.native
  /* CompleteClass */
  override def GetBadgeText(): String = js.native
  /* CompleteClass */
  override def GetCollapseIconCssClass(): String = js.native
  /**
    * Gets the FAB action's context name.
    */
  /* CompleteClass */
  override def GetContextName(): String = js.native
  /* CompleteClass */
  override def GetExpandIconCssClass(): String = js.native
  /**
    * Gets the action item's text.
    */
  /* CompleteClass */
  override def GetText(): String = js.native
  /**
    * Returns a value specifying whether an action item is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  /* CompleteClass */
  override def SetActionIconCssClass(cssClass: String): Unit = js.native
  /* CompleteClass */
  override def SetBadgeCssClass(cssClass: String): Unit = js.native
  /* CompleteClass */
  override def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  /* CompleteClass */
  override def SetBadgeText(text: String): Unit = js.native
  /* CompleteClass */
  override def SetCollapseIconCssClass(cssClass: String): Unit = js.native
  /* CompleteClass */
  override def SetExpandIconCssClass(cssClass: String): Unit = js.native
  /**
    * Specifies the action item's text.
    * @param value A string value that specifies the action item's text.
    */
  /* CompleteClass */
  override def SetText(value: String): Unit = js.native
  /**
    * Specifies the action item's visibility.
    * @param value true, if the action item is visible; otherwise, false.
    */
  /* CompleteClass */
  override def SetVisible(value: Boolean): Unit = js.native
}

