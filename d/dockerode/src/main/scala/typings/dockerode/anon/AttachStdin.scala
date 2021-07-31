package typings.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachStdin extends StObject {
  
  var ArgsEscaped: Boolean
  
  var AttachStderr: Boolean
  
  var AttachStdin: Boolean
  
  var AttachStdout: Boolean
  
  var Cmd: js.Array[String]
  
  var Domainname: String
  
  var Entrypoint: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var Env: js.Array[String]
  
  var ExposedPorts: StringDictionary[js.Object]
  
  var Hostname: String
  
  var Image: String
  
  var Labels: StringDictionary[String]
  
  var OnBuild: js.Array[js.Any]
  
  var OpenStdin: Boolean
  
  var StdinOnce: Boolean
  
  var Tty: Boolean
  
  var User: String
  
  var Volumes: StringDictionary[js.Object]
  
  var WorkingDir: String
}
object AttachStdin {
  
  @scala.inline
  def apply(
    ArgsEscaped: Boolean,
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
    OnBuild: js.Array[js.Any],
    OpenStdin: Boolean,
    StdinOnce: Boolean,
    Tty: Boolean,
    User: String,
    Volumes: StringDictionary[js.Object],
    WorkingDir: String
  ): AttachStdin = {
    val __obj = js.Dynamic.literal(ArgsEscaped = ArgsEscaped.asInstanceOf[js.Any], AttachStderr = AttachStderr.asInstanceOf[js.Any], AttachStdin = AttachStdin.asInstanceOf[js.Any], AttachStdout = AttachStdout.asInstanceOf[js.Any], Cmd = Cmd.asInstanceOf[js.Any], Domainname = Domainname.asInstanceOf[js.Any], Env = Env.asInstanceOf[js.Any], ExposedPorts = ExposedPorts.asInstanceOf[js.Any], Hostname = Hostname.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], OnBuild = OnBuild.asInstanceOf[js.Any], OpenStdin = OpenStdin.asInstanceOf[js.Any], StdinOnce = StdinOnce.asInstanceOf[js.Any], Tty = Tty.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], Volumes = Volumes.asInstanceOf[js.Any], WorkingDir = WorkingDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachStdin]
  }
  
  @scala.inline
  implicit class AttachStdinMutableBuilder[Self <: AttachStdin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgsEscaped(value: Boolean): Self = StObject.set(x, "ArgsEscaped", value.asInstanceOf[js.Any])
    
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
    def setOnBuild(value: js.Array[js.Any]): Self = StObject.set(x, "OnBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBuildVarargs(value: js.Any*): Self = StObject.set(x, "OnBuild", js.Array(value :_*))
    
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
