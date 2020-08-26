package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentInfo extends js.Object {
  /** An opaque data container for client-provided data. */
  var data: js.UndefOr[String] = js.native
  /**
    * Specifies what kind of attachment this is. Tells a client how to
    * interpret the `data` field. Format is <var>namespace/type</var>, for
    * example <code>scrupulous-wombat-12345/welcome-message</code>
    */
  var namespacedType: js.UndefOr[String] = js.native
}

object AttachmentInfo {
  @scala.inline
  def apply(): AttachmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentInfo]
  }
  @scala.inline
  implicit class AttachmentInfoOps[Self <: AttachmentInfo] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setNamespacedType(value: String): Self = this.set("namespacedType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespacedType: Self = this.set("namespacedType", js.undefined)
  }
  
}

