package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogMessageResponse extends js.Object {
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
}

object LogMessageResponse {
  @scala.inline
  def apply(responseMetadata: ResponseMetadata = null): LogMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (responseMetadata != null) __obj.updateDynamic("responseMetadata")(responseMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogMessageResponse]
  }
}

