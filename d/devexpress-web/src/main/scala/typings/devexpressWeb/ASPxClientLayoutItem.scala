package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxFormLayout's LayoutItem object.
  */
@JSGlobal("ASPxClientLayoutItem")
@js.native
class ASPxClientLayoutItem () extends js.Object {
  /**
    * Gets the form layout object to which the current item belongs.
    */
  var formLayout: ASPxClientFormLayout = js.native
  /**
    * Gets the name that uniquely identifies the layout item.
    */
  var name: String = js.native
  /**
    * Gets the immediate parent layout item to which the current layout item belongs.
    */
  var parent: ASPxClientLayoutItem = js.native
  /**
    * Returns the text displayed in the layout item caption.
    */
  def GetCaption(): String = js.native
  /**
    * Returns the current layout item's subitem specified by its name. An ASPxClientLayoutItem object that represents the current layout item's subitem with the specified name.
    * @param name A string value specifying the name of the layout item.
    */
  def GetItemByName(name: String): ASPxClientLayoutItem = js.native
  /**
    * Returns a value specifying whether a layout item is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Specifies the text displayed in the layout item caption.
    * @param caption A string value specifying the item caption.
    */
  def SetCaption(caption: String): Unit = js.native
  /**
    * Specifies the layout item's visibility.
    * @param value true, if the layout item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit = js.native
}

