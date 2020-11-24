package typings.dockerode.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiVersion extends js.Object {
  
  var ApiVersion: String = js.native
  
  var Arch: String = js.native
  
  var BuildTime: Date = js.native
  
  var Experimental: String = js.native
  
  var GitCommit: String = js.native
  
  var GoVersion: String = js.native
  
  var KernelVersion: String = js.native
  
  var Os: String = js.native
}
object ApiVersion {
  
  @scala.inline
  def apply(
    ApiVersion: String,
    Arch: String,
    BuildTime: Date,
    Experimental: String,
    GitCommit: String,
    GoVersion: String,
    KernelVersion: String,
    Os: String
  ): ApiVersion = {
    val __obj = js.Dynamic.literal(ApiVersion = ApiVersion.asInstanceOf[js.Any], Arch = Arch.asInstanceOf[js.Any], BuildTime = BuildTime.asInstanceOf[js.Any], Experimental = Experimental.asInstanceOf[js.Any], GitCommit = GitCommit.asInstanceOf[js.Any], GoVersion = GoVersion.asInstanceOf[js.Any], KernelVersion = KernelVersion.asInstanceOf[js.Any], Os = Os.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiVersion]
  }
  
  @scala.inline
  implicit class ApiVersionOps[Self <: ApiVersion] (val x: Self) extends AnyVal {
    
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
    def setExperimental(value: String): Self = this.set("Experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitCommit(value: String): Self = this.set("GitCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoVersion(value: String): Self = this.set("GoVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelVersion(value: String): Self = this.set("KernelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = this.set("Os", value.asInstanceOf[js.Any])
  }
}
