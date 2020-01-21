package typings.googleapis

import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInsertId extends js.Object {
  var insertId: js.UndefOr[String] = js.native
  var json: js.UndefOr[SchemaJsonObject] = js.native
}

object AnonInsertId {
  @scala.inline
  def apply(insertId: String = null, json: SchemaJsonObject = null): AnonInsertId = {
    val __obj = js.Dynamic.literal()
    if (insertId != null) __obj.updateDynamic("insertId")(insertId.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInsertId]
  }
}

