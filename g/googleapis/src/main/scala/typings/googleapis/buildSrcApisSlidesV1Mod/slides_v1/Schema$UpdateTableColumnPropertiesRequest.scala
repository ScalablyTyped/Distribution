package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the properties of a Table column.
  */
@js.native
trait Schema$UpdateTableColumnPropertiesRequest extends js.Object {
  /**
    * The list of zero-based indices specifying which columns to update. If no
    * indices are provided, all columns in the table will be updated.
    */
  var columnIndices: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `tableColumnProperties` is implied and should not be specified.
    * A single `&quot;*&quot;` can be used as short-hand for listing every
    * field.  For example to update the column width, set `fields` to
    * `&quot;column_width&quot;`.  If &#39;&quot;column_width&quot;&#39; is
    * included in the field mask but the property is left unset, the column
    * width will default to 406,400 EMU (32 points).
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The table column properties to update.  If the value of
    * `table_column_properties#column_width` in the request is less than
    * 406,400 EMU (32 points), a 400 bad request error is returned.
    */
  var tableColumnProperties: js.UndefOr[Schema$TableColumnProperties] = js.native
}

object Schema$UpdateTableColumnPropertiesRequest {
  @scala.inline
  def apply(
    columnIndices: js.Array[Double] = null,
    fields: String = null,
    objectId: String = null,
    tableColumnProperties: Schema$TableColumnProperties = null
  ): Schema$UpdateTableColumnPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (columnIndices != null) __obj.updateDynamic("columnIndices")(columnIndices.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (tableColumnProperties != null) __obj.updateDynamic("tableColumnProperties")(tableColumnProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateTableColumnPropertiesRequest]
  }
}

