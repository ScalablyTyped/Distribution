package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Volumes extends js.Object {
  var Volumes: js.Array[dockerodeLib.dockerodeMod.DockerodeNs.VolumeInspectInfo]
  var Warnings: js.Array[java.lang.String]
}

object Anon_Volumes {
  @scala.inline
  def apply(
    Volumes: js.Array[dockerodeLib.dockerodeMod.DockerodeNs.VolumeInspectInfo],
    Warnings: js.Array[java.lang.String]
  ): Anon_Volumes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Volumes")(Volumes)
    __obj.updateDynamic("Warnings")(Warnings)
    __obj.asInstanceOf[Anon_Volumes]
  }
}

