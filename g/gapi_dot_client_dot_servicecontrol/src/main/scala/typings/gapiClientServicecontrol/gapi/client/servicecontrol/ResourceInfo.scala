package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceInfo extends js.Object {
  /**
    * The identifier of the parent of this resource instance.
    * Must be in one of the following formats:
    * - “projects/<project-id or project-number>”
    * - “folders/<folder-id>”
    * - “organizations/<organization-id>”
    */
  var resourceContainer: js.UndefOr[String] = js.native
  /** Name of the resource. This is used for auditing purposes. */
  var resourceName: js.UndefOr[String] = js.native
}

object ResourceInfo {
  @scala.inline
  def apply(): ResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInfo]
  }
  @scala.inline
  implicit class ResourceInfoOps[Self <: ResourceInfo] (val x: Self) extends AnyVal {
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
    def setResourceContainer(value: String): Self = this.set("resourceContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceContainer: Self = this.set("resourceContainer", js.undefined)
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
  }
  
}

