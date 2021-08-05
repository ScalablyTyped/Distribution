package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAdsRegion extends StObject {
  
  var xAdsRegion: js.UndefOr[String] = js.undefined
}
object XAdsRegion {
  
  inline def apply(): XAdsRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAdsRegion]
  }
  
  extension [Self <: XAdsRegion](x: Self) {
    
    inline def setXAdsRegion(value: String): Self = StObject.set(x, "xAdsRegion", value.asInstanceOf[js.Any])
    
    inline def setXAdsRegionUndefined: Self = StObject.set(x, "xAdsRegion", js.undefined)
  }
}
