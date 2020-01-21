package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutersPreviewResponse extends js.Object {
  /** Preview of given router. */
  var resource: js.UndefOr[Router] = js.undefined
}

object RoutersPreviewResponse {
  @scala.inline
  def apply(resource: Router = null): RoutersPreviewResponse = {
    val __obj = js.Dynamic.literal()
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutersPreviewResponse]
  }
}

