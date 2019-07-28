package typings.fhirDashKitDashClient

import typings.fhirDashKitDashClient.fhirDashKitDashClientMod.Compartment
import typings.fhirDashKitDashClient.fhirDashKitDashClientMod.SearchParams
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompartmentHeaders extends js.Object {
  var compartment: Compartment
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: ResourceType
  var searchParams: js.UndefOr[SearchParams] = js.undefined
}

object Anon_CompartmentHeaders {
  @scala.inline
  def apply(
    compartment: Compartment,
    resourceType: ResourceType,
    headers: Headers = null,
    options: Options = null,
    searchParams: SearchParams = null
  ): Anon_CompartmentHeaders = {
    val __obj = js.Dynamic.literal(compartment = compartment, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (searchParams != null) __obj.updateDynamic("searchParams")(searchParams)
    __obj.asInstanceOf[Anon_CompartmentHeaders]
  }
}

