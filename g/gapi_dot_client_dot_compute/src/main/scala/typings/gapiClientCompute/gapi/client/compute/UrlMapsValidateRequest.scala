package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMapsValidateRequest extends js.Object {
  /** Content of the UrlMap to be validated. */
  var resource: js.UndefOr[UrlMap] = js.undefined
}

object UrlMapsValidateRequest {
  @scala.inline
  def apply(resource: UrlMap = null): UrlMapsValidateRequest = {
    val __obj = js.Dynamic.literal()
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlMapsValidateRequest]
  }
}

