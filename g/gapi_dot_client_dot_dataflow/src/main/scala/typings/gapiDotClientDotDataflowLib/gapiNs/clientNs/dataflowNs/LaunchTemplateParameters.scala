package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LaunchTemplateParameters extends js.Object {
  /** The runtime environment for the job. */
  var environment: js.UndefOr[RuntimeEnvironment] = js.undefined
  /** Required. The job name to use for the created job. */
  var jobName: js.UndefOr[java.lang.String] = js.undefined
  /** The runtime parameters to pass to the job. */
  var parameters: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

