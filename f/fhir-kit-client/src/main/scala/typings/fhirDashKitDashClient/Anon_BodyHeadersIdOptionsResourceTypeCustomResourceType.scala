package typings.fhirDashKitDashClient

import typings.fhirDashKitDashClient.fhirDashKitDashClientMod.CustomResource
import typings.fhirDashKitDashClient.fhirDashKitDashClientMod.CustomResourceType
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersIdOptionsResourceTypeCustomResourceType[T /* <: CustomResource */] extends js.Object {
  var body: T
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: CustomResourceType
}

object Anon_BodyHeadersIdOptionsResourceTypeCustomResourceType {
  @scala.inline
  def apply[T /* <: CustomResource */](
    body: T,
    id: String,
    resourceType: CustomResourceType,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersIdOptionsResourceTypeCustomResourceType[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersIdOptionsResourceTypeCustomResourceType[T]]
  }
}

