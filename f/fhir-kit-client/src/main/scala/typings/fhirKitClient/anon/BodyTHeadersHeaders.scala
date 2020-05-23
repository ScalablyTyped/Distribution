package typings.fhirKitClient.anon

import typings.fhirKitClient.mod.CustomResource
import typings.fhirKitClient.mod.CustomResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyTHeadersHeaders[T /* <: CustomResource */] extends js.Object {
  var body: T
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: CustomResourceType
}

object BodyTHeadersHeaders {
  @scala.inline
  def apply[T](
    body: T,
    id: String,
    resourceType: CustomResourceType,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyTHeadersHeaders[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyTHeadersHeaders[T]]
  }
}

