package typings.googleCloudStorage.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAclOptions extends js.Object {
  var entity: String = js.native
  var generation: js.UndefOr[Double] = js.native
  var userProject: js.UndefOr[String] = js.native
}

object RemoveAclOptions {
  @scala.inline
  def apply(entity: String): RemoveAclOptions = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAclOptions]
  }
  @scala.inline
  implicit class RemoveAclOptionsOps[Self <: RemoveAclOptions] (val x: Self) extends AnyVal {
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
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeneration(value: Double): Self = this.set("generation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
  
}

