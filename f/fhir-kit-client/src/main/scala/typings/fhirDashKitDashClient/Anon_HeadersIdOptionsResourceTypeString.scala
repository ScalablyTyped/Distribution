package typings.fhirDashKitDashClient

import typings.fhirDashKitDashClient.fhirDashKitDashClientMod.ResourceType
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersIdOptionsResourceTypeString extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: ResourceType
}

object Anon_HeadersIdOptionsResourceTypeString {
  @scala.inline
  def apply(id: String, resourceType: ResourceType, headers: Headers = null, options: Options = null): Anon_HeadersIdOptionsResourceTypeString = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersIdOptionsResourceTypeString]
  }
}

