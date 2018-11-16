package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DatasetReference extends js.Object {
  /**
               * [Required] A unique ID for this dataset, without the project name. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The
               * maximum length is 1,024 characters.
               */
  var datasetId: js.UndefOr[java.lang.String] = js.undefined
  /** [Optional] The ID of the project containing this dataset. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
}

