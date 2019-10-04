package typings.expoDashSqlite.buildSQLiteDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQLResultSet extends js.Object {
  var insertId: Double
  var rows: SQLResultSetRowList
  var rowsAffected: Double
}

object SQLResultSet {
  @scala.inline
  def apply(insertId: Double, rows: SQLResultSetRowList, rowsAffected: Double): SQLResultSet = {
    val __obj = js.Dynamic.literal(insertId = insertId, rows = rows, rowsAffected = rowsAffected)
  
    __obj.asInstanceOf[SQLResultSet]
  }
}

