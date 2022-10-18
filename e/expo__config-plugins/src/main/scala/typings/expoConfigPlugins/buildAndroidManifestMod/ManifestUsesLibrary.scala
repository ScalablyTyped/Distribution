package typings.expoConfigPlugins.buildAndroidManifestMod

import typings.expoConfigPlugins.anon.AndroidManifestAttributesAndroidname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestUsesLibrary extends StObject {
  
  @JSName("$")
  var $: AndroidManifestAttributesAndroidname
}
object ManifestUsesLibrary {
  
  inline def apply($: AndroidManifestAttributesAndroidname): ManifestUsesLibrary = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestUsesLibrary]
  }
  
  extension [Self <: ManifestUsesLibrary](x: Self) {
    
    inline def set$(value: AndroidManifestAttributesAndroidname): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
