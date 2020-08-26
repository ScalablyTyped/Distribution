package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowOperationMetadata extends js.Object {
  /** The state of the operation with respect to cancellation. */
  var cancelState: js.UndefOr[String] = js.native
  /**
    * Deadline for the flow to complete, to prevent orphaned Operations.
    *
    * If the flow has not completed by this time, it may be terminated by
    * the engine, or force-failed by Operation lookup.
    *
    * Note that this is not a hard deadline after which the Flow will
    * definitely be failed, rather it is a deadline after which it is reasonable
    * to suspect a problem and other parts of the system may kill operation
    * to ensure we don't have orphans.
    * see also: go/prevent-orphaned-operations
    */
  var deadline: js.UndefOr[String] = js.native
  /**
    * The name of the top-level flow corresponding to this operation.
    * Must be equal to the "name" field for a FlowName enum.
    */
  var flowName: js.UndefOr[String] = js.native
  /**
    * Operation type which is a flow type and subtype info as that is missing in
    * our datastore otherwise. This maps to the ordinal value of the enum:
    * jcg/api/tenant/operations/OperationNamespace.java
    */
  var operationType: js.UndefOr[Double] = js.native
  /** The full name of the resources that this flow is directly associated with. */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
  /** The start time of the operation. */
  var startTime: js.UndefOr[String] = js.native
  var surface: js.UndefOr[String] = js.native
}

object FlowOperationMetadata {
  @scala.inline
  def apply(): FlowOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowOperationMetadata]
  }
  @scala.inline
  implicit class FlowOperationMetadataOps[Self <: FlowOperationMetadata] (val x: Self) extends AnyVal {
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
    def setCancelState(value: String): Self = this.set("cancelState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelState: Self = this.set("cancelState", js.undefined)
    @scala.inline
    def setDeadline(value: String): Self = this.set("deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeadline: Self = this.set("deadline", js.undefined)
    @scala.inline
    def setFlowName(value: String): Self = this.set("flowName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlowName: Self = this.set("flowName", js.undefined)
    @scala.inline
    def setOperationType(value: Double): Self = this.set("operationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    @scala.inline
    def setResourceNamesVarargs(value: String*): Self = this.set("resourceNames", js.Array(value :_*))
    @scala.inline
    def setResourceNames(value: js.Array[String]): Self = this.set("resourceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceNames: Self = this.set("resourceNames", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setSurface(value: String): Self = this.set("surface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurface: Self = this.set("surface", js.undefined)
  }
  
}

