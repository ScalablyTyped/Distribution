package typings.googleapis

import typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Schema$JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_InsertId extends js.Object {
  var insertId: js.UndefOr[String] = js.native
  var json: js.UndefOr[Schema$JsonObject] = js.native
}

object Anon_InsertId {
  @scala.inline
  def apply(insertId: String = null, json: Schema$JsonObject = null): Anon_InsertId = {
    val __obj = js.Dynamic.literal()
    if (insertId != null) __obj.updateDynamic("insertId")(insertId.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InsertId]
  }
}

