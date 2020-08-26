package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Floating Action Button's BootstrapFABAction object.
  */
@js.native
trait BootstrapClientFABAction extends ASPxClientFABAction {
  def GetActionIconCssClass(): String = js.native
  def GetBadgeCssClass(): String = js.native
  def GetBadgeIconCssClass(): String = js.native
  def GetBadgeText(): String = js.native
  def GetCollapseIconCssClass(): String = js.native
  def GetExpandIconCssClass(): String = js.native
  def SetActionIconCssClass(cssClass: String): Unit = js.native
  def SetBadgeCssClass(cssClass: String): Unit = js.native
  def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  def SetBadgeText(text: String): Unit = js.native
  def SetCollapseIconCssClass(cssClass: String): Unit = js.native
  def SetExpandIconCssClass(cssClass: String): Unit = js.native
}

object BootstrapClientFABAction {
  @scala.inline
  def apply(
    GetActionIconCssClass: () => String,
    GetActionItem: Double => ASPxClientFABActionItem,
    GetActionItemByName: String => ASPxClientFABActionItem,
    GetActionItemCount: () => Double,
    GetActionName: () => String,
    GetBadgeCssClass: () => String,
    GetBadgeIconCssClass: () => String,
    GetBadgeText: () => String,
    GetCollapseIconCssClass: () => String,
    GetContextName: () => String,
    GetExpandIconCssClass: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetActionIconCssClass: String => Unit,
    SetBadgeCssClass: String => Unit,
    SetBadgeIconCssClass: String => Unit,
    SetBadgeText: String => Unit,
    SetCollapseIconCssClass: String => Unit,
    SetExpandIconCssClass: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit
  ): BootstrapClientFABAction = {
    val __obj = js.Dynamic.literal(GetActionIconCssClass = js.Any.fromFunction0(GetActionIconCssClass), GetActionItem = js.Any.fromFunction1(GetActionItem), GetActionItemByName = js.Any.fromFunction1(GetActionItemByName), GetActionItemCount = js.Any.fromFunction0(GetActionItemCount), GetActionName = js.Any.fromFunction0(GetActionName), GetBadgeCssClass = js.Any.fromFunction0(GetBadgeCssClass), GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetCollapseIconCssClass = js.Any.fromFunction0(GetCollapseIconCssClass), GetContextName = js.Any.fromFunction0(GetContextName), GetExpandIconCssClass = js.Any.fromFunction0(GetExpandIconCssClass), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetActionIconCssClass = js.Any.fromFunction1(SetActionIconCssClass), SetBadgeCssClass = js.Any.fromFunction1(SetBadgeCssClass), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetCollapseIconCssClass = js.Any.fromFunction1(SetCollapseIconCssClass), SetExpandIconCssClass = js.Any.fromFunction1(SetExpandIconCssClass), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible))
    __obj.asInstanceOf[BootstrapClientFABAction]
  }
  @scala.inline
  implicit class BootstrapClientFABActionOps[Self <: BootstrapClientFABAction] (val x: Self) extends AnyVal {
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
    def setGetActionIconCssClass(value: () => String): Self = this.set("GetActionIconCssClass", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBadgeCssClass(value: () => String): Self = this.set("GetBadgeCssClass", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBadgeIconCssClass(value: () => String): Self = this.set("GetBadgeIconCssClass", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBadgeText(value: () => String): Self = this.set("GetBadgeText", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCollapseIconCssClass(value: () => String): Self = this.set("GetCollapseIconCssClass", js.Any.fromFunction0(value))
    @scala.inline
    def setGetExpandIconCssClass(value: () => String): Self = this.set("GetExpandIconCssClass", js.Any.fromFunction0(value))
    @scala.inline
    def setSetActionIconCssClass(value: String => Unit): Self = this.set("SetActionIconCssClass", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBadgeCssClass(value: String => Unit): Self = this.set("SetBadgeCssClass", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBadgeIconCssClass(value: String => Unit): Self = this.set("SetBadgeIconCssClass", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBadgeText(value: String => Unit): Self = this.set("SetBadgeText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCollapseIconCssClass(value: String => Unit): Self = this.set("SetCollapseIconCssClass", js.Any.fromFunction1(value))
    @scala.inline
    def setSetExpandIconCssClass(value: String => Unit): Self = this.set("SetExpandIconCssClass", js.Any.fromFunction1(value))
  }
  
}

