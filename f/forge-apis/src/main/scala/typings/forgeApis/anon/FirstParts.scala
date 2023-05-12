package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstParts extends StObject {
  
  var firstParts: js.UndefOr[Double] = js.undefined
  
  var minutesExpiration: js.UndefOr[Double] = js.undefined
  
  var parts: js.UndefOr[Double] = js.undefined
  
  var uploadKey: js.UndefOr[String] = js.undefined
  
  var useAcceleration: js.UndefOr[Boolean] = js.undefined
}
object FirstParts {
  
  inline def apply(): FirstParts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstParts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstParts] (val x: Self) extends AnyVal {
    
    inline def setFirstParts(value: Double): Self = StObject.set(x, "firstParts", value.asInstanceOf[js.Any])
    
    inline def setFirstPartsUndefined: Self = StObject.set(x, "firstParts", js.undefined)
    
    inline def setMinutesExpiration(value: Double): Self = StObject.set(x, "minutesExpiration", value.asInstanceOf[js.Any])
    
    inline def setMinutesExpirationUndefined: Self = StObject.set(x, "minutesExpiration", js.undefined)
    
    inline def setParts(value: Double): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    inline def setUploadKey(value: String): Self = StObject.set(x, "uploadKey", value.asInstanceOf[js.Any])
    
    inline def setUploadKeyUndefined: Self = StObject.set(x, "uploadKey", js.undefined)
    
    inline def setUseAcceleration(value: Boolean): Self = StObject.set(x, "useAcceleration", value.asInstanceOf[js.Any])
    
    inline def setUseAccelerationUndefined: Self = StObject.set(x, "useAcceleration", js.undefined)
  }
}
