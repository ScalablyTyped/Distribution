package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MysqlExportOptions extends js.Object {
  var mysqlExportOptions: js.UndefOr[Anon_MasterData] = js.native
  var schemaOnly: js.UndefOr[Boolean] = js.native
  var tables: js.UndefOr[js.Array[String]] = js.native
}

object Anon_MysqlExportOptions {
  @scala.inline
  def apply(
    mysqlExportOptions: Anon_MasterData = null,
    schemaOnly: js.UndefOr[Boolean] = js.undefined,
    tables: js.Array[String] = null
  ): Anon_MysqlExportOptions = {
    val __obj = js.Dynamic.literal()
    if (mysqlExportOptions != null) __obj.updateDynamic("mysqlExportOptions")(mysqlExportOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(schemaOnly)) __obj.updateDynamic("schemaOnly")(schemaOnly.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MysqlExportOptions]
  }
}

