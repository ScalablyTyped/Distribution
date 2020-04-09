package typings.expressMysqlSession.mod

import typings.expressMysqlSession.PartialColumnNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var columnNames: PartialColumnNames
  var tableName: String
}

object Schema {
  @scala.inline
  def apply(columnNames: PartialColumnNames, tableName: String): Schema = {
    val __obj = js.Dynamic.literal(columnNames = columnNames.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Schema]
  }
}

