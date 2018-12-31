package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckRequest extends js.Object {
  /** The operation to be checked. */
  var operation: js.UndefOr[Operation] = js.undefined
  /** Requests the project settings to be returned as part of the check response. */
  var requestProjectSettings: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies which version of service configuration should be used to process
    * the request.
    *
    * If unspecified or no matching version can be found, the
    * latest one will be used.
    */
  var serviceConfigId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates if service activation check should be skipped for this request.
    * Default behavior is to perform the check and apply relevant quota.
    */
  var skipActivationCheck: js.UndefOr[scala.Boolean] = js.undefined
}

