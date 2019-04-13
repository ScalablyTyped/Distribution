package typings
package expressDashMysqlDashSessionLib.expressDashMysqlDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var columnNames: ColumnNames
  var tableName: java.lang.String
}

object Schema {
  @scala.inline
  def apply(columnNames: ColumnNames, tableName: java.lang.String): Schema = {
    val __obj = js.Dynamic.literal(columnNames = columnNames, tableName = tableName)
  
    __obj.asInstanceOf[Schema]
  }
}

