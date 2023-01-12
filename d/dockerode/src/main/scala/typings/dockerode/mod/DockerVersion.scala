package typings.dockerode.mod

import typings.dockerode.anon.Details
import typings.dockerode.anon.NameString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DockerVersion extends StObject {
  
  var ApiVersion: String
  
  var Arch: String
  
  var BuildTime: js.Date
  
  var Components: js.Array[Details]
  
  var GitCommit: String
  
  var GoVersion: String
  
  var KernelVersion: String
  
  var MinAPIVersion: String
  
  var Os: String
  
  var Platform: NameString
  
  var Version: String
}
object DockerVersion {
  
  inline def apply(
    ApiVersion: String,
    Arch: String,
    BuildTime: js.Date,
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
  implicit open class MutableBuilder[Self <: DockerVersion] (val x: Self) extends AnyVal {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "ApiVersion", value.asInstanceOf[js.Any])
    
    inline def setArch(value: String): Self = StObject.set(x, "Arch", value.asInstanceOf[js.Any])
    
    inline def setBuildTime(value: js.Date): Self = StObject.set(x, "BuildTime", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: js.Array[Details]): Self = StObject.set(x, "Components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: Details*): Self = StObject.set(x, "Components", js.Array(value*))
    
    inline def setGitCommit(value: String): Self = StObject.set(x, "GitCommit", value.asInstanceOf[js.Any])
    
    inline def setGoVersion(value: String): Self = StObject.set(x, "GoVersion", value.asInstanceOf[js.Any])
    
    inline def setKernelVersion(value: String): Self = StObject.set(x, "KernelVersion", value.asInstanceOf[js.Any])
    
    inline def setMinAPIVersion(value: String): Self = StObject.set(x, "MinAPIVersion", value.asInstanceOf[js.Any])
    
    inline def setOs(value: String): Self = StObject.set(x, "Os", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: NameString): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
