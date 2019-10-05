package typings.gapiDotClientDotContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  /** Detailed operation progress, if available. */
  var detail: js.UndefOr[String] = js.undefined
  /**
    * [Output only] The time the operation completed, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var endTime: js.UndefOr[String] = js.undefined
  /** The server-assigned ID for the operation. */
  var name: js.UndefOr[String] = js.undefined
  /** The operation type. */
  var operationType: js.UndefOr[String] = js.undefined
  /** Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /**
    * [Output only] The time the operation started, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var startTime: js.UndefOr[String] = js.undefined
  /** The current status of the operation. */
  var status: js.UndefOr[String] = js.undefined
  /** If an error has occurred, a textual description of the error. */
  var statusMessage: js.UndefOr[String] = js.undefined
  /** Server-defined URL for the target of the operation. */
  var targetLink: js.UndefOr[String] = js.undefined
  /**
    * The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the operation
    * is taking place.
    */
  var zone: js.UndefOr[String] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    detail: String = null,
    endTime: String = null,
    name: String = null,
    operationType: String = null,
    selfLink: String = null,
    startTime: String = null,
    status: String = null,
    statusMessage: String = null,
    targetLink: String = null,
    zone: String = null
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

