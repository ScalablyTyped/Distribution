package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update the properties of a TableCell.
  */
@js.native
trait Schema$UpdateTableCellPropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `tableCellProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the table cell background solid fill color, set
    * `fields` to `&quot;tableCellBackgroundFill.solidFill.color&quot;`.  To
    * reset a property to its default value, include its field name in the
    * field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The table cell properties to update.
    */
  var tableCellProperties: js.UndefOr[Schema$TableCellProperties] = js.native
  /**
    * The table range representing the subset of the table to which the updates
    * are applied. If a table range is not specified, the updates will apply to
    * the entire table.
    */
  var tableRange: js.UndefOr[Schema$TableRange] = js.native
}

object Schema$UpdateTableCellPropertiesRequest {
  @scala.inline
  def apply(
    fields: String = null,
    objectId: String = null,
    tableCellProperties: Schema$TableCellProperties = null,
    tableRange: Schema$TableRange = null
  ): Schema$UpdateTableCellPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (tableCellProperties != null) __obj.updateDynamic("tableCellProperties")(tableCellProperties.asInstanceOf[js.Any])
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateTableCellPropertiesRequest]
  }
}

