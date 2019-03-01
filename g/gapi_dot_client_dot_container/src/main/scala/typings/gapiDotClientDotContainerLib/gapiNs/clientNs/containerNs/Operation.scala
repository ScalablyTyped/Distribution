package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  /** Detailed operation progress, if available. */
  var detail: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] The time the operation completed, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** The server-assigned ID for the operation. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The operation type. */
  var operationType: js.UndefOr[java.lang.String] = js.undefined
  /** Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] The time the operation started, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** The current status of the operation. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** If an error has occurred, a textual description of the error. */
  var statusMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Server-defined URL for the target of the operation. */
  var targetLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the operation
    * is taking place.
    */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    detail: java.lang.String = null,
    endTime: java.lang.String = null,
    name: java.lang.String = null,
    operationType: java.lang.String = null,
    selfLink: java.lang.String = null,
    startTime: java.lang.String = null,
    status: java.lang.String = null,
    statusMessage: java.lang.String = null,
    targetLink: java.lang.String = null,
    zone: java.lang.String = null
  ): Operation = {
    val __obj = js.Dynamic.literal()
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (operationType != null) __obj.updateDynamic("operationType")(operationType)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    if (targetLink != null) __obj.updateDynamic("targetLink")(targetLink)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[Operation]
  }
}

