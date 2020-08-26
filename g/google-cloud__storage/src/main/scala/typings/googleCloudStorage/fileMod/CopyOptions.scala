package typings.googleCloudStorage.fileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyOptions extends js.Object {
  var destinationKmsKeyName: js.UndefOr[String] = js.native
  var predefinedAcl: js.UndefOr[String] = js.native
  var token: js.UndefOr[String] = js.native
  var userProject: js.UndefOr[String] = js.native
}

object CopyOptions {
  @scala.inline
  def apply(): CopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptions]
  }
  @scala.inline
  implicit class CopyOptionsOps[Self <: CopyOptions] (val x: Self) extends AnyVal {
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
    def setDestinationKmsKeyName(value: String): Self = this.set("destinationKmsKeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationKmsKeyName: Self = this.set("destinationKmsKeyName", js.undefined)
    @scala.inline
    def setPredefinedAcl(value: String): Self = this.set("predefinedAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedAcl: Self = this.set("predefinedAcl", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
  
}

