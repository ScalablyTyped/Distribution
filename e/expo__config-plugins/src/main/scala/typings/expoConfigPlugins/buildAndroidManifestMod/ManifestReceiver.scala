package typings.expoConfigPlugins.buildAndroidManifestMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestReceiver extends StObject {
  
  @JSName("$")
  var $: typings.expoConfigPlugins.anon.AndroidManifestAttributes
  
  var `intent-filter`: js.UndefOr[js.Array[ManifestIntentFilter]] = js.undefined
}
object ManifestReceiver {
  
  inline def apply($: typings.expoConfigPlugins.anon.AndroidManifestAttributes): ManifestReceiver = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestReceiver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestReceiver] (val x: Self) extends AnyVal {
    
    inline def set$(value: typings.expoConfigPlugins.anon.AndroidManifestAttributes): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def `setIntent-filter`(value: js.Array[ManifestIntentFilter]): Self = StObject.set(x, "intent-filter", value.asInstanceOf[js.Any])
    
    inline def `setIntent-filterUndefined`: Self = StObject.set(x, "intent-filter", js.undefined)
    
    inline def `setIntent-filterVarargs`(value: ManifestIntentFilter*): Self = StObject.set(x, "intent-filter", js.Array(value*))
  }
}
