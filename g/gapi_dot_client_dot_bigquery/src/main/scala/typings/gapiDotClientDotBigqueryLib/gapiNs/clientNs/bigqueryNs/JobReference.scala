package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobReference extends js.Object {
  /**
    * [Required] The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024
    * characters.
    */
  var jobId: js.UndefOr[java.lang.String] = js.undefined
  /** [Required] The ID of the project containing this job. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
}

