package typings.expressDashMysqlDashSession.expressDashMysqlDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var columnNames: ColumnNames
  var tableName: String
}

object Schema {
  @scala.inline
  def apply(columnNames: ColumnNames, tableName: String): Schema = {
    val __obj = js.Dynamic.literal(columnNames = columnNames, tableName = tableName)
  
    __obj.asInstanceOf[Schema]
  }
}

