package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends js.Object {
  var AllowedChildProcesses: js.Array[js.Object] = js.native
  var AppPackages: js.Array[String] = js.native
  var Description: js.UndefOr[String] = js.native
  var HostApplication: js.UndefOr[String] = js.native
  var Id: String = js.native
  var Instruction: js.Object = js.native
  var IsPublic: Boolean = js.native
  var Parameters: js.Object = js.native
  var RequiredEngineVersion: String = js.native
  var Version: Double = js.native
}

object Activity {
  @scala.inline
  def apply(
    AllowedChildProcesses: js.Array[js.Object],
    AppPackages: js.Array[String],
    Id: String,
    Instruction: js.Object,
    IsPublic: Boolean,
    Parameters: js.Object,
    RequiredEngineVersion: String,
    Version: Double
  ): Activity = {
    val __obj = js.Dynamic.literal(AllowedChildProcesses = AllowedChildProcesses.asInstanceOf[js.Any], AppPackages = AppPackages.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Instruction = Instruction.asInstanceOf[js.Any], IsPublic = IsPublic.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], RequiredEngineVersion = RequiredEngineVersion.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
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
    def setAppPackagesVarargs(value: String*): Self = this.set("AppPackages", js.Array(value :_*))
    @scala.inline
    def setAppPackages(value: js.Array[String]): Self = this.set("AppPackages", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstruction(value: js.Object): Self = this.set("Instruction", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPublic(value: Boolean): Self = this.set("IsPublic", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: js.Object): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredEngineVersion(value: String): Self = this.set("RequiredEngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setHostApplication(value: String): Self = this.set("HostApplication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostApplication: Self = this.set("HostApplication", js.undefined)
  }
  
}

