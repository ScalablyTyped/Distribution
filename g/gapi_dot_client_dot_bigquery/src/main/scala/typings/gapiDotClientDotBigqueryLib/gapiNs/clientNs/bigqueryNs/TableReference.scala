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

