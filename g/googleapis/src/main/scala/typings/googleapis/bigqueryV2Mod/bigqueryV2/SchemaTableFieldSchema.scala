package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.AnonNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTableFieldSchema extends js.Object {
  /**
    * [Optional] The categories attached to this field, used for field-level
    * access control.
    */
  var categories: js.UndefOr[AnonNames] = js.native
  /**
    * [Optional] The field description. The maximum length is 1,024 characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Optional] Describes the nested schema fields if the type property is set
    * to RECORD.
    */
  var fields: js.UndefOr[js.Array[SchemaTableFieldSchema]] = js.native
  /**
    * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and
    * REPEATED. The default value is NULLABLE.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * [Required] The field name. The name must contain only letters (a-z, A-Z),
    * numbers (0-9), or underscores (_), and must start with a letter or
    * underscore. The maximum length is 128 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Required] The field data type. Possible values include STRING, BYTES,
    * INTEGER, INT64 (same as INTEGER), FLOAT, FLOAT64 (same as FLOAT),
    * BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP, DATE, TIME, DATETIME, RECORD
    * (where RECORD indicates that the field contains a nested schema) or
    * STRUCT (same as RECORD).
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaTableFieldSchema {
  @scala.inline
  def apply(
    categories: AnonNames = null,
    description: String = null,
    fields: js.Array[SchemaTableFieldSchema] = null,
    mode: String = null,
    name: String = null,
    `type`: String = null
  ): SchemaTableFieldSchema = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableFieldSchema]
  }
}

