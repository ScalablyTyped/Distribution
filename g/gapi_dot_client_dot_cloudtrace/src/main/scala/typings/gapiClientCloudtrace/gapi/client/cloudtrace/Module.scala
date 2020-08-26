package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  /**
    * A unique identifier for the module, usually a hash of its
    * contents (up to 128 bytes).
    */
  var buildId: js.UndefOr[TruncatableString] = js.native
  /**
    * For example: main binary, kernel modules, and dynamic libraries
    * such as libc.so, sharedlib.so (up to 256 bytes).
    */
  var module: js.UndefOr[TruncatableString] = js.native
}

object Module {
  @scala.inline
  def apply(): Module = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Module]
  }
  @scala.inline
  implicit class ModuleOps[Self <: Module] (val x: Self) extends AnyVal {
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
    def setBuildId(value: TruncatableString): Self = this.set("buildId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildId: Self = this.set("buildId", js.undefined)
    @scala.inline
    def setModule(value: TruncatableString): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
  }
  
}

