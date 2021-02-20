package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeInfo extends StObject {
  
  var volumeInfo: js.UndefOr[js.Array[StorageFree]] = js.native
}
object VolumeInfo {
  
  @scala.inline
  def apply(): VolumeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeInfo]
  }
  
  @scala.inline
  implicit class VolumeInfoMutableBuilder[Self <: VolumeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeInfo(value: js.Array[StorageFree]): Self = StObject.set(x, "volumeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeInfoUndefined: Self = StObject.set(x, "volumeInfo", js.undefined)
    
    @scala.inline
    def setVolumeInfoVarargs(value: StorageFree*): Self = StObject.set(x, "volumeInfo", js.Array(value :_*))
  }
}
