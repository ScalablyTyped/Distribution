package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The template used for creating replicas in the pool.
  */
@js.native
trait Schema$Template extends js.Object {
  /**
    * An action to run during initialization of your replicas. An action is run
    * as shell commands which are executed one after the other in the same bash
    * shell, so any state established by one command is inherited by later
    * commands.
    */
  var action: js.UndefOr[Schema$Action] = js.native
  /**
    * A list of HTTP Health Checks to configure for this replica pool and all
    * virtual machines in this replica pool.
    */
  var healthChecks: js.UndefOr[js.Array[Schema$HealthCheck]] = js.native
  /**
    * A free-form string describing the version of this template. You can
    * provide any versioning string you would like. For example, version1 or
    * template-v1.
    */
  var version: js.UndefOr[String] = js.native
  /**
    * The virtual machine parameters to use for creating replicas. You can
    * define settings such as the machine type and the image of replicas in
    * this pool. This is required if replica type is SMART_VM.
    */
  var vmParams: js.UndefOr[Schema$VmParams] = js.native
}

object Schema$Template {
  @scala.inline
  def apply(
    action: Schema$Action = null,
    healthChecks: js.Array[Schema$HealthCheck] = null,
    version: String = null,
    vmParams: Schema$VmParams = null
  ): Schema$Template = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (healthChecks != null) __obj.updateDynamic("healthChecks")(healthChecks.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (vmParams != null) __obj.updateDynamic("vmParams")(vmParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Template]
  }
}

