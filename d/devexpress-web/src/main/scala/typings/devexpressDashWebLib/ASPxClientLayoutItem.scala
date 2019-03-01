package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxFormLayout's LayoutItem object.
  */
trait ASPxClientLayoutItem extends js.Object {
  /**
    * Gets the form layout object to which the current item belongs.
    * Value: An <see cref="ASPxClientFormLayout" /> object representing the form layout to which the item belongs.
    */
  var formLayout: ASPxClientFormLayout
  /**
    * Gets the name that uniquely identifies the layout item.
    * Value: A string value that represents the value assigned to the layout item's Name property.
    */
  var name: java.lang.String
  /**
    * Gets the immediate parent layout item to which the current layout item belongs.
    * Value: An <see cref="ASPxClientLayoutItem" /> object representing the item's immediate parent.
    */
  var parent: ASPxClientLayoutItem
  /**
    * Returns the text displayed in the layout item caption.
    */
  def GetCaption(): java.lang.String
  /**
    * Returns the current layout item's subitem specified by its name.
    * @param name A string value specifying the name of the layout item.
    */
  def GetItemByName(name: java.lang.String): ASPxClientLayoutItem
  /**
    * Returns a value specifying whether a layout item is displayed.
    */
  def GetVisible(): scala.Boolean
  /**
    * Specifies the text displayed in the layout item caption.
    * @param caption A string value specifying the item caption.
    */
  def SetCaption(caption: java.lang.String): scala.Unit
  /**
    * Specifies the layout item's visibility.
    * @param value true, if the layout item is visible; otherwise, false.
    */
  def SetVisible(value: scala.Boolean): scala.Unit
}

object ASPxClientLayoutItem {
  @scala.inline
  def apply(
    GetCaption: js.Function0[java.lang.String],
    GetItemByName: js.Function1[java.lang.String, ASPxClientLayoutItem],
    GetVisible: js.Function0[scala.Boolean],
    SetCaption: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    formLayout: ASPxClientFormLayout,
    name: java.lang.String,
    parent: ASPxClientLayoutItem
  ): ASPxClientLayoutItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetCaption")(GetCaption)
    __obj.updateDynamic("GetItemByName")(GetItemByName)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("SetCaption")(SetCaption)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("formLayout")(formLayout)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ASPxClientLayoutItem]
  }
}

