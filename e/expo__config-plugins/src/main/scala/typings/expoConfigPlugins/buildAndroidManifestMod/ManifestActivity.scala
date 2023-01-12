package typings.expoConfigPlugins.buildAndroidManifestMod

import typings.expoConfigPlugins.anon.ManifestApplicationAttrib
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestActivity extends StObject {
  
  @JSName("$")
  var $: ManifestApplicationAttrib
  
  var `intent-filter`: js.UndefOr[js.Array[ManifestIntentFilter]] = js.undefined
}
object ManifestActivity {
  
  inline def apply($: ManifestApplicationAttrib): ManifestActivity = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestActivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestActivity] (val x: Self) extends AnyVal {
    
    inline def set$(value: ManifestApplicationAttrib): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def `setIntent-filter`(value: js.Array[ManifestIntentFilter]): Self = StObject.set(x, "intent-filter", value.asInstanceOf[js.Any])
    
    inline def `setIntent-filterUndefined`: Self = StObject.set(x, "intent-filter", js.undefined)
    
    inline def `setIntent-filterVarargs`(value: ManifestIntentFilter*): Self = StObject.set(x, "intent-filter", js.Array(value*))
  }
}
