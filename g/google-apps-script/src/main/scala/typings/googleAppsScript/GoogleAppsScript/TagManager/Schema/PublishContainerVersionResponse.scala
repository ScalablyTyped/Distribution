package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishContainerVersionResponse extends js.Object {
  var compilerError: js.UndefOr[Boolean] = js.native
  var containerVersion: js.UndefOr[ContainerVersion] = js.native
}

object PublishContainerVersionResponse {
  @scala.inline
  def apply(): PublishContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishContainerVersionResponse]
  }
  @scala.inline
  implicit class PublishContainerVersionResponseOps[Self <: PublishContainerVersionResponse] (val x: Self) extends AnyVal {
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
    def setCompilerError(value: Boolean): Self = this.set("compilerError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompilerError: Self = this.set("compilerError", js.undefined)
    @scala.inline
    def setContainerVersion(value: ContainerVersion): Self = this.set("containerVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerVersion: Self = this.set("containerVersion", js.undefined)
  }
  
}

