package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.anon.Destination
import typings.dockerode.anon.NetworkMode
import typings.dockerode.anon.Networks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerInfo extends js.Object {
  var Command: String = js.native
  var Created: Double = js.native
  var HostConfig: NetworkMode = js.native
  var Id: String = js.native
  var Image: String = js.native
  var ImageID: String = js.native
  var Labels: StringDictionary[String] = js.native
  var Mounts: js.Array[Destination] = js.native
  var Names: js.Array[String] = js.native
  var NetworkSettings: Networks = js.native
  var Ports: js.Array[Port] = js.native
  var State: String = js.native
  var Status: String = js.native
}

object ContainerInfo {
  @scala.inline
  def apply(
    Command: String,
    Created: Double,
    HostConfig: NetworkMode,
    Id: String,
    Image: String,
    ImageID: String,
    Labels: StringDictionary[String],
    Mounts: js.Array[Destination],
    Names: js.Array[String],
    NetworkSettings: Networks,
    Ports: js.Array[Port],
    State: String,
    Status: String
  ): ContainerInfo = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], HostConfig = HostConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], ImageID = ImageID.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Mounts = Mounts.asInstanceOf[js.Any], Names = Names.asInstanceOf[js.Any], NetworkSettings = NetworkSettings.asInstanceOf[js.Any], Ports = Ports.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerInfo]
  }
  @scala.inline
  implicit class ContainerInfoOps[Self <: ContainerInfo] (val x: Self) extends AnyVal {
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
    def setCommand(value: String): Self = this.set("Command", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("Created", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostConfig(value: NetworkMode): Self = this.set("HostConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("Image", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageID(value: String): Self = this.set("ImageID", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("Labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setMountsVarargs(value: Destination*): Self = this.set("Mounts", js.Array(value :_*))
    @scala.inline
    def setMounts(value: js.Array[Destination]): Self = this.set("Mounts", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("Names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("Names", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkSettings(value: Networks): Self = this.set("NetworkSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortsVarargs(value: Port*): Self = this.set("Ports", js.Array(value :_*))
    @scala.inline
    def setPorts(value: js.Array[Port]): Self = this.set("Ports", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

