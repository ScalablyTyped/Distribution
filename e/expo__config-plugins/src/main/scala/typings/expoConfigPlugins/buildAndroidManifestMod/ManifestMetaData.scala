package typings.expoConfigPlugins.buildAndroidManifestMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestMetaData extends StObject {
  
  @JSName("$")
  var $: ManifestMetaDataAttributes
}
object ManifestMetaData {
  
  inline def apply($: ManifestMetaDataAttributes): ManifestMetaData = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestMetaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestMetaData] (val x: Self) extends AnyVal {
    
    inline def set$(value: ManifestMetaDataAttributes): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
