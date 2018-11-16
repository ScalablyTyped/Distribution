package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateJobFromTemplateRequest extends js.Object {
  /** The runtime environment for the job. */
  var environment: js.UndefOr[RuntimeEnvironment] = js.undefined
  /**
               * Required. A Cloud Storage path to the template from which to
               * create the job.
               * Must be a valid Cloud Storage URL, beginning with `gs://`.
               */
  var gcsPath: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The job name to use for the created job. */
  var jobName: js.UndefOr[java.lang.String] = js.undefined
  /** The location to which to direct the request. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** The runtime parameters to pass to the job. */
  var parameters: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

