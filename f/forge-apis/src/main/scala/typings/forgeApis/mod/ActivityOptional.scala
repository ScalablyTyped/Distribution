package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityOptional extends js.Object {
  var AllowedChildProcesses: js.UndefOr[js.Array[js.Object]] = js.native
  var AppPackages: js.UndefOr[js.Array[String]] = js.native
  var Description: js.UndefOr[String] = js.native
  var HostApplication: js.UndefOr[String] = js.native
  var Id: js.UndefOr[String] = js.native
  var Instruction: js.UndefOr[js.Object] = js.native
  var IsPublic: js.UndefOr[Boolean] = js.native
  var Parameters: js.UndefOr[js.Object] = js.native
  var RequiredEngineVersion: js.UndefOr[String] = js.native
  var Version: js.UndefOr[Double] = js.native
}

object ActivityOptional {
  @scala.inline
  def apply(): ActivityOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityOptional]
  }
  @scala.inline
  implicit class ActivityOptionalOps[Self <: ActivityOptional] (val x: Self) extends AnyVal {
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
    def setAllowedChildProcessesVarargs(value: js.Object*): Self = this.set("AllowedChildProcesses", js.Array(value :_*))
    @scala.inline
    def setAllowedChildProcesses(value: js.Array[js.Object]): Self = this.set("AllowedChildProcesses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedChildProcesses: Self = this.set("AllowedChildProcesses", js.undefined)
    @scala.inline
    def setAppPackagesVarargs(value: String*): Self = this.set("AppPackages", js.Array(value :_*))
    @scala.inline
    def setAppPackages(value: js.Array[String]): Self = this.set("AppPackages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppPackages: Self = this.set("AppPackages", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setHostApplication(value: String): Self = this.set("HostApplication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostApplication: Self = this.set("HostApplication", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setInstruction(value: js.Object): Self = this.set("Instruction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstruction: Self = this.set("Instruction", js.undefined)
    @scala.inline
    def setIsPublic(value: Boolean): Self = this.set("IsPublic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPublic: Self = this.set("IsPublic", js.undefined)
    @scala.inline
    def setParameters(value: js.Object): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setRequiredEngineVersion(value: String): Self = this.set("RequiredEngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredEngineVersion: Self = this.set("RequiredEngineVersion", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

