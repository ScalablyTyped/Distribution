package typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableSchema extends js.Object {
  /** Describes the fields in a table. */
  var fields: js.UndefOr[js.Array[TableFieldSchema]] = js.undefined
}

object TableSchema {
  @scala.inline
  def apply(fields: js.Array[TableFieldSchema] = null): TableSchema = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[TableSchema]
  }
}

