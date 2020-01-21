package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxFormLayout object.
  */
@JSGlobal("ASPxClientFormLayout")
@js.native
class ASPxClientFormLayout () extends ASPxClientControl {
  /**
    * Allows you not to render the control to perform required operations on the client side until you call the EndUpdate method.
    */
  def BeginUpdate(): Unit = js.native
  /**
    * Allows the control to be re-rendered after you call the BeginUpdate method and perform the required operations on the client side. This method also forces an immediate control's re-rendering.
    */
  def EndUpdate(): Unit = js.native
  /**
    * Returns an item specified by its name. An ASPxClientLayoutItem object that represents the item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemByName(name: String): ASPxClientLayoutItem = js.native
}

/* static members */
@JSGlobal("ASPxClientFormLayout")
@js.native
object ASPxClientFormLayout extends js.Object {
  /**
    * Converts the specified object to the ASPxClientFormLayout type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientFormLayout = js.native
}

