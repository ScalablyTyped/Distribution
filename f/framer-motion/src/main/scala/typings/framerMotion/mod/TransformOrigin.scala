package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformOrigin extends StObject {
  
  var originX: js.UndefOr[Double | String] = js.undefined
  
  var originY: js.UndefOr[Double | String] = js.undefined
  
  var originZ: js.UndefOr[Double | String] = js.undefined
}
object TransformOrigin {
  
  inline def apply(): TransformOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOrigin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformOrigin] (val x: Self) extends AnyVal {
    
    inline def setOriginX(value: Double | String): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
    
    inline def setOriginXUndefined: Self = StObject.set(x, "originX", js.undefined)
    
    inline def setOriginY(value: Double | String): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
    
    inline def setOriginYUndefined: Self = StObject.set(x, "originY", js.undefined)
    
    inline def setOriginZ(value: Double | String): Self = StObject.set(x, "originZ", value.asInstanceOf[js.Any])
    
    inline def setOriginZUndefined: Self = StObject.set(x, "originZ", js.undefined)
  }
}
