package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAdsForce extends StObject {
  
  var xAdsForce: js.UndefOr[Boolean] = js.undefined
}
object XAdsForce {
  
  inline def apply(): XAdsForce = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAdsForce]
  }
  
  extension [Self <: XAdsForce](x: Self) {
    
    inline def setXAdsForce(value: Boolean): Self = StObject.set(x, "xAdsForce", value.asInstanceOf[js.Any])
    
    inline def setXAdsForceUndefined: Self = StObject.set(x, "xAdsForce", js.undefined)
  }
}
