package typings.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachStderr extends StObject {
  
  var AttachStderr: Boolean = js.native
  
  var AttachStdin: Boolean = js.native
  
  var AttachStdout: Boolean = js.native
  
  var Cmd: js.Array[String] = js.native
  
  var Domainname: String = js.native
  
  var Entrypoint: js.UndefOr[String | js.Array[String]] = js.native
  
  var Env: js.Array[String] = js.native
  
  var ExposedPorts: StringDictionary[js.Object] = js.native
  
  var Hostname: String = js.native
  
  var Image: String = js.native
  
  var Labels: StringDictionary[String] = js.native
  
  var OnBuild: js.UndefOr[js.Any] = js.native
  
  var OpenStdin: Boolean = js.native
  
  var StdinOnce: Boolean = js.native
  
  var Tty: Boolean = js.native
  
  var User: String = js.native
  
  var Volumes: StringDictionary[js.Object] = js.native
  
  var WorkingDir: String = js.native
}
object AttachStderr {
  
  @scala.inline
  def apply(
    AttachStderr: Boolean,
    AttachStdin: Boolean,
    AttachStdout: Boolean,
    Cmd: js.Array[String],
    Domainname: String,
    Env: js.Array[String],
    ExposedPorts: StringDictionary[js.Object],
    Hostname: String,
    Image: String,
    Labels: StringDictionary[String],
    OpenStdin: Boolean,
    StdinOnce: Boolean,
    Tty: Boolean,
    User: String,
    Volumes: StringDictionary[js.Object],
    WorkingDir: String
  ): AttachStderr = {
    val __obj = js.Dynamic.literal(AttachStderr = AttachStderr.asInstanceOf[js.Any], AttachStdin = AttachStdin.asInstanceOf[js.Any], AttachStdout = AttachStdout.asInstanceOf[js.Any], Cmd = Cmd.asInstanceOf[js.Any], Domainname = Domainname.asInstanceOf[js.Any], Env = Env.asInstanceOf[js.Any], ExposedPorts = ExposedPorts.asInstanceOf[js.Any], Hostname = Hostname.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], OpenStdin = OpenStdin.asInstanceOf[js.Any], StdinOnce = StdinOnce.asInstanceOf[js.Any], Tty = Tty.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], Volumes = Volumes.asInstanceOf[js.Any], WorkingDir = WorkingDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachStderr]
  }
  
  @scala.inline
  implicit class AttachStderrMutableBuilder[Self <: AttachStderr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachStderr(value: Boolean): Self = StObject.set(x, "AttachStderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachStdin(value: Boolean): Self = StObject.set(x, "AttachStdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachStdout(value: Boolean): Self = StObject.set(x, "AttachStdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmd(value: js.Array[String]): Self = StObject.set(x, "Cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmdVarargs(value: String*): Self = StObject.set(x, "Cmd", js.Array(value :_*))
    
    @scala.inline
    def setDomainname(value: String): Self = StObject.set(x, "Domainname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrypoint(value: String | js.Array[String]): Self = StObject.set(x, "Entrypoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrypointUndefined: Self = StObject.set(x, "Entrypoint", js.undefined)
    
    @scala.inline
    def setEntrypointVarargs(value: String*): Self = StObject.set(x, "Entrypoint", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = StObject.set(x, "Env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = StObject.set(x, "Env", js.Array(value :_*))
    
    @scala.inline
    def setExposedPorts(value: StringDictionary[js.Object]): Self = StObject.set(x, "ExposedPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBuild(value: js.Any): Self = StObject.set(x, "OnBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBuildUndefined: Self = StObject.set(x, "OnBuild", js.undefined)
    
    @scala.inline
    def setOpenStdin(value: Boolean): Self = StObject.set(x, "OpenStdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdinOnce(value: Boolean): Self = StObject.set(x, "StdinOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTty(value: Boolean): Self = StObject.set(x, "Tty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumes(value: StringDictionary[js.Object]): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDir(value: String): Self = StObject.set(x, "WorkingDir", value.asInstanceOf[js.Any])
  }
}
