package typings.googleapis.anon

import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertId extends js.Object {
  var insertId: js.UndefOr[String] = js.native
  var json: js.UndefOr[SchemaJsonObject] = js.native
}

object InsertId {
  @scala.inline
  def apply(insertId: String = null, json: SchemaJsonObject = null): InsertId = {
    val __obj = js.Dynamic.literal()
    if (insertId != null) __obj.updateDynamic("insertId")(insertId.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertId]
  }
}

