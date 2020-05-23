package typings.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersHeadersOptionsOptions extends js.Object {
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.mod.ResourceType
}

object HeadersHeadersOptionsOptions {
  @scala.inline
  def apply(
    resourceType: typings.fhirKitClient.mod.ResourceType,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): HeadersHeadersOptionsOptions = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersHeadersOptionsOptions]
  }
}

