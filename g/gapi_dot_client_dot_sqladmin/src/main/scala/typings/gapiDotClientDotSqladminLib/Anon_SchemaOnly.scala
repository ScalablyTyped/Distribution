package typings
package gapiDotClientDotSqladminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SchemaOnly extends js.Object {
  /** Export only schemas. */
  var schemaOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Tables to export, or that were exported, from the specified database. If you specify tables, specify one and only one database. */
  var tables: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_SchemaOnly {
  @scala.inline
  def apply(schemaOnly: js.UndefOr[scala.Boolean] = js.undefined, tables: js.Array[java.lang.String] = null): Anon_SchemaOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(schemaOnly)) __obj.updateDynamic("schemaOnly")(schemaOnly)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    __obj.asInstanceOf[Anon_SchemaOnly]
  }
}

