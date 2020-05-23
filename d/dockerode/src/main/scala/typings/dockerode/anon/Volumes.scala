package typings.dockerode.anon

import typings.dockerode.mod.VolumeInspectInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volumes extends js.Object {
  var Volumes: js.Array[VolumeInspectInfo]
  var Warnings: js.Array[String]
}

object Volumes {
  @scala.inline
  def apply(Volumes: js.Array[VolumeInspectInfo], Warnings: js.Array[String]): Volumes = {
    val __obj = js.Dynamic.literal(Volumes = Volumes.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volumes]
  }
}

