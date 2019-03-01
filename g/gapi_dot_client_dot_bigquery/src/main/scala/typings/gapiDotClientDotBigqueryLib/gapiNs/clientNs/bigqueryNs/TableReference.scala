package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableReference extends js.Object {
  /** [Required] The ID of the dataset containing this table. */
  var datasetId: js.UndefOr[java.lang.String] = js.undefined
  /** [Required] The ID of the project containing this table. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** [Required] The ID of the table. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters. */
  var tableId: js.UndefOr[java.lang.String] = js.undefined
}

object TableReference {
  @scala.inline
  def apply(
    datasetId: java.lang.String = null,
    projectId: java.lang.String = null,
    tableId: java.lang.String = null
  ): TableReference = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (tableId != null) __obj.updateDynamic("tableId")(tableId)
    __obj.asInstanceOf[TableReference]
  }
}

