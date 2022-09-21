package typings.expoConfigPlugins.manifestMod

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
  
  extension [Self <: ManifestMetaData](x: Self) {
    
    inline def set$(value: ManifestMetaDataAttributes): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
