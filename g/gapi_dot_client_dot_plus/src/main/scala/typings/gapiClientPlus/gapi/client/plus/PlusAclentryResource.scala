package typings.gapiClientPlus.gapi.client.plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlusAclentryResource extends js.Object {
  /** A descriptive name for this entry. Suitable for display. */
  var displayName: js.UndefOr[String] = js.native
  /** The ID of the entry. For entries of type "person" or "circle", this is the ID of the resource. For other types, this property is not set. */
  var id: js.UndefOr[String] = js.native
  /**
    * The type of entry describing to whom access is granted. Possible values are:
    * - "person" - Access to an individual.
    * - "circle" - Access to members of a circle.
    * - "myCircles" - Access to members of all the person's circles.
    * - "extendedCircles" - Access to members of all the person's circles, plus all of the people in their circles.
    * - "domain" - Access to members of the person's Google Apps domain.
    * - "public" - Access to anyone on the web.
    */
  var `type`: js.UndefOr[String] = js.native
}

object PlusAclentryResource {
  @scala.inline
  def apply(): PlusAclentryResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusAclentryResource]
  }
  @scala.inline
  implicit class PlusAclentryResourceOps[Self <: PlusAclentryResource] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

