package typings.expoConfigPlugins.buildAndroidManifestMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestUsesPermission extends StObject {
  
  @JSName("$")
  var $: AndroidManifestAttributes
}
object ManifestUsesPermission {
  
  inline def apply($: AndroidManifestAttributes): ManifestUsesPermission = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestUsesPermission]
  }
  
  extension [Self <: ManifestUsesPermission](x: Self) {
    
    inline def set$(value: AndroidManifestAttributes): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
