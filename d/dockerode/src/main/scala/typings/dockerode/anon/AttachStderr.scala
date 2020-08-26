package typings.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachStderr extends js.Object {
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
  implicit class AttachStderrOps[Self <: AttachStderr] (val x: Self) extends AnyVal {
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
    def setAttachStderr(value: Boolean): Self = this.set("AttachStderr", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachStdin(value: Boolean): Self = this.set("AttachStdin", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachStdout(value: Boolean): Self = this.set("AttachStdout", value.asInstanceOf[js.Any])
    @scala.inline
    def setCmdVarargs(value: String*): Self = this.set("Cmd", js.Array(value :_*))
    @scala.inline
    def setCmd(value: js.Array[String]): Self = this.set("Cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainname(value: String): Self = this.set("Domainname", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvVarargs(value: String*): Self = this.set("Env", js.Array(value :_*))
    @scala.inline
    def setEnv(value: js.Array[String]): Self = this.set("Env", value.asInstanceOf[js.Any])
    @scala.inline
    def setExposedPorts(value: StringDictionary[js.Object]): Self = this.set("ExposedPorts", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostname(value: String): Self = this.set("Hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("Image", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("Labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenStdin(value: Boolean): Self = this.set("OpenStdin", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdinOnce(value: Boolean): Self = this.set("StdinOnce", value.asInstanceOf[js.Any])
    @scala.inline
    def setTty(value: Boolean): Self = this.set("Tty", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("User", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumes(value: StringDictionary[js.Object]): Self = this.set("Volumes", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkingDir(value: String): Self = this.set("WorkingDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntrypointVarargs(value: String*): Self = this.set("Entrypoint", js.Array(value :_*))
    @scala.inline
    def setEntrypoint(value: String | js.Array[String]): Self = this.set("Entrypoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntrypoint: Self = this.set("Entrypoint", js.undefined)
    @scala.inline
    def setOnBuild(value: js.Any): Self = this.set("OnBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBuild: Self = this.set("OnBuild", js.undefined)
  }
  
}

