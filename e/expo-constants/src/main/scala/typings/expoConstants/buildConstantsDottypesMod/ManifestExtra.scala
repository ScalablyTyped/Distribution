package typings.expoConstants.buildConstantsDottypesMod

import typings.expoConstants.anon.ExpoConfighostUristringun
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestExtra
  extends StObject
     with ClientScopingConfig {
  
  var eas: js.UndefOr[EASConfig] = js.undefined
  
  var expoClient: js.UndefOr[ExpoConfighostUristringun] = js.undefined
  
  var expoGo: js.UndefOr[ExpoGoConfig] = js.undefined
}
object ManifestExtra {
  
  inline def apply(): ManifestExtra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestExtra]
  }
  
  extension [Self <: ManifestExtra](x: Self) {
    
    inline def setEas(value: EASConfig): Self = StObject.set(x, "eas", value.asInstanceOf[js.Any])
    
    inline def setEasUndefined: Self = StObject.set(x, "eas", js.undefined)
    
    inline def setExpoClient(value: ExpoConfighostUristringun): Self = StObject.set(x, "expoClient", value.asInstanceOf[js.Any])
    
    inline def setExpoClientUndefined: Self = StObject.set(x, "expoClient", js.undefined)
    
    inline def setExpoGo(value: ExpoGoConfig): Self = StObject.set(x, "expoGo", value.asInstanceOf[js.Any])
    
    inline def setExpoGoUndefined: Self = StObject.set(x, "expoGo", js.undefined)
  }
}
