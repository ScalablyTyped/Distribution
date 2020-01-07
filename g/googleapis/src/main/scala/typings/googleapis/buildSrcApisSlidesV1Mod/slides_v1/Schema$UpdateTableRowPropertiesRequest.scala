package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the properties of a Table row.
  */
@js.native
trait Schema$UpdateTableRowPropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `tableRowProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the minimum row height, set `fields` to
    * `&quot;min_row_height&quot;`.  If &#39;&quot;min_row_height&quot;&#39; is
    * included in the field mask but the property is left unset, the minimum
    * row height will default to 0.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The list of zero-based indices specifying which rows to update. If no
    * indices are provided, all rows in the table will be updated.
    */
  var rowIndices: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The table row properties to update.
    */
  var tableRowProperties: js.UndefOr[Schema$TableRowProperties] = js.native
}

object Schema$UpdateTableRowPropertiesRequest {
  @scala.inline
  def apply(
    fields: String = null,
    objectId: String = null,
    rowIndices: js.Array[Double] = null,
    tableRowProperties: Schema$TableRowProperties = null
  ): Schema$UpdateTableRowPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (rowIndices != null) __obj.updateDynamic("rowIndices")(rowIndices.asInstanceOf[js.Any])
    if (tableRowProperties != null) __obj.updateDynamic("tableRowProperties")(tableRowProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateTableRowPropertiesRequest]
  }
}

