package typings.gapiClientSqladmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOnly extends js.Object {
  /** Export only schemas. */
  var schemaOnly: js.UndefOr[Boolean] = js.native
  /** Tables to export, or that were exported, from the specified database. If you specify tables, specify one and only one database. */
  var tables: js.UndefOr[js.Array[String]] = js.native
}

object SchemaOnly {
  @scala.inline
  def apply(): SchemaOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOnly]
  }
  @scala.inline
  implicit class SchemaOnlyOps[Self <: SchemaOnly] (val x: Self) extends AnyVal {
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
    def setSchemaOnly(value: Boolean): Self = this.set("schemaOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaOnly: Self = this.set("schemaOnly", js.undefined)
    @scala.inline
    def setTablesVarargs(value: String*): Self = this.set("tables", js.Array(value :_*))
    @scala.inline
    def setTables(value: js.Array[String]): Self = this.set("tables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
  }
  
}

