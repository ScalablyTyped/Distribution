package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A field or a column.
  */
@js.native
trait Schema$StandardSqlField extends js.Object {
  /**
    * Optional. The name of this field. Can be absent for struct fields.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. The type of this parameter. Absent if not explicitly specified
    * (e.g., CREATE FUNCTION statement can omit the return type; in this case
    * the output parameter does not have this &quot;type&quot; field).
    */
  var `type`: js.UndefOr[Schema$StandardSqlDataType] = js.native
}

object Schema$StandardSqlField {
  @scala.inline
  def apply(name: String = null, `type`: Schema$StandardSqlDataType = null): Schema$StandardSqlField = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StandardSqlField]
  }
}

