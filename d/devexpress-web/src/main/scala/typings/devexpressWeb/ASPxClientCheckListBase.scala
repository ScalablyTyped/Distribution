package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base type for the ASPxClientCheckBoxList and ASPxClientRadioButtonList objects.
  */
@JSGlobal("ASPxClientCheckListBase")
@js.native
class ASPxClientCheckListBase () extends ASPxClientListEdit {
  /**
    * Returns the editor's item specified by its index. An ASPxClientListEditItem object that is the item located at the specified index.
    * @param index An integer value specifying the zero-based index of the item to be retrieved.
    */
  def GetItem(index: Double): ASPxClientListEditItem = js.native
  /**
    * Gets the number of items contained in the editor's item collection.
    */
  def GetItemCount(): Double = js.native
}

