package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the floating action button's action object.
  */
@js.native
trait ASPxClientFABAction extends ASPxClientFABActionItemBase {
  /**
    * Gets the FAB action item. Specifies the FAB action item.
    * @param index Specifies the item's index in the collection.
    */
  def GetActionItem(index: Double): ASPxClientFABActionItem = js.native
  /**
    * Returns an action item with the specified name. An ASPxClientFABActionItem that is the action item with the specified name.
    * @param name A string value specifying the action item name.
    */
  def GetActionItemByName(name: String): ASPxClientFABActionItem = js.native
  /**
    * Returns the number of items in the action/action group.
    */
  def GetActionItemCount(): Double = js.native
  /**
    * Gets the FAB action's context name.
    */
  def GetContextName(): String = js.native
}

object ASPxClientFABAction {
  @scala.inline
  def apply(
    GetActionItem: Double => ASPxClientFABActionItem,
    GetActionItemByName: String => ASPxClientFABActionItem,
    GetActionItemCount: () => Double,
    GetActionName: () => String,
    GetContextName: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetText: String => Unit,
    SetVisible: Boolean => Unit
  ): ASPxClientFABAction = {
    val __obj = js.Dynamic.literal(GetActionItem = js.Any.fromFunction1(GetActionItem), GetActionItemByName = js.Any.fromFunction1(GetActionItemByName), GetActionItemCount = js.Any.fromFunction0(GetActionItemCount), GetActionName = js.Any.fromFunction0(GetActionName), GetContextName = js.Any.fromFunction0(GetContextName), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible))
    __obj.asInstanceOf[ASPxClientFABAction]
  }
  @scala.inline
  implicit class ASPxClientFABActionOps[Self <: ASPxClientFABAction] (val x: Self) extends AnyVal {
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
    def setGetActionItem(value: Double => ASPxClientFABActionItem): Self = this.set("GetActionItem", js.Any.fromFunction1(value))
    @scala.inline
    def setGetActionItemByName(value: String => ASPxClientFABActionItem): Self = this.set("GetActionItemByName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetActionItemCount(value: () => Double): Self = this.set("GetActionItemCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContextName(value: () => String): Self = this.set("GetContextName", js.Any.fromFunction0(value))
  }
  
}

