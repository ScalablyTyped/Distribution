package typings.expoConstants.buildConstantsDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestAsset extends StObject {
  
  var url: String
}
object ManifestAsset {
  
  inline def apply(url: String): ManifestAsset = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestAsset]
  }
  
  extension [Self <: ManifestAsset](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
