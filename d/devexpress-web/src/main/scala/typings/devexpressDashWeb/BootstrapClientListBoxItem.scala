package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the BootstrapListEditItem object.
  */
@js.native
trait BootstrapClientListBoxItem extends ASPxClientListEditItem {
  /**
    * Gets the CSS class of the icon displayed by the list box item.
    * Value: A string containing the name of a CSS class.
    */
  var iconCssClass: String = js.native
  /**
    * Returns the list item's text value that corresponds to a data field specified by its index.
    * @param fieldIndex An integer value that specifies the field's index within the editor's Fields collection.
    */
  def GetFieldText(fieldIndex: Double): String = js.native
  /**
    * Returns the list item's text value that corresponds to a data field specified by its name.
    * @param fieldName A string value that specifies the data field's name defined via a FieldName property.
    */
  def GetFieldText(fieldName: String): String = js.native
}

