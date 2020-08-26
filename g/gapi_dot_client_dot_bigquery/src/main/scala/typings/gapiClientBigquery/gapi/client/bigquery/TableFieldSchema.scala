package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableFieldSchema extends js.Object {
  /** [Optional] The field description. The maximum length is 1,024 characters. */
  var description: js.UndefOr[String] = js.native
  /** [Optional] Describes the nested schema fields if the type property is set to RECORD. */
  var fields: js.UndefOr[js.Array[TableFieldSchema]] = js.native
  /** [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default value is NULLABLE. */
  var mode: js.UndefOr[String] = js.native
  /**
    * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_), and must start with a letter or
    * underscore. The maximum length is 128 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as INTEGER), FLOAT, FLOAT64 (same as FLOAT), BOOLEAN, BOOL
    * (same as BOOLEAN), TIMESTAMP, DATE, TIME, DATETIME, RECORD (where RECORD indicates that the field contains a nested schema) or STRUCT (same as RECORD).
    */
  var `type`: js.UndefOr[String] = js.native
}

object TableFieldSchema {
  @scala.inline
  def apply(): TableFieldSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableFieldSchema]
  }
  @scala.inline
  implicit class TableFieldSchemaOps[Self <: TableFieldSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: TableFieldSchema*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[TableFieldSchema]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

