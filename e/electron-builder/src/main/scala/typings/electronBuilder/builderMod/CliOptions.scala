package typings.electronBuilder.builderMod

import typings.appBuilderLib.packagerApiMod.PackagerOptions
import typings.electronPublish.mod.PublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CliOptions
  extends PackagerOptions
     with PublishOptions {
  var arm64: js.UndefOr[Boolean] = js.native
  var armv7l: js.UndefOr[Boolean] = js.native
  var dir: js.UndefOr[Boolean] = js.native
  var ia32: js.UndefOr[Boolean] = js.native
  var x64: js.UndefOr[Boolean] = js.native
}

object CliOptions {
  @scala.inline
  def apply(): CliOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CliOptions]
  }
  @scala.inline
  implicit class CliOptionsOps[Self <: CliOptions] (val x: Self) extends AnyVal {
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
    def setArm64(value: Boolean): Self = this.set("arm64", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArm64: Self = this.set("arm64", js.undefined)
    @scala.inline
    def setArmv7l(value: Boolean): Self = this.set("armv7l", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArmv7l: Self = this.set("armv7l", js.undefined)
    @scala.inline
    def setDir(value: Boolean): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setIa32(value: Boolean): Self = this.set("ia32", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIa32: Self = this.set("ia32", js.undefined)
    @scala.inline
    def setX64(value: Boolean): Self = this.set("x64", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX64: Self = this.set("x64", js.undefined)
  }
  
}

