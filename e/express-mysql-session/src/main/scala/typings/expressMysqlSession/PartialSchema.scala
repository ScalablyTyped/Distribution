package typings.expressMysqlSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<express-mysql-session.express-mysql-session.Schema> */
trait PartialSchema extends js.Object {
  var columnNames: js.UndefOr[PartialColumnNames] = js.undefined
  var tableName: js.UndefOr[String] = js.undefined
}

object PartialSchema {
  @scala.inline
  def apply(columnNames: PartialColumnNames = null, tableName: String = null): PartialSchema = {
    val __obj = js.Dynamic.literal()
    if (columnNames != null) __obj.updateDynamic("columnNames")(columnNames.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSchema]
  }
}

