package typings
package gapiDotClientDotBigqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InsertId extends js.Object {
  /** [Optional] A unique ID for each row. BigQuery uses this property to detect duplicate insertion requests on a best-effort basis. */
  var insertId: js.UndefOr[java.lang.String] = js.undefined
  /** [Required] A JSON object that contains a row of data. The object's properties and values must match the destination table's schema. */
  var json: js.UndefOr[gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.JsonObject] = js.undefined
}

object Anon_InsertId {
  @scala.inline
  def apply(
    insertId: java.lang.String = null,
    json: gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.JsonObject = null
  ): Anon_InsertId = {
    val __obj = js.Dynamic.literal()
    if (insertId != null) __obj.updateDynamic("insertId")(insertId)
    if (json != null) __obj.updateDynamic("json")(json)
    __obj.asInstanceOf[Anon_InsertId]
  }
}

