package typings.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompartmentHeaders extends js.Object {
  var compartment: typings.fhirKitClient.mod.Compartment
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.mod.ResourceType
  var searchParams: js.UndefOr[typings.fhirKitClient.mod.SearchParams] = js.undefined
}

object CompartmentHeaders {
  @scala.inline
  def apply(
    compartment: typings.fhirKitClient.mod.Compartment,
    resourceType: typings.fhirKitClient.mod.ResourceType,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null,
    searchParams: typings.fhirKitClient.mod.SearchParams = null
  ): CompartmentHeaders = {
    val __obj = js.Dynamic.literal(compartment = compartment.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (searchParams != null) __obj.updateDynamic("searchParams")(searchParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompartmentHeaders]
  }
}

