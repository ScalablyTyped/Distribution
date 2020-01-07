package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$StandardSqlStructType extends js.Object {
  var fields: js.UndefOr[js.Array[Schema$StandardSqlField]] = js.native
}

object Schema$StandardSqlStructType {
  @scala.inline
  def apply(fields: js.Array[Schema$StandardSqlField] = null): Schema$StandardSqlStructType = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StandardSqlStructType]
  }
}

