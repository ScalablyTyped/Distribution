package typings.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompartmentHeaders extends js.Object {
  var compartment: typings.fhirKitClient.mod.Compartment = js.native
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  var resourceType: typings.fhirKitClient.mod.ResourceType = js.native
  var searchParams: js.UndefOr[typings.fhirKitClient.mod.SearchParams] = js.native
}

object CompartmentHeaders {
  @scala.inline
  def apply(
    compartment: typings.fhirKitClient.mod.Compartment,
    resourceType: typings.fhirKitClient.mod.ResourceType
  ): CompartmentHeaders = {
    val __obj = js.Dynamic.literal(compartment = compartment.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompartmentHeaders]
  }
  @scala.inline
  implicit class CompartmentHeadersOps[Self <: CompartmentHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompartment(value: typings.fhirKitClient.mod.Compartment): Self = this.set("compartment", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.mod.ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setSearchParams(value: typings.fhirKitClient.mod.SearchParams): Self = this.set("searchParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchParams: Self = this.set("searchParams", js.undefined)
  }
  
}

