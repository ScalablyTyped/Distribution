package typings.expoSqlite.sqliteTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SQLResultSet extends js.Object {
  var insertId: Double = js.native
  var rows: SQLResultSetRowList = js.native
  var rowsAffected: Double = js.native
}

object SQLResultSet {
  @scala.inline
  def apply(insertId: Double, rows: SQLResultSetRowList, rowsAffected: Double): SQLResultSet = {
    val __obj = js.Dynamic.literal(insertId = insertId.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLResultSet]
  }
  @scala.inline
  implicit class SQLResultSetOps[Self <: SQLResultSet] (val x: Self) extends AnyVal {
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
    def setInsertId(value: Double): Self = this.set("insertId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: SQLResultSetRowList): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsAffected(value: Double): Self = this.set("rowsAffected", value.asInstanceOf[js.Any])
  }
  
}

