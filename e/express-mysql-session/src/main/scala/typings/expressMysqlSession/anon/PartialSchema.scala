package typings.expressMysqlSession.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<express-mysql-session.express-mysql-session.Schema> */
@js.native
trait PartialSchema extends js.Object {
  
  var columnNames: js.UndefOr[PartialColumnNames] = js.native
  
  var tableName: js.UndefOr[String] = js.native
}
object PartialSchema {
  
  @scala.inline
  def apply(): PartialSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSchema]
  }
  
  @scala.inline
  implicit class PartialSchemaOps[Self <: PartialSchema] (val x: Self) extends AnyVal {
    
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
    def setColumnNames(value: PartialColumnNames): Self = this.set("columnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnNames: Self = this.set("columnNames", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
  }
}
