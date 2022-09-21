package typings.expoConfigPlugins.manifestMod

import typings.expoConfigPlugins.anon.AndroidManifestAttributesAndroidrequired
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestUsesLibrary extends StObject {
  
  @JSName("$")
  var $: AndroidManifestAttributesAndroidrequired
}
object ManifestUsesLibrary {
  
  inline def apply($: AndroidManifestAttributesAndroidrequired): ManifestUsesLibrary = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestUsesLibrary]
  }
  
  extension [Self <: ManifestUsesLibrary](x: Self) {
    
    inline def set$(value: AndroidManifestAttributesAndroidrequired): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
