package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagnostic extends js.Object {
  /** The kind of diagnostic information provided. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** File name and line number of the error or warning. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** Message describing the error or warning. */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Diagnostic {
  @scala.inline
  def apply(kind: java.lang.String = null, location: java.lang.String = null, message: java.lang.String = null): Diagnostic = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (location != null) __obj.updateDynamic("location")(location)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Diagnostic]
  }
}

