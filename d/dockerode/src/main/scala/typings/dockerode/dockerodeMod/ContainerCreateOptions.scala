package typings.dockerode.dockerodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.Anon_EndpointsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerCreateOptions extends js.Object {
  var AttachStderr: js.UndefOr[Boolean] = js.undefined
  var AttachStdin: js.UndefOr[Boolean] = js.undefined
  var AttachStdout: js.UndefOr[Boolean] = js.undefined
  var Cmd: js.UndefOr[js.Array[String]] = js.undefined
  var Domainname: js.UndefOr[String] = js.undefined
  var Entrypoint: js.UndefOr[String | js.Array[String]] = js.undefined
  var Env: js.UndefOr[js.Array[String]] = js.undefined
  var ExposedPorts: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  var HostConfig: js.UndefOr[typings.dockerode.dockerodeMod.HostConfig] = js.undefined
  var Hostname: js.UndefOr[String] = js.undefined
  var Image: js.UndefOr[String] = js.undefined
  var Labels: js.UndefOr[StringDictionary[String]] = js.undefined
  var MacAddress: js.UndefOr[Boolean] = js.undefined
  var NetworkDisabled: js.UndefOr[Boolean] = js.undefined
  var NetworkingConfig: js.UndefOr[Anon_EndpointsConfig] = js.undefined
  var OpenStdin: js.UndefOr[Boolean] = js.undefined
  var StdinOnce: js.UndefOr[Boolean] = js.undefined
  var StopSignal: js.UndefOr[String] = js.undefined
  var Tty: js.UndefOr[Boolean] = js.undefined
  var User: js.UndefOr[String] = js.undefined
  var Volumes: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  var WorkingDir: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object ContainerCreateOptions {
  @scala.inline
  def apply(
    AttachStderr: js.UndefOr[Boolean] = js.undefined,
    AttachStdin: js.UndefOr[Boolean] = js.undefined,
    AttachStdout: js.UndefOr[Boolean] = js.undefined,
    Cmd: js.Array[String] = null,
    Domainname: String = null,
    Entrypoint: String | js.Array[String] = null,
    Env: js.Array[String] = null,
    ExposedPorts: StringDictionary[js.Object] = null,
    HostConfig: HostConfig = null,
    Hostname: String = null,
    Image: String = null,
    Labels: StringDictionary[String] = null,
    MacAddress: js.UndefOr[Boolean] = js.undefined,
    NetworkDisabled: js.UndefOr[Boolean] = js.undefined,
    NetworkingConfig: Anon_EndpointsConfig = null,
    OpenStdin: js.UndefOr[Boolean] = js.undefined,
    StdinOnce: js.UndefOr[Boolean] = js.undefined,
    StopSignal: String = null,
    Tty: js.UndefOr[Boolean] = js.undefined,
    User: String = null,
    Volumes: StringDictionary[js.Object] = null,
    WorkingDir: String = null,
    name: String = null
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

