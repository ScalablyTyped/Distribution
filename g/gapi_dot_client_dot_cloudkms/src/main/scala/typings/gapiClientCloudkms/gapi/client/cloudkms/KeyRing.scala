package typings.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyRing extends js.Object {
  /** Output only. The time at which this KeyRing was created. */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name for the KeyRing in the format
    * `projects/&#42;/locations/&#42;/keyRings/&#42;`.
    */
  var name: js.UndefOr[String] = js.native
}

object KeyRing {
  @scala.inline
  def apply(): KeyRing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRing]
  }
  @scala.inline
  implicit class KeyRingOps[Self <: KeyRing] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

