package typings.dockerode

import typings.dockerode.mod.VolumeInspectInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVolumes extends js.Object {
  var Volumes: js.Array[VolumeInspectInfo]
  var Warnings: js.Array[String]
}

object AnonVolumes {
  @scala.inline
  def apply(Volumes: js.Array[VolumeInspectInfo], Warnings: js.Array[String]): AnonVolumes = {
    val __obj = js.Dynamic.literal(Volumes = Volumes.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonVolumes]
  }
}

