package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeEnvironment extends js.Object {
  /**
    * Whether to bypass the safety checks for the job's temporary directory.
    * Use with caution.
    */
  var bypassTempDirValidation: js.UndefOr[Boolean] = js.undefined
  /**
    * The machine type to use for the job. Defaults to the value from the
    * template if not specified.
    */
  var machineType: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of Google Compute Engine instances to be made
    * available to your pipeline during execution, from 1 to 1000.
    */
  var maxWorkers: js.UndefOr[Double] = js.undefined
  /** The email address of the service account to run the job as. */
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  /**
    * The Cloud Storage path to use for temporary files.
    * Must be a valid Cloud Storage URL, beginning with `gs://`.
    */
  var tempLocation: js.UndefOr[String] = js.undefined
  /**
    * The Compute Engine [availability
    * zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones)
    * for launching worker instances to run your pipeline.
    */
  var zone: js.UndefOr[String] = js.undefined
}

object RuntimeEnvironment {
  @scala.inline
  def apply(
    bypassTempDirValidation: js.UndefOr[Boolean] = js.undefined,
    machineType: String = null,
    maxWorkers: Int | Double = null,
    serviceAccountEmail: String = null,
    tempLocation: String = null,
    zone: String = null
  ): RuntimeEnvironment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bypassTempDirValidation)) __obj.updateDynamic("bypassTempDirValidation")(bypassTempDirValidation.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (maxWorkers != null) __obj.updateDynamic("maxWorkers")(maxWorkers.asInstanceOf[js.Any])
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail.asInstanceOf[js.Any])
    if (tempLocation != null) __obj.updateDynamic("tempLocation")(tempLocation.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeEnvironment]
  }
}

