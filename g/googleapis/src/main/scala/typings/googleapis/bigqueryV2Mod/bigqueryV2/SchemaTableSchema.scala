package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTableSchema extends js.Object {
  /**
    * Describes the fields in a table.
    */
  var fields: js.UndefOr[js.Array[SchemaTableFieldSchema]] = js.native
}

object SchemaTableSchema {
  @scala.inline
  def apply(): SchemaTableSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableSchema]
  }
  @scala.inline
  implicit class SchemaTableSchemaOps[Self <: SchemaTableSchema] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: SchemaTableFieldSchema*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[SchemaTableFieldSchema]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

