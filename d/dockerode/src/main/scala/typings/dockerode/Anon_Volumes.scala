package typings.dockerode

import typings.dockerode.dockerodeMod.VolumeInspectInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Volumes extends js.Object {
  var Volumes: js.Array[VolumeInspectInfo]
  var Warnings: js.Array[String]
}

object Anon_Volumes {
  @scala.inline
  def apply(Volumes: js.Array[VolumeInspectInfo], Warnings: js.Array[String]): Anon_Volumes = {
    val __obj = js.Dynamic.literal(Volumes = Volumes.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Volumes]
  }
}

