package typings.gapiDotClientDotBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableFieldSchema extends js.Object {
  /** [Optional] The field description. The maximum length is 1,024 characters. */
  var description: js.UndefOr[String] = js.undefined
  /** [Optional] Describes the nested schema fields if the type property is set to RECORD. */
  var fields: js.UndefOr[js.Array[TableFieldSchema]] = js.undefined
  /** [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default value is NULLABLE. */
  var mode: js.UndefOr[String] = js.undefined
  /**
    * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_), and must start with a letter or
    * underscore. The maximum length is 128 characters.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as INTEGER), FLOAT, FLOAT64 (same as FLOAT), BOOLEAN, BOOL
    * (same as BOOLEAN), TIMESTAMP, DATE, TIME, DATETIME, RECORD (where RECORD indicates that the field contains a nested schema) or STRUCT (same as RECORD).
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object TableFieldSchema {
  @scala.inline
  def apply(
    description: String = null,
    fields: js.Array[TableFieldSchema] = null,
    mode: String = null,
    name: String = null,
    `type`: String = null
  ): TableFieldSchema = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableFieldSchema]
  }
}

