package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Floating Action Button's BootstrapFABActionItem object.
  */
@JSGlobal("BootstrapClientFABActionItem")
@js.native
class BootstrapClientFABActionItem ()
  extends typings.devexpressWeb.BootstrapClientFABActionItem {
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
  override def GetIconCssClass(): String = js.native
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
  override def SetBadgeCssClass(cssClass: String): Unit = js.native
  /* CompleteClass */
  override def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  /* CompleteClass */
  override def SetBadgeText(text: String): Unit = js.native
  /* CompleteClass */
  override def SetIconCssClass(cssClass: String): Unit = js.native
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

