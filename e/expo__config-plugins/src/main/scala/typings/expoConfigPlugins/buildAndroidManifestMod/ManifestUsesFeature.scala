package typings.expoConfigPlugins.buildAndroidManifestMod

import typings.expoConfigPlugins.anon.AndroidManifestAttributesAndroidglEsVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestUsesFeature extends StObject {
  
  @JSName("$")
  var $: AndroidManifestAttributesAndroidglEsVersion
}
object ManifestUsesFeature {
  
  inline def apply($: AndroidManifestAttributesAndroidglEsVersion): ManifestUsesFeature = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestUsesFeature]
  }
  
  extension [Self <: ManifestUsesFeature](x: Self) {
    
    inline def set$(value: AndroidManifestAttributesAndroidglEsVersion): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
