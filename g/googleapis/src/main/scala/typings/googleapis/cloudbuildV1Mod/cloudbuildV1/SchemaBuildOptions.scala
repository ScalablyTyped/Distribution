package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional arguments to enable specific features of builds.
  */
@js.native
trait SchemaBuildOptions extends js.Object {
  /**
    * Requested disk size for the VM that runs the build. Note that this is
    * *NOT* &quot;disk free&quot;; some of the space will be used by the
    * operating system and build utilities. Also note that this is the minimum
    * disk size that will be allocated for the build -- the build may run with
    * a larger disk than requested. At present, the maximum disk size is
    * 1000GB; builds that request more than the maximum are rejected with an
    * error.
    */
  var diskSizeGb: js.UndefOr[String] = js.native
  /**
    * A list of global environment variable definitions that will exist for all
    * build steps in this build. If a variable is defined in both globally and
    * in a build step, the variable will use the build step value.  The
    * elements are of the form &quot;KEY=VALUE&quot; for the environment
    * variable &quot;KEY&quot; being given the value &quot;VALUE&quot;.
    */
  var env: js.UndefOr[js.Array[String]] = js.native
  /**
    * Option to define build log streaming behavior to Google Cloud Storage.
    */
  var logStreamingOption: js.UndefOr[String] = js.native
  /**
    * Option to specify the logging mode, which determines where the logs are
    * stored.
    */
  var logging: js.UndefOr[String] = js.native
  /**
    * Compute Engine machine type on which to run the build.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * Requested verifiability options.
    */
  var requestedVerifyOption: js.UndefOr[String] = js.native
  /**
    * A list of global environment variables, which are encrypted using a Cloud
    * Key Management Service crypto key. These values must be specified in the
    * build&#39;s `Secret`. These variables will be available to all build
    * steps in this build.
    */
  var secretEnv: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requested hash for SourceProvenance.
    */
  var sourceProvenanceHash: js.UndefOr[js.Array[String]] = js.native
  /**
    * Option to specify behavior when there is an error in the substitution
    * checks.
    */
  var substitutionOption: js.UndefOr[String] = js.native
  /**
    * Global list of volumes to mount for ALL build steps  Each volume is
    * created as an empty volume prior to starting the build process. Upon
    * completion of the build, volumes and their contents are discarded. Global
    * volume names and paths cannot conflict with the volumes defined a build
    * step.  Using a global volume in a build with only one step is not valid
    * as it is indicative of a build request with an incorrect configuration.
    */
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.native
  /**
    * Option to specify a `WorkerPool` for the build. User specifies the pool
    * with the format &quot;[WORKERPOOL_PROJECT_ID]/[WORKERPOOL_NAME]&quot;.
    * This is an experimental field.
    */
  var workerPool: js.UndefOr[String] = js.native
}

object SchemaBuildOptions {
  @scala.inline
  def apply(
    diskSizeGb: String = null,
    env: js.Array[String] = null,
    logStreamingOption: String = null,
    logging: String = null,
    machineType: String = null,
    requestedVerifyOption: String = null,
    secretEnv: js.Array[String] = null,
    sourceProvenanceHash: js.Array[String] = null,
    substitutionOption: String = null,
    volumes: js.Array[SchemaVolume] = null,
    workerPool: String = null
  ): SchemaBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (diskSizeGb != null) __obj.updateDynamic("diskSizeGb")(diskSizeGb.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (logStreamingOption != null) __obj.updateDynamic("logStreamingOption")(logStreamingOption.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (requestedVerifyOption != null) __obj.updateDynamic("requestedVerifyOption")(requestedVerifyOption.asInstanceOf[js.Any])
    if (secretEnv != null) __obj.updateDynamic("secretEnv")(secretEnv.asInstanceOf[js.Any])
    if (sourceProvenanceHash != null) __obj.updateDynamic("sourceProvenanceHash")(sourceProvenanceHash.asInstanceOf[js.Any])
    if (substitutionOption != null) __obj.updateDynamic("substitutionOption")(substitutionOption.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    if (workerPool != null) __obj.updateDynamic("workerPool")(workerPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildOptions]
  }
}

