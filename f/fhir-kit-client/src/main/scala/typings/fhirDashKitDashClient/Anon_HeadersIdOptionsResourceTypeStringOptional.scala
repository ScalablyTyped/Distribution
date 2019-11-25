package typings.fhirDashKitDashClient

import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersIdOptionsResourceTypeStringOptional extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}

object Anon_HeadersIdOptionsResourceTypeStringOptional {
  @scala.inline
  def apply(
    headers: Headers = null,
    id: String = null,
    options: Options = null,
    resourceType: ResourceType = null
  ): Anon_HeadersIdOptionsResourceTypeStringOptional = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersIdOptionsResourceTypeStringOptional]
  }
}

