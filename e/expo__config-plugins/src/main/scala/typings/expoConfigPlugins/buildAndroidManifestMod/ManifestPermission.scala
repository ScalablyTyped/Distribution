package typings.expoConfigPlugins.buildAndroidManifestMod

import typings.expoConfigPlugins.anon.AndroidManifestAttributesAndroidname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestPermission extends StObject {
  
  @JSName("$")
  var $: AndroidManifestAttributesAndroidname
}
object ManifestPermission {
  
  inline def apply($: AndroidManifestAttributesAndroidname): ManifestPermission = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestPermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestPermission] (val x: Self) extends AnyVal {
    
    inline def set$(value: AndroidManifestAttributesAndroidname): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
