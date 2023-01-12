package typings.expoConfigPlugins.buildAndroidManifestMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestData] (val x: Self) extends AnyVal {
    
    inline def set$(value: Dictkey): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
