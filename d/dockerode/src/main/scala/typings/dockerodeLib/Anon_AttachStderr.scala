package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachStderr extends js.Object {
  var AttachStderr: scala.Boolean
  var AttachStdin: scala.Boolean
  var AttachStdout: scala.Boolean
  var Cmd: js.Array[java.lang.String]
  var Domainname: java.lang.String
  var Entrypoint: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var Env: js.Array[java.lang.String]
  var ExposedPorts: org.scalablytyped.runtime.StringDictionary[js.Object]
  var Hostname: java.lang.String
  var Image: java.lang.String
  var Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var OnBuild: js.UndefOr[js.Any] = js.undefined
  var OpenStdin: scala.Boolean
  var StdinOnce: scala.Boolean
  var Tty: scala.Boolean
  var User: java.lang.String
  var Volumes: org.scalablytyped.runtime.StringDictionary[js.Object]
  var WorkingDir: java.lang.String
}

object Anon_AttachStderr {
  @scala.inline
  def apply(
    AttachStderr: scala.Boolean,
    AttachStdin: scala.Boolean,
    AttachStdout: scala.Boolean,
    Cmd: js.Array[java.lang.String],
    Domainname: java.lang.String,
    Env: js.Array[java.lang.String],
    ExposedPorts: org.scalablytyped.runtime.StringDictionary[js.Object],
    Hostname: java.lang.String,
    Image: java.lang.String,
    Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    OpenStdin: scala.Boolean,
    StdinOnce: scala.Boolean,
    Tty: scala.Boolean,
    User: java.lang.String,
    Volumes: org.scalablytyped.runtime.StringDictionary[js.Object],
    WorkingDir: java.lang.String,
    Entrypoint: java.lang.String | js.Array[java.lang.String] = null,
    OnBuild: js.Any = null
  ): Anon_AttachStderr = {
    val __obj = js.Dynamic.literal(AttachStderr = AttachStderr, AttachStdin = AttachStdin, AttachStdout = AttachStdout, Cmd = Cmd, Domainname = Domainname, Env = Env, ExposedPorts = ExposedPorts, Hostname = Hostname, Image = Image, Labels = Labels, OpenStdin = OpenStdin, StdinOnce = StdinOnce, Tty = Tty, User = User, Volumes = Volumes, WorkingDir = WorkingDir)
    if (Entrypoint != null) __obj.updateDynamic("Entrypoint")(Entrypoint.asInstanceOf[js.Any])
    if (OnBuild != null) __obj.updateDynamic("OnBuild")(OnBuild)
    __obj.asInstanceOf[Anon_AttachStderr]
  }
}

