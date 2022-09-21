package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedProviderIds extends StObject {
  
  var detectedProviderIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var hasUnidentifiedProvider: js.UndefOr[Boolean] = js.undefined
}
object DetectedProviderIds {
  
  inline def apply(): DetectedProviderIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedProviderIds]
  }
  
  extension [Self <: DetectedProviderIds](x: Self) {
    
    inline def setDetectedProviderIds(value: js.Array[String]): Self = StObject.set(x, "detectedProviderIds", value.asInstanceOf[js.Any])
    
    inline def setDetectedProviderIdsUndefined: Self = StObject.set(x, "detectedProviderIds", js.undefined)
    
    inline def setDetectedProviderIdsVarargs(value: String*): Self = StObject.set(x, "detectedProviderIds", js.Array(value*))
    
    inline def setHasUnidentifiedProvider(value: Boolean): Self = StObject.set(x, "hasUnidentifiedProvider", value.asInstanceOf[js.Any])
    
    inline def setHasUnidentifiedProviderUndefined: Self = StObject.set(x, "hasUnidentifiedProvider", js.undefined)
  }
}
