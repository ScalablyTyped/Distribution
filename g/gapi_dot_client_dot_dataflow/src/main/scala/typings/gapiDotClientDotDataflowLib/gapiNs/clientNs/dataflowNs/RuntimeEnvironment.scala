package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RuntimeEnvironment extends js.Object {
  /**
               * Whether to bypass the safety checks for the job's temporary directory.
               * Use with caution.
               */
  var bypassTempDirValidation: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * The machine type to use for the job. Defaults to the value from the
               * template if not specified.
               */
  var machineType: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The maximum number of Google Compute Engine instances to be made
               * available to your pipeline during execution, from 1 to 1000.
               */
  var maxWorkers: js.UndefOr[scala.Double] = js.undefined
  /** The email address of the service account to run the job as. */
  var serviceAccountEmail: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The Cloud Storage path to use for temporary files.
               * Must be a valid Cloud Storage URL, beginning with `gs://`.
               */
  var tempLocation: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The Compute Engine [availability
               * zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones)
               * for launching worker instances to run your pipeline.
               */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

