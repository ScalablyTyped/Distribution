package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layers extends StObject {
  
  var layers: js.UndefOr[js.Array[VolumeAnnotationsVersion]] = js.undefined
}
object Layers {
  
  inline def apply(): Layers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layers]
  }
  
  extension [Self <: Layers](x: Self) {
    
    inline def setLayers(value: js.Array[VolumeAnnotationsVersion]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: VolumeAnnotationsVersion*): Self = StObject.set(x, "layers", js.Array(value*))
  }
}
