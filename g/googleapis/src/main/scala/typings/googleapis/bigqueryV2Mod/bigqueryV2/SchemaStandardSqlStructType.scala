package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStandardSqlStructType extends js.Object {
  var fields: js.UndefOr[js.Array[SchemaStandardSqlField]] = js.native
}

object SchemaStandardSqlStructType {
  @scala.inline
  def apply(fields: js.Array[SchemaStandardSqlField] = null): SchemaStandardSqlStructType = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStandardSqlStructType]
  }
}

