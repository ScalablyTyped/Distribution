package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecretInfo extends js.Object {
  var CreatedAt: String = js.native
  var ID: String = js.native
  var Spec: js.UndefOr[ServiceSpec] = js.native
  var UpdatedAt: js.UndefOr[String] = js.native
  var Version: SecretVersion = js.native
}

object SecretInfo {
  @scala.inline
  def apply(CreatedAt: String, ID: String, Version: SecretVersion): SecretInfo = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretInfo]
  }
  @scala.inline
  implicit class SecretInfoOps[Self <: SecretInfo] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: String): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: SecretVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpec(value: ServiceSpec): Self = this.set("Spec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpec: Self = this.set("Spec", js.undefined)
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
  }
  
}

