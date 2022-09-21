package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Objectid extends StObject {
  
  var acceptEncoding: js.UndefOr[String] = js.undefined
  
  var forceget: js.UndefOr[Boolean] = js.undefined
  
  var objectid: js.UndefOr[Double] = js.undefined
  
  var xAdsForce: js.UndefOr[Boolean] = js.undefined
}
object Objectid {
  
  inline def apply(): Objectid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Objectid]
  }
  
  extension [Self <: Objectid](x: Self) {
    
    inline def setAcceptEncoding(value: String): Self = StObject.set(x, "acceptEncoding", value.asInstanceOf[js.Any])
    
    inline def setAcceptEncodingUndefined: Self = StObject.set(x, "acceptEncoding", js.undefined)
    
    inline def setForceget(value: Boolean): Self = StObject.set(x, "forceget", value.asInstanceOf[js.Any])
    
    inline def setForcegetUndefined: Self = StObject.set(x, "forceget", js.undefined)
    
    inline def setObjectid(value: Double): Self = StObject.set(x, "objectid", value.asInstanceOf[js.Any])
    
    inline def setObjectidUndefined: Self = StObject.set(x, "objectid", js.undefined)
    
    inline def setXAdsForce(value: Boolean): Self = StObject.set(x, "xAdsForce", value.asInstanceOf[js.Any])
    
    inline def setXAdsForceUndefined: Self = StObject.set(x, "xAdsForce", js.undefined)
  }
}
