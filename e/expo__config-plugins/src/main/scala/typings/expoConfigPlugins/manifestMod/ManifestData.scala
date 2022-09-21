package typings.expoConfigPlugins.manifestMod

import typings.expoConfigPlugins.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestData extends StObject {
  
  @JSName("$")
  var $: Dictkey
}
object ManifestData {
  
  inline def apply($: Dictkey): ManifestData = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestData]
  }
  
  extension [Self <: ManifestData](x: Self) {
    
    inline def set$(value: Dictkey): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
