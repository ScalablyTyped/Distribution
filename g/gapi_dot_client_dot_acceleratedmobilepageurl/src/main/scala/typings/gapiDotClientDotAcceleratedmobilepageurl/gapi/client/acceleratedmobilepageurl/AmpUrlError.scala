package typings.gapiDotClientDotAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmpUrlError extends js.Object {
  /** The error code of an API call. */
  var errorCode: js.UndefOr[String] = js.undefined
  /** An optional descriptive error message. */
  var errorMessage: js.UndefOr[String] = js.undefined
  /** The original non-AMP URL. */
  var originalUrl: js.UndefOr[String] = js.undefined
}

object AmpUrlError {
  @scala.inline
  def apply(errorCode: String = null, errorMessage: String = null, originalUrl: String = null): AmpUrlError = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (originalUrl != null) __obj.updateDynamic("originalUrl")(originalUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmpUrlError]
  }
}

