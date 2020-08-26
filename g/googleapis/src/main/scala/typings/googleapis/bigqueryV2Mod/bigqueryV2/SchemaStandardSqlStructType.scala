package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStandardSqlStructType extends js.Object {
  var fields: js.UndefOr[js.Array[SchemaStandardSqlField]] = js.native
}

object SchemaStandardSqlStructType {
  @scala.inline
  def apply(): SchemaStandardSqlStructType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStandardSqlStructType]
  }
  @scala.inline
  implicit class SchemaStandardSqlStructTypeOps[Self <: SchemaStandardSqlStructType] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: SchemaStandardSqlField*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[SchemaStandardSqlField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

