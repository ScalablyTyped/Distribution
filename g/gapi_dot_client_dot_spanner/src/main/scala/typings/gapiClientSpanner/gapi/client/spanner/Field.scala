package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  /**
    * The name of the field. For reads, this is the column name. For
    * SQL queries, it is the column alias (e.g., `"Word"` in the
    * query `"SELECT 'hello' AS Word"`), or the column name (e.g.,
    * `"ColName"` in the query `"SELECT ColName FROM Table"`). Some
    * columns might have an empty name (e.g., !"SELECT
    * UPPER(ColName)"`). Note that a query result can contain
    * multiple fields with the same name.
    */
  var name: js.UndefOr[String] = js.undefined
  /** The type of the field. */
  var `type`: js.UndefOr[Type] = js.undefined
}

object Field {
  @scala.inline
  def apply(name: String = null, `type`: Type = null): Field = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

