package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionError extends js.Object {
  /** The error code. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionError". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A description of the error. */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object ConversionError {
  @scala.inline
  def apply(code: java.lang.String = null, kind: java.lang.String = null, message: java.lang.String = null): ConversionError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ConversionError]
  }
}

