package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the scheduling options for an Instance.
  */
@js.native
trait Schema$Scheduling extends js.Object {
  /**
    * Specifies whether the instance should be automatically restarted if it is
    * terminated by Compute Engine (not terminated by a user). You can only set
    * the automatic restart option for standard instances. Preemptible
    * instances cannot be automatically restarted.  By default, this is set to
    * true so an instance is automatically restarted if it is terminated by
    * Compute Engine.
    */
  var automaticRestart: js.UndefOr[Boolean] = js.native
  /**
    * The minimum number of virtual CPUs this instance will consume when
    * running on a sole-tenant node.
    */
  var minNodeCpus: js.UndefOr[Double] = js.native
  /**
    * A set of node affinity and anti-affinity.
    */
  var nodeAffinities: js.UndefOr[js.Array[Schema$SchedulingNodeAffinity]] = js.native
  /**
    * Defines the maintenance behavior for this instance. For standard
    * instances, the default behavior is MIGRATE. For preemptible instances,
    * the default and only possible behavior is TERMINATE. For more
    * information, see Setting Instance Scheduling Options.
    */
  var onHostMaintenance: js.UndefOr[String] = js.native
  /**
    * Defines whether the instance is preemptible. This can only be set during
    * instance creation, it cannot be set or changed after the instance has
    * been created.
    */
  var preemptible: js.UndefOr[Boolean] = js.native
}

object Schema$Scheduling {
  @scala.inline
  def apply(
    automaticRestart: js.UndefOr[Boolean] = js.undefined,
    minNodeCpus: Int | Double = null,
    nodeAffinities: js.Array[Schema$SchedulingNodeAffinity] = null,
    onHostMaintenance: String = null,
    preemptible: js.UndefOr[Boolean] = js.undefined
  ): Schema$Scheduling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automaticRestart)) __obj.updateDynamic("automaticRestart")(automaticRestart.asInstanceOf[js.Any])
    if (minNodeCpus != null) __obj.updateDynamic("minNodeCpus")(minNodeCpus.asInstanceOf[js.Any])
    if (nodeAffinities != null) __obj.updateDynamic("nodeAffinities")(nodeAffinities.asInstanceOf[js.Any])
    if (onHostMaintenance != null) __obj.updateDynamic("onHostMaintenance")(onHostMaintenance.asInstanceOf[js.Any])
    if (!js.isUndefined(preemptible)) __obj.updateDynamic("preemptible")(preemptible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Scheduling]
  }
}

