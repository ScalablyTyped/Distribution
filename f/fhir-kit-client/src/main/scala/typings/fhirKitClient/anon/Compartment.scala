package typings.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compartment extends js.Object {
  var compartment: js.UndefOr[typings.fhirKitClient.mod.Compartment] = js.undefined
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.mod.ResourceType
  var searchParams: js.UndefOr[typings.fhirKitClient.mod.SearchParams] = js.undefined
}

object Compartment {
  @scala.inline
  def apply(
    resourceType: typings.fhirKitClient.mod.ResourceType,
    compartment: typings.fhirKitClient.mod.Compartment = null,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null,
    searchParams: typings.fhirKitClient.mod.SearchParams = null
  ): Compartment = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    if (compartment != null) __obj.updateDynamic("compartment")(compartment.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (searchParams != null) __obj.updateDynamic("searchParams")(searchParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compartment]
  }
}

