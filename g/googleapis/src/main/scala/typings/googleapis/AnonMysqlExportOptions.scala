package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMysqlExportOptions extends js.Object {
  var mysqlExportOptions: js.UndefOr[AnonMasterData] = js.native
  var schemaOnly: js.UndefOr[Boolean] = js.native
  var tables: js.UndefOr[js.Array[String]] = js.native
}

object AnonMysqlExportOptions {
  @scala.inline
  def apply(
    mysqlExportOptions: AnonMasterData = null,
    schemaOnly: js.UndefOr[Boolean] = js.undefined,
    tables: js.Array[String] = null
  ): AnonMysqlExportOptions = {
    val __obj = js.Dynamic.literal()
    if (mysqlExportOptions != null) __obj.updateDynamic("mysqlExportOptions")(mysqlExportOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(schemaOnly)) __obj.updateDynamic("schemaOnly")(schemaOnly.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMysqlExportOptions]
  }
}

