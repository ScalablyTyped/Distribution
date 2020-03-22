package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.AnonEndpointsConfig
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
  var HostConfig: js.UndefOr[typings.dockerode.mod.HostConfig] = js.undefined
  var Hostname: js.UndefOr[String] = js.undefined
  var Image: js.UndefOr[String] = js.undefined
  var Labels: js.UndefOr[StringDictionary[String]] = js.undefined
  var MacAddress: js.UndefOr[Boolean] = js.undefined
  var NetworkDisabled: js.UndefOr[Boolean] = js.undefined
  var NetworkingConfig: js.UndefOr[AnonEndpointsConfig] = js.undefined
  var OpenStdin: js.UndefOr[Boolean] = js.undefined
  var StdinOnce: js.UndefOr[Boolean] = js.undefined
  var StopSignal: js.UndefOr[String] = js.undefined
  var StopTimeout: js.UndefOr[Double] = js.undefined
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
    NetworkingConfig: AnonEndpointsConfig = null,
    OpenStdin: js.UndefOr[Boolean] = js.undefined,
    StdinOnce: js.UndefOr[Boolean] = js.undefined,
    StopSignal: String = null,
    StopTimeout: Int | Double = null,
    Tty: js.UndefOr[Boolean] = js.undefined,
    User: String = null,
    Volumes: StringDictionary[js.Object] = null,
    WorkingDir: String = null,
    name: String = null
  ): ContainerCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AttachStderr)) __obj.updateDynamic("AttachStderr")(AttachStderr.asInstanceOf[js.Any])
    if (!js.isUndefined(AttachStdin)) __obj.updateDynamic("AttachStdin")(AttachStdin.asInstanceOf[js.Any])
    if (!js.isUndefined(AttachStdout)) __obj.updateDynamic("AttachStdout")(AttachStdout.asInstanceOf[js.Any])
    if (Cmd != null) __obj.updateDynamic("Cmd")(Cmd.asInstanceOf[js.Any])
    if (Domainname != null) __obj.updateDynamic("Domainname")(Domainname.asInstanceOf[js.Any])
    if (Entrypoint != null) __obj.updateDynamic("Entrypoint")(Entrypoint.asInstanceOf[js.Any])
    if (Env != null) __obj.updateDynamic("Env")(Env.asInstanceOf[js.Any])
    if (ExposedPorts != null) __obj.updateDynamic("ExposedPorts")(ExposedPorts.asInstanceOf[js.Any])
    if (HostConfig != null) __obj.updateDynamic("HostConfig")(HostConfig.asInstanceOf[js.Any])
    if (Hostname != null) __obj.updateDynamic("Hostname")(Hostname.asInstanceOf[js.Any])
    if (Image != null) __obj.updateDynamic("Image")(Image.asInstanceOf[js.Any])
    if (Labels != null) __obj.updateDynamic("Labels")(Labels.asInstanceOf[js.Any])
    if (!js.isUndefined(MacAddress)) __obj.updateDynamic("MacAddress")(MacAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(NetworkDisabled)) __obj.updateDynamic("NetworkDisabled")(NetworkDisabled.asInstanceOf[js.Any])
    if (NetworkingConfig != null) __obj.updateDynamic("NetworkingConfig")(NetworkingConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(OpenStdin)) __obj.updateDynamic("OpenStdin")(OpenStdin.asInstanceOf[js.Any])
    if (!js.isUndefined(StdinOnce)) __obj.updateDynamic("StdinOnce")(StdinOnce.asInstanceOf[js.Any])
    if (StopSignal != null) __obj.updateDynamic("StopSignal")(StopSignal.asInstanceOf[js.Any])
    if (StopTimeout != null) __obj.updateDynamic("StopTimeout")(StopTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(Tty)) __obj.updateDynamic("Tty")(Tty.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    if (Volumes != null) __obj.updateDynamic("Volumes")(Volumes.asInstanceOf[js.Any])
    if (WorkingDir != null) __obj.updateDynamic("WorkingDir")(WorkingDir.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerCreateOptions]
  }
}

