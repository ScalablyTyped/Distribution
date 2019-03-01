package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsEscaped extends js.Object {
  var ArgsEscaped: scala.Boolean
  var AttachStderr: scala.Boolean
  var AttachStdin: scala.Boolean
  var AttachStdout: scala.Boolean
  var Cmd: js.Array[java.lang.String]
  var Domainname: java.lang.String
  var Entrypoint: js.UndefOr[js.Any] = js.undefined
  var Env: js.Array[java.lang.String]
  var ExposedPorts: org.scalablytyped.runtime.StringDictionary[js.Object]
  var Hostname: java.lang.String
  var Image: java.lang.String
  var Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var OnBuild: js.UndefOr[js.Array[_]] = js.undefined
  var OpenStdin: scala.Boolean
  var StdinOnce: scala.Boolean
  var Tty: scala.Boolean
  var User: java.lang.String
  var Volumes: org.scalablytyped.runtime.StringDictionary[js.Object]
  var WorkingDir: java.lang.String
}

object Anon_ArgsEscaped {
  @scala.inline
  def apply(
    ArgsEscaped: scala.Boolean,
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
    Entrypoint: js.Any = null,
    OnBuild: js.Array[_] = null
  ): Anon_ArgsEscaped = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ArgsEscaped")(ArgsEscaped)
    __obj.updateDynamic("AttachStderr")(AttachStderr)
    __obj.updateDynamic("AttachStdin")(AttachStdin)
    __obj.updateDynamic("AttachStdout")(AttachStdout)
    __obj.updateDynamic("Cmd")(Cmd)
    __obj.updateDynamic("Domainname")(Domainname)
    __obj.updateDynamic("Env")(Env)
    __obj.updateDynamic("ExposedPorts")(ExposedPorts)
    __obj.updateDynamic("Hostname")(Hostname)
    __obj.updateDynamic("Image")(Image)
    __obj.updateDynamic("Labels")(Labels)
    __obj.updateDynamic("OpenStdin")(OpenStdin)
    __obj.updateDynamic("StdinOnce")(StdinOnce)
    __obj.updateDynamic("Tty")(Tty)
    __obj.updateDynamic("User")(User)
    __obj.updateDynamic("Volumes")(Volumes)
    __obj.updateDynamic("WorkingDir")(WorkingDir)
    if (Entrypoint != null) __obj.updateDynamic("Entrypoint")(Entrypoint)
    if (OnBuild != null) __obj.updateDynamic("OnBuild")(OnBuild)
    __obj.asInstanceOf[Anon_ArgsEscaped]
  }
}

