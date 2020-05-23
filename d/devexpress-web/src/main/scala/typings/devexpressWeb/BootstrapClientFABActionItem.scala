package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Floating Action Button's BootstrapFABActionItem object.
  */
trait BootstrapClientFABActionItem extends ASPxClientFABActionItemBase {
  def GetBadgeCssClass(): String
  def GetBadgeIconCssClass(): String
  def GetBadgeText(): String
  def GetIconCssClass(): String
  def SetBadgeCssClass(cssClass: String): Unit
  def SetBadgeIconCssClass(cssClass: String): Unit
  def SetBadgeText(text: String): Unit
  def SetIconCssClass(cssClass: String): Unit
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
}

