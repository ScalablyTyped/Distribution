package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Floating Action Button's BootstrapFABActionItem object.
  */
@js.native
trait BootstrapClientFABActionItem extends ASPxClientFABActionItemBase {
  def GetBadgeCssClass(): String = js.native
  def GetBadgeIconCssClass(): String = js.native
  def GetBadgeText(): String = js.native
  def GetIconCssClass(): String = js.native
  def SetBadgeCssClass(cssClass: String): Unit = js.native
  def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  def SetBadgeText(text: String): Unit = js.native
  def SetIconCssClass(cssClass: String): Unit = js.native
}

object BootstrapClientFABActionItem {
  @scala.inline
  def apply(
    GetActionName: () => String,
    GetBadgeCssClass: () => String,
    GetBadgeIconCssClass: () => String,
    GetBadgeText: () => String,
    GetIconCssClass: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetBadgeCssClass: String => Unit,
    SetBadgeIconCssClass: String => Unit,
    SetBadgeText: String => Unit,
    SetIconCssClass: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit
  ): BootstrapClientFABActionItem = {
    val __obj = js.Dynamic.literal(GetActionName = js.Any.fromFunction0(GetActionName), GetBadgeCssClass = js.Any.fromFunction0(GetBadgeCssClass), GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetIconCssClass = js.Any.fromFunction0(GetIconCssClass), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetBadgeCssClass = js.Any.fromFunction1(SetBadgeCssClass), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetIconCssClass = js.Any.fromFunction1(SetIconCssClass), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible))
    __obj.asInstanceOf[BootstrapClientFABActionItem]
  }
  @scala.inline
  implicit class BootstrapClientFABActionItemOps[Self <: BootstrapClientFABActionItem] (val x: Self) extends AnyVal {
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
    def setGetBadgeCssClass(value: () => String): Self = this.set("GetBadgeCssClass", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBadgeIconCssClass(value: () => String): Self = this.set("GetBadgeIconCssClass", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBadgeText(value: () => String): Self = this.set("GetBadgeText", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIconCssClass(value: () => String): Self = this.set("GetIconCssClass", js.Any.fromFunction0(value))
    @scala.inline
    def setSetBadgeCssClass(value: String => Unit): Self = this.set("SetBadgeCssClass", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBadgeIconCssClass(value: String => Unit): Self = this.set("SetBadgeIconCssClass", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBadgeText(value: String => Unit): Self = this.set("SetBadgeText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIconCssClass(value: String => Unit): Self = this.set("SetIconCssClass", js.Any.fromFunction1(value))
  }
  
}

