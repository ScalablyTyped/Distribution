package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the scheduling options for an Instance.
  */
@js.native
trait SchemaScheduling extends js.Object {
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
    * A set of node affinity and anti-affinity.
    */
  var nodeAffinities: js.UndefOr[js.Array[SchemaSchedulingNodeAffinity]] = js.native
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

object SchemaScheduling {
  @scala.inline
  def apply(
    automaticRestart: js.UndefOr[Boolean] = js.undefined,
    nodeAffinities: js.Array[SchemaSchedulingNodeAffinity] = null,
    onHostMaintenance: String = null,
    preemptible: js.UndefOr[Boolean] = js.undefined
  ): SchemaScheduling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automaticRestart)) __obj.updateDynamic("automaticRestart")(automaticRestart.asInstanceOf[js.Any])
    if (nodeAffinities != null) __obj.updateDynamic("nodeAffinities")(nodeAffinities.asInstanceOf[js.Any])
    if (onHostMaintenance != null) __obj.updateDynamic("onHostMaintenance")(onHostMaintenance.asInstanceOf[js.Any])
    if (!js.isUndefined(preemptible)) __obj.updateDynamic("preemptible")(preemptible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaScheduling]
  }
}

