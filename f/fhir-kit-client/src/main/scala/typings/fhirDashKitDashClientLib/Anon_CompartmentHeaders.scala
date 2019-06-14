package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompartmentHeaders extends js.Object {
  var compartment: fhirDashKitDashClientLib.fhirDashKitDashClientMod.Compartment
  var headers: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  var resourceType: ResourceType
  var searchParams: js.UndefOr[fhirDashKitDashClientLib.fhirDashKitDashClientMod.SearchParams] = js.undefined
}

object Anon_CompartmentHeaders {
  @scala.inline
  def apply(
    compartment: fhirDashKitDashClientLib.fhirDashKitDashClientMod.Compartment,
    resourceType: ResourceType,
    headers: requestLib.requestMod.Headers = null,
    options: requestLib.requestMod.Options = null,
    searchParams: fhirDashKitDashClientLib.fhirDashKitDashClientMod.SearchParams = null
  ): Anon_CompartmentHeaders = {
    val __obj = js.Dynamic.literal(compartment = compartment, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (searchParams != null) __obj.updateDynamic("searchParams")(searchParams)
    __obj.asInstanceOf[Anon_CompartmentHeaders]
  }
}

