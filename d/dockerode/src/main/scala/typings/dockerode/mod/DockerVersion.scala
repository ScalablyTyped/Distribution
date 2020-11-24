package typings.dockerode.mod

import typings.dockerode.anon.Details
import typings.dockerode.anon.NameString
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DockerVersion extends js.Object {
  
  var ApiVersion: String = js.native
  
  var Arch: String = js.native
  
  var BuildTime: Date = js.native
  
  var Components: js.Array[Details] = js.native
  
  var GitCommit: String = js.native
  
  var GoVersion: String = js.native
  
  var KernelVersion: String = js.native
  
  var MinAPIVersion: String = js.native
  
  var Os: String = js.native
  
  var Platform: NameString = js.native
  
  var Version: String = js.native
}
object DockerVersion {
  
  @scala.inline
  def apply(
    ApiVersion: String,
    Arch: String,
    BuildTime: Date,
    Components: js.Array[Details],
    GitCommit: String,
    GoVersion: String,
    KernelVersion: String,
    MinAPIVersion: String,
    Os: String,
    Platform: NameString,
    Version: String
  ): DockerVersion = {
    val __obj = js.Dynamic.literal(ApiVersion = ApiVersion.asInstanceOf[js.Any], Arch = Arch.asInstanceOf[js.Any], BuildTime = BuildTime.asInstanceOf[js.Any], Components = Components.asInstanceOf[js.Any], GitCommit = GitCommit.asInstanceOf[js.Any], GoVersion = GoVersion.asInstanceOf[js.Any], KernelVersion = KernelVersion.asInstanceOf[js.Any], MinAPIVersion = MinAPIVersion.asInstanceOf[js.Any], Os = Os.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerVersion]
  }
  
  @scala.inline
  implicit class DockerVersionOps[Self <: DockerVersion] (val x: Self) extends AnyVal {
    
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
    def setApiVersion(value: String): Self = this.set("ApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArch(value: String): Self = this.set("Arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildTime(value: Date): Self = this.set("BuildTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsVarargs(value: Details*): Self = this.set("Components", js.Array(value :_*))
    
    @scala.inline
    def setComponents(value: js.Array[Details]): Self = this.set("Components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitCommit(value: String): Self = this.set("GitCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoVersion(value: String): Self = this.set("GoVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelVersion(value: String): Self = this.set("KernelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAPIVersion(value: String): Self = this.set("MinAPIVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = this.set("Os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: NameString): Self = this.set("Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
}
