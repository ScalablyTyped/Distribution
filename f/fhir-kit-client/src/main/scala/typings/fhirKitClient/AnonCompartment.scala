package typings.fhirKitClient

import typings.fhirKitClient.mod.Compartment
import typings.fhirKitClient.mod.ResourceType
import typings.fhirKitClient.mod.SearchParams
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompartment extends js.Object {
  var compartment: js.UndefOr[Compartment] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: ResourceType
  var searchParams: js.UndefOr[SearchParams] = js.undefined
}

object AnonCompartment {
  @scala.inline
  def apply(
    resourceType: ResourceType,
    compartment: Compartment = null,
    headers: Headers = null,
    options: Options = null,
    searchParams: SearchParams = null
  ): AnonCompartment = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    if (compartment != null) __obj.updateDynamic("compartment")(compartment.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (searchParams != null) __obj.updateDynamic("searchParams")(searchParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompartment]
  }
}

