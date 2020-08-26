package typings.fhirKitClient.anon

import typings.fhir.fhir.Slot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodySlotHeaders extends js.Object {
  var body: Slot = js.native
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  var id: String = js.native
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Slot = js.native
}

object BodySlotHeaders {
  @scala.inline
  def apply(body: Slot, id: String, resourceType: typings.fhirKitClient.fhirKitClientStrings.Slot): BodySlotHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodySlotHeaders]
  }
  @scala.inline
  implicit class BodySlotHeadersOps[Self <: BodySlotHeaders] (val x: Self) extends AnyVal {
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
    def setBody(value: Slot): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Slot): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

