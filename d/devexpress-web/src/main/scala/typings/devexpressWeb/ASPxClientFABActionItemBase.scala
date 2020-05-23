package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base class for classes that serves as a client-side equivalent of the floating action button's action and action item objects.
  */
trait ASPxClientFABActionItemBase extends js.Object {
  /**
    * Gets the action item's name.
    */
  def GetActionName(): String
  /**
    * Gets the action item's text.
    */
  def GetText(): String
  /**
    * Returns a value specifying whether an action item is displayed.
    */
  def GetVisible(): Boolean
  /**
    * Specifies the action item's text.
    * @param value A string value that specifies the action item's text.
    */
  def SetText(value: String): Unit
  /**
    * Specifies the action item's visibility.
    * @param value true, if the action item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit
}

object ASPxClientFABActionItemBase {
  @scala.inline
  def apply(
    GetActionName: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetText: String => Unit,
    SetVisible: Boolean => Unit
  ): ASPxClientFABActionItemBase = {
    val __obj = js.Dynamic.literal(GetActionName = js.Any.fromFunction0(GetActionName), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible))
    __obj.asInstanceOf[ASPxClientFABActionItemBase]
  }
}

