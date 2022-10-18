package typings.expoConfigPlugins.buildAndroidManifestMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestPermission extends StObject {
  
  @JSName("$")
  var $: typings.expoConfigPlugins.anon.AndroidManifestAttributes
}
object ManifestPermission {
  
  inline def apply($: typings.expoConfigPlugins.anon.AndroidManifestAttributes): ManifestPermission = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestPermission]
  }
  
  extension [Self <: ManifestPermission](x: Self) {
    
    inline def set$(value: typings.expoConfigPlugins.anon.AndroidManifestAttributes): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
