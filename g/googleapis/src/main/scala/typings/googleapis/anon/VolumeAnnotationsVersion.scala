package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeAnnotationsVersion extends StObject {
  
  var layerId: js.UndefOr[String] = js.native
  
  var volumeAnnotationsVersion: js.UndefOr[String] = js.native
}
object VolumeAnnotationsVersion {
  
  @scala.inline
  def apply(): VolumeAnnotationsVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeAnnotationsVersion]
  }
  
  @scala.inline
  implicit class VolumeAnnotationsVersionMutableBuilder[Self <: VolumeAnnotationsVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    @scala.inline
    def setVolumeAnnotationsVersion(value: String): Self = StObject.set(x, "volumeAnnotationsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeAnnotationsVersionUndefined: Self = StObject.set(x, "volumeAnnotationsVersion", js.undefined)
  }
}
