package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerInfo extends js.Object {
  var Command: java.lang.String
  var Created: scala.Double
  var HostConfig: dockerodeLib.Anon_NetworkMode
  var Id: java.lang.String
  var Image: java.lang.String
  var ImageID: java.lang.String
  var Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var Names: js.Array[java.lang.String]
  var NetworkSettings: dockerodeLib.Anon_NetworkType
  var Ports: js.Array[Port]
  var State: java.lang.String
  var Status: java.lang.String
}

object ContainerInfo {
  @scala.inline
  def apply(
    Command: java.lang.String,
    Created: scala.Double,
    HostConfig: dockerodeLib.Anon_NetworkMode,
    Id: java.lang.String,
    Image: java.lang.String,
    ImageID: java.lang.String,
    Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    Names: js.Array[java.lang.String],
    NetworkSettings: dockerodeLib.Anon_NetworkType,
    Ports: js.Array[Port],
    State: java.lang.String,
    Status: java.lang.String
  ): ContainerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Command")(Command)
    __obj.updateDynamic("Created")(Created)
    __obj.updateDynamic("HostConfig")(HostConfig)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("Image")(Image)
    __obj.updateDynamic("ImageID")(ImageID)
    __obj.updateDynamic("Labels")(Labels)
    __obj.updateDynamic("Names")(Names)
    __obj.updateDynamic("NetworkSettings")(NetworkSettings)
    __obj.updateDynamic("Ports")(Ports)
    __obj.updateDynamic("State")(State)
    __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[ContainerInfo]
  }
}

