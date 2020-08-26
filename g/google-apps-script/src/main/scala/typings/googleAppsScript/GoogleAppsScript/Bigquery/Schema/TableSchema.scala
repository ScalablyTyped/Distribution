package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableSchema extends js.Object {
  var fields: js.UndefOr[js.Array[TableFieldSchema]] = js.native
}

object TableSchema {
  @scala.inline
  def apply(): TableSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSchema]
  }
  @scala.inline
  implicit class TableSchemaOps[Self <: TableSchema] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: TableFieldSchema*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[TableFieldSchema]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

