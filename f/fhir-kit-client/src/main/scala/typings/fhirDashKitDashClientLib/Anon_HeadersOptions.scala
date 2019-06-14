package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersOptions extends js.Object {
  var headers: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  var resourceType: ResourceType
  var searchParams: fhirDashKitDashClientLib.fhirDashKitDashClientMod.SearchParams
}

object Anon_HeadersOptions {
  @scala.inline
  def apply(
    resourceType: ResourceType,
    searchParams: fhirDashKitDashClientLib.fhirDashKitDashClientMod.SearchParams,
    headers: requestLib.requestMod.Headers = null,
    options: requestLib.requestMod.Options = null
  ): Anon_HeadersOptions = {
    val __obj = js.Dynamic.literal(resourceType = resourceType, searchParams = searchParams)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersOptions]
  }
}

