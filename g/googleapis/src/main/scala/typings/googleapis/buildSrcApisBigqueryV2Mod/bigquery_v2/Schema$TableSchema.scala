package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TableSchema extends js.Object {
  /**
    * Describes the fields in a table.
    */
  var fields: js.UndefOr[js.Array[Schema$TableFieldSchema]] = js.native
}

object Schema$TableSchema {
  @scala.inline
  def apply(fields: js.Array[Schema$TableFieldSchema] = null): Schema$TableSchema = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableSchema]
  }
}

