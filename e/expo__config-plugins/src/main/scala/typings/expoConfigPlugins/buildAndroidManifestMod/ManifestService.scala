package typings.expoConfigPlugins.buildAndroidManifestMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestService extends StObject {
  
  @JSName("$")
  var $: ManifestServiceAttributes
  
  var `intent-filter`: js.UndefOr[js.Array[ManifestIntentFilter]] = js.undefined
}
object ManifestService {
  
  inline def apply($: ManifestServiceAttributes): ManifestService = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestService]
  }
  
  extension [Self <: ManifestService](x: Self) {
    
    inline def set$(value: ManifestServiceAttributes): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def `setIntent-filter`(value: js.Array[ManifestIntentFilter]): Self = StObject.set(x, "intent-filter", value.asInstanceOf[js.Any])
    
    inline def `setIntent-filterUndefined`: Self = StObject.set(x, "intent-filter", js.undefined)
    
    inline def `setIntent-filterVarargs`(value: ManifestIntentFilter*): Self = StObject.set(x, "intent-filter", js.Array(value*))
  }
}
