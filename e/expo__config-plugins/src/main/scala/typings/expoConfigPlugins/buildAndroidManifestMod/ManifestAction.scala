package typings.expoConfigPlugins.buildAndroidManifestMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestAction extends StObject {
  
  @JSName("$")
  var $: AndroidManifestAttributes
}
object ManifestAction {
  
  inline def apply($: AndroidManifestAttributes): ManifestAction = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestAction] (val x: Self) extends AnyVal {
    
    inline def set$(value: AndroidManifestAttributes): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
