package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scheduling extends js.Object {
  /**
    * Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the
    * automatic restart option for standard instances. Preemptible instances cannot be automatically restarted.
    *
    * By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
    */
  var automaticRestart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and
    * only possible behavior is TERMINATE. For more information, see Setting Instance Scheduling Options.
    */
  var onHostMaintenance: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines whether the instance is preemptible. This can only be set during instance creation, it cannot be set or changed after the instance has been
    * created.
    */
  var preemptible: js.UndefOr[scala.Boolean] = js.undefined
}

object Scheduling {
  @scala.inline
  def apply(
    automaticRestart: js.UndefOr[scala.Boolean] = js.undefined,
    onHostMaintenance: java.lang.String = null,
    preemptible: js.UndefOr[scala.Boolean] = js.undefined
  ): Scheduling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automaticRestart)) __obj.updateDynamic("automaticRestart")(automaticRestart)
    if (onHostMaintenance != null) __obj.updateDynamic("onHostMaintenance")(onHostMaintenance)
    if (!js.isUndefined(preemptible)) __obj.updateDynamic("preemptible")(preemptible)
    __obj.asInstanceOf[Scheduling]
  }
}

