package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeInfo extends js.Object {
  
  var volumeInfo: js.UndefOr[js.Array[StorageFree]] = js.native
}
object VolumeInfo {
  
  @scala.inline
  def apply(): VolumeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeInfo]
  }
  
  @scala.inline
  implicit class VolumeInfoOps[Self <: VolumeInfo] (val x: Self) extends AnyVal {
    
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
    def setVolumeInfoVarargs(value: StorageFree*): Self = this.set("volumeInfo", js.Array(value :_*))
    
    @scala.inline
    def setVolumeInfo(value: js.Array[StorageFree]): Self = this.set("volumeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeInfo: Self = this.set("volumeInfo", js.undefined)
  }
}
