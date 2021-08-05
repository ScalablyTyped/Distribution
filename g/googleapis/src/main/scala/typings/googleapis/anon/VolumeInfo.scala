package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeInfo extends StObject {
  
  var volumeInfo: js.UndefOr[js.Array[StorageFree]] = js.undefined
}
object VolumeInfo {
  
  inline def apply(): VolumeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeInfo]
  }
  
  extension [Self <: VolumeInfo](x: Self) {
    
    inline def setVolumeInfo(value: js.Array[StorageFree]): Self = StObject.set(x, "volumeInfo", value.asInstanceOf[js.Any])
    
    inline def setVolumeInfoUndefined: Self = StObject.set(x, "volumeInfo", js.undefined)
    
    inline def setVolumeInfoVarargs(value: StorageFree*): Self = StObject.set(x, "volumeInfo", js.Array(value :_*))
  }
}
