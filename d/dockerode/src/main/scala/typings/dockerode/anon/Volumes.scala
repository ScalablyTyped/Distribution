package typings.dockerode.anon

import typings.dockerode.mod.VolumeInspectInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Volumes extends js.Object {
  
  var Volumes: js.Array[VolumeInspectInfo] = js.native
  
  var Warnings: js.Array[String] = js.native
}
object Volumes {
  
  @scala.inline
  def apply(Volumes: js.Array[VolumeInspectInfo], Warnings: js.Array[String]): Volumes = {
    val __obj = js.Dynamic.literal(Volumes = Volumes.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volumes]
  }
  
  @scala.inline
  implicit class VolumesOps[Self <: Volumes] (val x: Self) extends AnyVal {
    
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
    def setVolumesVarargs(value: VolumeInspectInfo*): Self = this.set("Volumes", js.Array(value :_*))
    
    @scala.inline
    def setVolumes(value: js.Array[VolumeInspectInfo]): Self = this.set("Volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("Warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("Warnings", value.asInstanceOf[js.Any])
  }
}
