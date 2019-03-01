package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowOperationMetadata extends js.Object {
  /** The state of the operation with respect to cancellation. */
  var cancelState: js.UndefOr[java.lang.String] = js.undefined
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
  var deadline: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the top-level flow corresponding to this operation.
    * Must be equal to the "name" field for a FlowName enum.
    */
  var flowName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Operation type which is a flow type and subtype info as that is missing in
    * our datastore otherwise. This maps to the ordinal value of the enum:
    * jcg/api/tenant/operations/OperationNamespace.java
    */
  var operationType: js.UndefOr[scala.Double] = js.undefined
  /** The full name of the resources that this flow is directly associated with. */
  var resourceNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The start time of the operation. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  var surface: js.UndefOr[java.lang.String] = js.undefined
}

object FlowOperationMetadata {
  @scala.inline
  def apply(
    cancelState: java.lang.String = null,
    deadline: java.lang.String = null,
    flowName: java.lang.String = null,
    operationType: scala.Int | scala.Double = null,
    resourceNames: js.Array[java.lang.String] = null,
    startTime: java.lang.String = null,
    surface: java.lang.String = null
  ): FlowOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (cancelState != null) __obj.updateDynamic("cancelState")(cancelState)
    if (deadline != null) __obj.updateDynamic("deadline")(deadline)
    if (flowName != null) __obj.updateDynamic("flowName")(flowName)
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (resourceNames != null) __obj.updateDynamic("resourceNames")(resourceNames)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (surface != null) __obj.updateDynamic("surface")(surface)
    __obj.asInstanceOf[FlowOperationMetadata]
  }
}

