package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MysqlExportOptions extends js.Object {
  var mysqlExportOptions: js.UndefOr[MasterData] = js.native
  var schemaOnly: js.UndefOr[Boolean] = js.native
  var tables: js.UndefOr[js.Array[String]] = js.native
}

object MysqlExportOptions {
  @scala.inline
  def apply(
    mysqlExportOptions: MasterData = null,
    schemaOnly: js.UndefOr[Boolean] = js.undefined,
    tables: js.Array[String] = null
  ): MysqlExportOptions = {
    val __obj = js.Dynamic.literal()
    if (mysqlExportOptions != null) __obj.updateDynamic("mysqlExportOptions")(mysqlExportOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(schemaOnly)) __obj.updateDynamic("schemaOnly")(schemaOnly.get.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MysqlExportOptions]
  }
}

