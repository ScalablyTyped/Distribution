package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Probe describes a health check to be performed against a container to
  * determine whether it is alive or ready to receive traffic.
  */
@js.native
trait Schema$Probe extends js.Object {
  /**
    * Minimum consecutive failures for the probe to be considered failed after
    * having succeeded. Defaults to 3. Minimum value is 1. +optional
    */
  var failureThreshold: js.UndefOr[Double] = js.native
  /**
    * The action taken to determine the health of a container
    */
  var handler: js.UndefOr[Schema$Handler] = js.native
  /**
    * Number of seconds after the container has started before liveness probes
    * are initiated. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    * +optional
    */
  var initialDelaySeconds: js.UndefOr[Double] = js.native
  /**
    * How often (in seconds) to perform the probe. Default to 10 seconds.
    * Minimum value is 1. +optional
    */
  var periodSeconds: js.UndefOr[Double] = js.native
  /**
    * Minimum consecutive successes for the probe to be considered successful
    * after having failed. Defaults to 1. Must be 1 for liveness. Minimum value
    * is 1. +optional
    */
  var successThreshold: js.UndefOr[Double] = js.native
  /**
    * Number of seconds after which the probe times out. Defaults to 1 second.
    * Minimum value is 1. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    * +optional
    */
  var timeoutSeconds: js.UndefOr[Double] = js.native
}

object Schema$Probe {
  @scala.inline
  def apply(
    failureThreshold: Int | Double = null,
    handler: Schema$Handler = null,
    initialDelaySeconds: Int | Double = null,
    periodSeconds: Int | Double = null,
    successThreshold: Int | Double = null,
    timeoutSeconds: Int | Double = null
  ): Schema$Probe = {
    val __obj = js.Dynamic.literal()
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (initialDelaySeconds != null) __obj.updateDynamic("initialDelaySeconds")(initialDelaySeconds.asInstanceOf[js.Any])
    if (periodSeconds != null) __obj.updateDynamic("periodSeconds")(periodSeconds.asInstanceOf[js.Any])
    if (successThreshold != null) __obj.updateDynamic("successThreshold")(successThreshold.asInstanceOf[js.Any])
    if (timeoutSeconds != null) __obj.updateDynamic("timeoutSeconds")(timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Probe]
  }
}

