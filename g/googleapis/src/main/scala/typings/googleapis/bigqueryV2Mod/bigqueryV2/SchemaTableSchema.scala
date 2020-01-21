package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTableSchema extends js.Object {
  /**
    * Describes the fields in a table.
    */
  var fields: js.UndefOr[js.Array[SchemaTableFieldSchema]] = js.native
}

object SchemaTableSchema {
  @scala.inline
  def apply(fields: js.Array[SchemaTableFieldSchema] = null): SchemaTableSchema = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableSchema]
  }
}

