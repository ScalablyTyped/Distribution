package typings.dockerode

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachStderr extends js.Object {
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
  var OnBuild: js.UndefOr[js.Any] = js.undefined
  var OpenStdin: Boolean
  var StdinOnce: Boolean
  var Tty: Boolean
  var User: String
  var Volumes: StringDictionary[js.Object]
  var WorkingDir: String
}

object Anon_AttachStderr {
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
    WorkingDir: String,
    Entrypoint: String | js.Array[String] = null,
    OnBuild: js.Any = null
  ): Anon_AttachStderr = {
    val __obj = js.Dynamic.literal(AttachStderr = AttachStderr, AttachStdin = AttachStdin, AttachStdout = AttachStdout, Cmd = Cmd, Domainname = Domainname, Env = Env, ExposedPorts = ExposedPorts, Hostname = Hostname, Image = Image, Labels = Labels, OpenStdin = OpenStdin, StdinOnce = StdinOnce, Tty = Tty, User = User, Volumes = Volumes, WorkingDir = WorkingDir)
    if (Entrypoint != null) __obj.updateDynamic("Entrypoint")(Entrypoint.asInstanceOf[js.Any])
    if (OnBuild != null) __obj.updateDynamic("OnBuild")(OnBuild)
    __obj.asInstanceOf[Anon_AttachStderr]
  }
}

