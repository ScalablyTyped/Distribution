package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compartment extends js.Object {
  var compartment: js.UndefOr[fhirDashKitDashClientLib.fhirDashKitDashClientMod.Compartment] = js.undefined
  var headers: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  var resourceType: ResourceType
  var searchParams: js.UndefOr[fhirDashKitDashClientLib.fhirDashKitDashClientMod.SearchParams] = js.undefined
}

object Anon_Compartment {
  @scala.inline
  def apply(
    resourceType: ResourceType,
    compartment: fhirDashKitDashClientLib.fhirDashKitDashClientMod.Compartment = null,
    headers: requestLib.requestMod.Headers = null,
    options: requestLib.requestMod.Options = null,
    searchParams: fhirDashKitDashClientLib.fhirDashKitDashClientMod.SearchParams = null
  ): Anon_Compartment = {
    val __obj = js.Dynamic.literal(resourceType = resourceType)
    if (compartment != null) __obj.updateDynamic("compartment")(compartment)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (searchParams != null) __obj.updateDynamic("searchParams")(searchParams)
    __obj.asInstanceOf[Anon_Compartment]
  }
}

