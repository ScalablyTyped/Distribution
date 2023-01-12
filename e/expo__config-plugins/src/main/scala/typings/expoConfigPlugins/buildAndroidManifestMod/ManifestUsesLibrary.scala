package typings.expoConfigPlugins.buildAndroidManifestMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestUsesLibrary] (val x: Self) extends AnyVal {
    
    inline def set$(value: AndroidManifestAttributesAndroidrequired): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
