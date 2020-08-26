package typings.googleCloudStorage.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyOptions extends js.Object {
  var requestedPolicyVersion: js.UndefOr[Double] = js.native
  var userProject: js.UndefOr[String] = js.native
}

object GetPolicyOptions {
  @scala.inline
  def apply(): GetPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyOptions]
  }
  @scala.inline
  implicit class GetPolicyOptionsOps[Self <: GetPolicyOptions] (val x: Self) extends AnyVal {
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
    def setRequestedPolicyVersion(value: Double): Self = this.set("requestedPolicyVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedPolicyVersion: Self = this.set("requestedPolicyVersion", js.undefined)
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
  
}

