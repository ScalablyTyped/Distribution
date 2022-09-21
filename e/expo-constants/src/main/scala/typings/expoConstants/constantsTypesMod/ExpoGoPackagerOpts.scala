package typings.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpoGoPackagerOpts
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var dev: js.UndefOr[Boolean] = js.undefined
  
  var hostType: js.UndefOr[String] = js.undefined
  
  var lanType: js.UndefOr[String] = js.undefined
  
  var minify: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var urlRandomness: js.UndefOr[String] = js.undefined
  
  var urlType: js.UndefOr[String] = js.undefined
}
object ExpoGoPackagerOpts {
  
  inline def apply(): ExpoGoPackagerOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpoGoPackagerOpts]
  }
  
  extension [Self <: ExpoGoPackagerOpts](x: Self) {
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
    
    inline def setHostType(value: String): Self = StObject.set(x, "hostType", value.asInstanceOf[js.Any])
    
    inline def setHostTypeUndefined: Self = StObject.set(x, "hostType", js.undefined)
    
    inline def setLanType(value: String): Self = StObject.set(x, "lanType", value.asInstanceOf[js.Any])
    
    inline def setLanTypeUndefined: Self = StObject.set(x, "lanType", js.undefined)
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setUrlRandomness(value: String): Self = StObject.set(x, "urlRandomness", value.asInstanceOf[js.Any])
    
    inline def setUrlRandomnessUndefined: Self = StObject.set(x, "urlRandomness", js.undefined)
    
    inline def setUrlType(value: String): Self = StObject.set(x, "urlType", value.asInstanceOf[js.Any])
    
    inline def setUrlTypeUndefined: Self = StObject.set(x, "urlType", js.undefined)
  }
}
