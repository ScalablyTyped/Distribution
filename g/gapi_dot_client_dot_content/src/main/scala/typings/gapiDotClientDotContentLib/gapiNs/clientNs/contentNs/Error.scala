package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  /** The domain of the error. */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /** A description of the error. */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** The error code. */
  var reason: js.UndefOr[java.lang.String] = js.undefined
}

object Error {
  @scala.inline
  def apply(domain: java.lang.String = null, message: java.lang.String = null, reason: java.lang.String = null): Error = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (message != null) __obj.updateDynamic("message")(message)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[Error]
  }
}

