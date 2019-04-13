package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerCreateOptions extends js.Object {
  var AttachStderr: js.UndefOr[scala.Boolean] = js.undefined
  var AttachStdin: js.UndefOr[scala.Boolean] = js.undefined
  var AttachStdout: js.UndefOr[scala.Boolean] = js.undefined
  var Cmd: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var Domainname: js.UndefOr[java.lang.String] = js.undefined
  var Entrypoint: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var Env: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ExposedPorts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Object]] = js.undefined
  var HostConfig: js.UndefOr[dockerodeLib.Anon_AutoRemove] = js.undefined
  var Hostname: js.UndefOr[java.lang.String] = js.undefined
  var Image: js.UndefOr[java.lang.String] = js.undefined
  var Labels: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var MacAddress: js.UndefOr[scala.Boolean] = js.undefined
  var NetworkDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var NetworkingConfig: js.UndefOr[dockerodeLib.Anon_EndpointsConfig] = js.undefined
  var OpenStdin: js.UndefOr[scala.Boolean] = js.undefined
  var StdinOnce: js.UndefOr[scala.Boolean] = js.undefined
  var StopSignal: js.UndefOr[java.lang.String] = js.undefined
  var Tty: js.UndefOr[scala.Boolean] = js.undefined
  var User: js.UndefOr[java.lang.String] = js.undefined
  var Volumes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Object]] = js.undefined
  var WorkingDir: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ContainerCreateOptions {
  @scala.inline
  def apply(
    AttachStderr: js.UndefOr[scala.Boolean] = js.undefined,
    AttachStdin: js.UndefOr[scala.Boolean] = js.undefined,
    AttachStdout: js.UndefOr[scala.Boolean] = js.undefined,
    Cmd: js.Array[java.lang.String] = null,
    Domainname: java.lang.String = null,
    Entrypoint: java.lang.String | js.Array[java.lang.String] = null,
    Env: js.Array[java.lang.String] = null,
    ExposedPorts: org.scalablytyped.runtime.StringDictionary[js.Object] = null,
    HostConfig: dockerodeLib.Anon_AutoRemove = null,
    Hostname: java.lang.String = null,
    Image: java.lang.String = null,
    Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    MacAddress: js.UndefOr[scala.Boolean] = js.undefined,
    NetworkDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    NetworkingConfig: dockerodeLib.Anon_EndpointsConfig = null,
    OpenStdin: js.UndefOr[scala.Boolean] = js.undefined,
    StdinOnce: js.UndefOr[scala.Boolean] = js.undefined,
    StopSignal: java.lang.String = null,
    Tty: js.UndefOr[scala.Boolean] = js.undefined,
    User: java.lang.String = null,
    Volumes: org.scalablytyped.runtime.StringDictionary[js.Object] = null,
    WorkingDir: java.lang.String = null,
    name: java.lang.String = null
  ): ContainerCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AttachStderr)) __obj.updateDynamic("AttachStderr")(AttachStderr)
    if (!js.isUndefined(AttachStdin)) __obj.updateDynamic("AttachStdin")(AttachStdin)
    if (!js.isUndefined(AttachStdout)) __obj.updateDynamic("AttachStdout")(AttachStdout)
    if (Cmd != null) __obj.updateDynamic("Cmd")(Cmd)
    if (Domainname != null) __obj.updateDynamic("Domainname")(Domainname)
    if (Entrypoint != null) __obj.updateDynamic("Entrypoint")(Entrypoint.asInstanceOf[js.Any])
    if (Env != null) __obj.updateDynamic("Env")(Env)
    if (ExposedPorts != null) __obj.updateDynamic("ExposedPorts")(ExposedPorts)
    if (HostConfig != null) __obj.updateDynamic("HostConfig")(HostConfig)
    if (Hostname != null) __obj.updateDynamic("Hostname")(Hostname)
    if (Image != null) __obj.updateDynamic("Image")(Image)
    if (Labels != null) __obj.updateDynamic("Labels")(Labels)
    if (!js.isUndefined(MacAddress)) __obj.updateDynamic("MacAddress")(MacAddress)
    if (!js.isUndefined(NetworkDisabled)) __obj.updateDynamic("NetworkDisabled")(NetworkDisabled)
    if (NetworkingConfig != null) __obj.updateDynamic("NetworkingConfig")(NetworkingConfig)
    if (!js.isUndefined(OpenStdin)) __obj.updateDynamic("OpenStdin")(OpenStdin)
    if (!js.isUndefined(StdinOnce)) __obj.updateDynamic("StdinOnce")(StdinOnce)
    if (StopSignal != null) __obj.updateDynamic("StopSignal")(StopSignal)
    if (!js.isUndefined(Tty)) __obj.updateDynamic("Tty")(Tty)
    if (User != null) __obj.updateDynamic("User")(User)
    if (Volumes != null) __obj.updateDynamic("Volumes")(Volumes)
    if (WorkingDir != null) __obj.updateDynamic("WorkingDir")(WorkingDir)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ContainerCreateOptions]
  }
}

