package typings.gapiDotClientDotBigquery

import typings.gapiDotClientDotBigquery.gapi.client.bigquery.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InsertId extends js.Object {
  /** [Optional] A unique ID for each row. BigQuery uses this property to detect duplicate insertion requests on a best-effort basis. */
  var insertId: js.UndefOr[String] = js.undefined
  /** [Required] A JSON object that contains a row of data. The object's properties and values must match the destination table's schema. */
  var json: js.UndefOr[JsonObject] = js.undefined
}

object Anon_InsertId {
  @scala.inline
  def apply(insertId: String = null, json: JsonObject = null): Anon_InsertId = {
    val __obj = js.Dynamic.literal()
    if (insertId != null) __obj.updateDynamic("insertId")(insertId.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InsertId]
  }
}

