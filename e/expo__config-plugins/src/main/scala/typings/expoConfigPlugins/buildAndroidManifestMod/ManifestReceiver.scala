package typings.expoConfigPlugins.buildAndroidManifestMod

import typings.expoConfigPlugins.anon.AndroidManifestAttributesAndroidenabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestReceiver extends StObject {
  
  @JSName("$")
  var $: AndroidManifestAttributesAndroidenabled
  
  var `intent-filter`: js.UndefOr[js.Array[ManifestIntentFilter]] = js.undefined
}
object ManifestReceiver {
  
  inline def apply($: AndroidManifestAttributesAndroidenabled): ManifestReceiver = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestReceiver]
  }
  
  extension [Self <: ManifestReceiver](x: Self) {
    
    inline def set$(value: AndroidManifestAttributesAndroidenabled): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def `setIntent-filter`(value: js.Array[ManifestIntentFilter]): Self = StObject.set(x, "intent-filter", value.asInstanceOf[js.Any])
    
    inline def `setIntent-filterUndefined`: Self = StObject.set(x, "intent-filter", js.undefined)
    
    inline def `setIntent-filterVarargs`(value: ManifestIntentFilter*): Self = StObject.set(x, "intent-filter", js.Array(value*))
  }
}
