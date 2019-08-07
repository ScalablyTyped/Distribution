package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base class for classes that serves as a client-side equivalent of the floating action button's action and action item objects.
  */
@JSGlobal("ASPxClientFABActionItemBase")
@js.native
class ASPxClientFABActionItemBase () extends js.Object {
  /**
    * Gets the action item's name.
    */
  def GetActionName(): String = js.native
  /**
    * Gets the action item's text.
    */
  def GetText(): String = js.native
  /**
    * Returns a value specifying whether an action item is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Specifies the action item's text.
    * @param value A string value that specifies the action item's text.
    */
  def SetText(value: String): Unit = js.native
  /**
    * Specifies the action item's visibility.
    * @param value true, if the action item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit = js.native
}

