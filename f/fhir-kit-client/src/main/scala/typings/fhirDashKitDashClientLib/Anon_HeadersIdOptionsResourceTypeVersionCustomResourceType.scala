package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersIdOptionsResourceTypeVersionCustomResourceType extends js.Object {
  var headers: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
  var id: java.lang.String
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  var resourceType: CustomResourceType
  var version: java.lang.String
}

object Anon_HeadersIdOptionsResourceTypeVersionCustomResourceType {
  @scala.inline
  def apply(
    id: java.lang.String,
    resourceType: CustomResourceType,
    version: java.lang.String,
    headers: requestLib.requestMod.Headers = null,
    options: requestLib.requestMod.Options = null
  ): Anon_HeadersIdOptionsResourceTypeVersionCustomResourceType = {
    val __obj = js.Dynamic.literal(id = id, resourceType = resourceType.asInstanceOf[js.Any], version = version)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersIdOptionsResourceTypeVersionCustomResourceType]
  }
}

