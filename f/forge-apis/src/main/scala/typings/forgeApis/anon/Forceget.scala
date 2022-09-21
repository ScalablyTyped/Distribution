package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Forceget extends StObject {
  
  var acceptEncoding: js.UndefOr[String] = js.undefined
  
  var forceget: js.UndefOr[Boolean] = js.undefined
  
  var xAdsForce: js.UndefOr[Boolean] = js.undefined
}
object Forceget {
  
  inline def apply(): Forceget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Forceget]
  }
  
  extension [Self <: Forceget](x: Self) {
    
    inline def setAcceptEncoding(value: String): Self = StObject.set(x, "acceptEncoding", value.asInstanceOf[js.Any])
    
    inline def setAcceptEncodingUndefined: Self = StObject.set(x, "acceptEncoding", js.undefined)
    
    inline def setForceget(value: Boolean): Self = StObject.set(x, "forceget", value.asInstanceOf[js.Any])
    
    inline def setForcegetUndefined: Self = StObject.set(x, "forceget", js.undefined)
    
    inline def setXAdsForce(value: Boolean): Self = StObject.set(x, "xAdsForce", value.asInstanceOf[js.Any])
    
    inline def setXAdsForceUndefined: Self = StObject.set(x, "xAdsForce", js.undefined)
  }
}
