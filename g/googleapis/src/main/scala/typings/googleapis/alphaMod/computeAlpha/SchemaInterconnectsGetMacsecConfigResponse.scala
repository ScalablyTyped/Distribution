package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectsGetMacsecConfigResponse extends StObject {
  
  /**
    * end_interface: MixerGetResponseWithEtagBuilder
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  var result: js.UndefOr[SchemaInterconnectMacsecConfig] = js.undefined
}
object SchemaInterconnectsGetMacsecConfigResponse {
  
  inline def apply(): SchemaInterconnectsGetMacsecConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectsGetMacsecConfigResponse]
  }
  
  extension [Self <: SchemaInterconnectsGetMacsecConfigResponse](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setResult(value: SchemaInterconnectMacsecConfig): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
