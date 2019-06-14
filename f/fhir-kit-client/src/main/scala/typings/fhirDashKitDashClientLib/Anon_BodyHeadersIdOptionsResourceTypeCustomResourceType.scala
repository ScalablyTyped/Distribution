package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersIdOptionsResourceTypeCustomResourceType[T /* <: fhirDashKitDashClientLib.fhirDashKitDashClientMod.CustomResource */] extends js.Object {
  var body: T
  var headers: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
  var id: java.lang.String
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  var resourceType: CustomResourceType
}

object Anon_BodyHeadersIdOptionsResourceTypeCustomResourceType {
  @scala.inline
  def apply[T /* <: fhirDashKitDashClientLib.fhirDashKitDashClientMod.CustomResource */](
    body: T,
    id: java.lang.String,
    resourceType: CustomResourceType,
    headers: requestLib.requestMod.Headers = null,
    options: requestLib.requestMod.Options = null
  ): Anon_BodyHeadersIdOptionsResourceTypeCustomResourceType[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id, resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersIdOptionsResourceTypeCustomResourceType[T]]
  }
}

