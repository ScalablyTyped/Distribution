package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersIdOptionsResourceTypeStringOptional extends js.Object {
  var headers: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}

object Anon_HeadersIdOptionsResourceTypeStringOptional {
  @scala.inline
  def apply(
    headers: requestLib.requestMod.Headers = null,
    id: java.lang.String = null,
    options: requestLib.requestMod.Options = null,
    resourceType: ResourceType = null
  ): Anon_HeadersIdOptionsResourceTypeStringOptional = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (id != null) __obj.updateDynamic("id")(id)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    __obj.asInstanceOf[Anon_HeadersIdOptionsResourceTypeStringOptional]
  }
}

