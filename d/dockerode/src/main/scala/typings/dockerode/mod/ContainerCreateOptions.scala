package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerCreateOptions extends js.Object {
  var AttachStderr: js.UndefOr[Boolean] = js.native
  var AttachStdin: js.UndefOr[Boolean] = js.native
  var AttachStdout: js.UndefOr[Boolean] = js.native
  var Cmd: js.UndefOr[js.Array[String]] = js.native
  var Domainname: js.UndefOr[String] = js.native
  var Entrypoint: js.UndefOr[String | js.Array[String]] = js.native
  var Env: js.UndefOr[js.Array[String]] = js.native
  var ExposedPorts: js.UndefOr[StringDictionary[js.Object]] = js.native
  var HostConfig: js.UndefOr[typings.dockerode.mod.HostConfig] = js.native
  var Hostname: js.UndefOr[String] = js.native
  var Image: js.UndefOr[String] = js.native
  var Labels: js.UndefOr[StringDictionary[String]] = js.native
  var MacAddress: js.UndefOr[Boolean] = js.native
  var NetworkDisabled: js.UndefOr[Boolean] = js.native
  var NetworkingConfig: js.UndefOr[typings.dockerode.anon.EndpointsConfig] = js.native
  var OpenStdin: js.UndefOr[Boolean] = js.native
  var StdinOnce: js.UndefOr[Boolean] = js.native
  var StopSignal: js.UndefOr[String] = js.native
  var StopTimeout: js.UndefOr[Double] = js.native
  var Tty: js.UndefOr[Boolean] = js.native
  var User: js.UndefOr[String] = js.native
  var Volumes: js.UndefOr[StringDictionary[js.Object]] = js.native
  var WorkingDir: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
}

object ContainerCreateOptions {
  @scala.inline
  def apply(): ContainerCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerCreateOptions]
  }
  @scala.inline
  implicit class ContainerCreateOptionsOps[Self <: ContainerCreateOptions] (val x: Self) extends AnyVal {
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
    def deleteAttachStderr: Self = this.set("AttachStderr", js.undefined)
    @scala.inline
    def setAttachStdin(value: Boolean): Self = this.set("AttachStdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachStdin: Self = this.set("AttachStdin", js.undefined)
    @scala.inline
    def setAttachStdout(value: Boolean): Self = this.set("AttachStdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachStdout: Self = this.set("AttachStdout", js.undefined)
    @scala.inline
    def setCmdVarargs(value: String*): Self = this.set("Cmd", js.Array(value :_*))
    @scala.inline
    def setCmd(value: js.Array[String]): Self = this.set("Cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCmd: Self = this.set("Cmd", js.undefined)
    @scala.inline
    def setDomainname(value: String): Self = this.set("Domainname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainname: Self = this.set("Domainname", js.undefined)
    @scala.inline
    def setEntrypointVarargs(value: String*): Self = this.set("Entrypoint", js.Array(value :_*))
    @scala.inline
    def setEntrypoint(value: String | js.Array[String]): Self = this.set("Entrypoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntrypoint: Self = this.set("Entrypoint", js.undefined)
    @scala.inline
    def setEnvVarargs(value: String*): Self = this.set("Env", js.Array(value :_*))
    @scala.inline
    def setEnv(value: js.Array[String]): Self = this.set("Env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("Env", js.undefined)
    @scala.inline
    def setExposedPorts(value: StringDictionary[js.Object]): Self = this.set("ExposedPorts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposedPorts: Self = this.set("ExposedPorts", js.undefined)
    @scala.inline
    def setHostConfig(value: HostConfig): Self = this.set("HostConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostConfig: Self = this.set("HostConfig", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("Hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("Hostname", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("Image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("Image", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("Labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("Labels", js.undefined)
    @scala.inline
    def setMacAddress(value: Boolean): Self = this.set("MacAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMacAddress: Self = this.set("MacAddress", js.undefined)
    @scala.inline
    def setNetworkDisabled(value: Boolean): Self = this.set("NetworkDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkDisabled: Self = this.set("NetworkDisabled", js.undefined)
    @scala.inline
    def setNetworkingConfig(value: typings.dockerode.anon.EndpointsConfig): Self = this.set("NetworkingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkingConfig: Self = this.set("NetworkingConfig", js.undefined)
    @scala.inline
    def setOpenStdin(value: Boolean): Self = this.set("OpenStdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenStdin: Self = this.set("OpenStdin", js.undefined)
    @scala.inline
    def setStdinOnce(value: Boolean): Self = this.set("StdinOnce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdinOnce: Self = this.set("StdinOnce", js.undefined)
    @scala.inline
    def setStopSignal(value: String): Self = this.set("StopSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopSignal: Self = this.set("StopSignal", js.undefined)
    @scala.inline
    def setStopTimeout(value: Double): Self = this.set("StopTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopTimeout: Self = this.set("StopTimeout", js.undefined)
    @scala.inline
    def setTty(value: Boolean): Self = this.set("Tty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTty: Self = this.set("Tty", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("User", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
    @scala.inline
    def setVolumes(value: StringDictionary[js.Object]): Self = this.set("Volumes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumes: Self = this.set("Volumes", js.undefined)
    @scala.inline
    def setWorkingDir(value: String): Self = this.set("WorkingDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkingDir: Self = this.set("WorkingDir", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

