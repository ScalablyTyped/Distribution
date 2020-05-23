package typings.gapiClientSqladmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaOnly extends js.Object {
  /** Export only schemas. */
  var schemaOnly: js.UndefOr[Boolean] = js.undefined
  /** Tables to export, or that were exported, from the specified database. If you specify tables, specify one and only one database. */
  var tables: js.UndefOr[js.Array[String]] = js.undefined
}

object SchemaOnly {
  @scala.inline
  def apply(schemaOnly: js.UndefOr[Boolean] = js.undefined, tables: js.Array[String] = null): SchemaOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(schemaOnly)) __obj.updateDynamic("schemaOnly")(schemaOnly.get.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOnly]
  }
}

