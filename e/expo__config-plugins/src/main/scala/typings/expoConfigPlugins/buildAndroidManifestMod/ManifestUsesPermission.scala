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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestUsesPermission] (val x: Self) extends AnyVal {
    
    inline def set$(value: AndroidManifestAttributes): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
