package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the BootstrapListEditItem object.
  */
@JSGlobal("BootstrapClientListBoxItem")
@js.native
class BootstrapClientListBoxItem () extends ASPxClientListEditItem {
  /**
    * Gets the CSS class of the icon displayed by the list box item.
    */
  var iconCssClass: String = js.native
  def GetFieldText(fieldIndex: String): String = js.native
  /**
    * Returns the list item's text value that corresponds to a data field specified by its index. A string value representing the list item's text value that corresponds to the specified data field.
    * @param fieldIndex An integer value that specifies the field's index within the editor's Fields collection.
    */
  def GetFieldText(fieldIndex: Double): String = js.native
}

