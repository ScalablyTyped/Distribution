package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaAutoscalingPolicyQueueBasedScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicyQueueBasedScaling]
  }
  
  @scala.inline
  implicit class SchemaAutoscalingPolicyQueueBasedScalingOps[Self <: SchemaAutoscalingPolicyQueueBasedScaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceptableBacklogPerInstance(value: Double): Self = this.set("acceptableBacklogPerInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptableBacklogPerInstance: Self = this.set("acceptableBacklogPerInstance", js.undefined)
    
    @scala.inline
    def setCloudPubSub(value: SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub): Self = this.set("cloudPubSub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudPubSub: Self = this.set("cloudPubSub", js.undefined)
    
    @scala.inline
    def setSingleWorkerThroughputPerSec(value: Double): Self = this.set("singleWorkerThroughputPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleWorkerThroughputPerSec: Self = this.set("singleWorkerThroughputPerSec", js.undefined)
  }
}
