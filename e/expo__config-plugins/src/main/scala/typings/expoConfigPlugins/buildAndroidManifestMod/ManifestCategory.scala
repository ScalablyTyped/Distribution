package typings.expoConfigPlugins.buildAndroidManifestMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestCategory extends StObject {
  
  @JSName("$")
  var $: AndroidManifestAttributes
}
object ManifestCategory {
  
  inline def apply($: AndroidManifestAttributes): ManifestCategory = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestCategory]
  }
  
  extension [Self <: ManifestCategory](x: Self) {
    
    inline def set$(value: AndroidManifestAttributes): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
