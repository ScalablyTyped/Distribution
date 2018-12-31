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

