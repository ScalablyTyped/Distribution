package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotaError extends js.Object {
  /** Error code. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** Free-form text that provides details on the cause of the error. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Subject to whom this error applies. See the specific enum for more details
    * on this field. For example, "clientip:<ip address of client>" or
    * "project:<Google developer project id>".
    */
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

