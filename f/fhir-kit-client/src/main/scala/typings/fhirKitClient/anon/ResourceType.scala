package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.AdverseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceType extends js.Object {
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  var id: String = js.native
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  var resourceType: AdverseEvent = js.native
}

object ResourceType {
  @scala.inline
  def apply(id: String, resourceType: AdverseEvent): ResourceType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceType]
  }
  @scala.inline
  implicit class ResourceTypeOps[Self <: ResourceType] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: AdverseEvent): Self = this.set("resourceType", value.asInstanceOf[js.Any])
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

