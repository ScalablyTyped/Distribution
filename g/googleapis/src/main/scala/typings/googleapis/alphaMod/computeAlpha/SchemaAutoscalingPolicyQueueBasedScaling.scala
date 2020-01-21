package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration parameters of autoscaling based on queuing system.
  */
@js.native
trait SchemaAutoscalingPolicyQueueBasedScaling extends js.Object {
  /**
    * Scaling based on the average number of tasks in the queue per each active
    * instance. The autoscaler keeps the average number of tasks per instance
    * below this number, based on data collected in the last couple of minutes.
    * The autoscaler will also take into account incoming tasks when
    * calculating when to scale.
    */
  var acceptableBacklogPerInstance: js.UndefOr[Double] = js.native
  /**
    * Configuration for Cloud Pub/Sub subscription queue.
    */
  var cloudPubSub: js.UndefOr[SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub] = js.native
  /**
    * The scaling algorithm will also calculate throughput estimates on its
    * own; if you explicitly provide this value, the autoscaler will take into
    * account your value as well as automatic estimates when deciding how to
    * scale.
    */
  var singleWorkerThroughputPerSec: js.UndefOr[Double] = js.native
}

object SchemaAutoscalingPolicyQueueBasedScaling {
  @scala.inline
  def apply(
    acceptableBacklogPerInstance: Int | Double = null,
    cloudPubSub: SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub = null,
    singleWorkerThroughputPerSec: Int | Double = null
  ): SchemaAutoscalingPolicyQueueBasedScaling = {
    val __obj = js.Dynamic.literal()
    if (acceptableBacklogPerInstance != null) __obj.updateDynamic("acceptableBacklogPerInstance")(acceptableBacklogPerInstance.asInstanceOf[js.Any])
    if (cloudPubSub != null) __obj.updateDynamic("cloudPubSub")(cloudPubSub.asInstanceOf[js.Any])
    if (singleWorkerThroughputPerSec != null) __obj.updateDynamic("singleWorkerThroughputPerSec")(singleWorkerThroughputPerSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoscalingPolicyQueueBasedScaling]
  }
}

