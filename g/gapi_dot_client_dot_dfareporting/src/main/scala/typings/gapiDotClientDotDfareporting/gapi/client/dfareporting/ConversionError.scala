package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionError extends js.Object {
  /** The error code. */
  var code: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionError". */
  var kind: js.UndefOr[String] = js.undefined
  /** A description of the error. */
  var message: js.UndefOr[String] = js.undefined
}

object ConversionError {
  @scala.inline
  def apply(code: String = null, kind: String = null, message: String = null): ConversionError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversionError]
  }
}

