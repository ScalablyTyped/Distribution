package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatNodesRequest
  extends StObject
     with CatCatRequestBase {
  
  var bytes: js.UndefOr[Bytes] = js.undefined
  
  var full_id: js.UndefOr[Boolean | String] = js.undefined
}
object CatNodesRequest {
  
  inline def apply(): CatNodesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatNodesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatNodesRequest] (val x: Self) extends AnyVal {
    
    inline def setBytes(value: Bytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setFull_id(value: Boolean | String): Self = StObject.set(x, "full_id", value.asInstanceOf[js.Any])
    
    inline def setFull_idUndefined: Self = StObject.set(x, "full_id", js.undefined)
  }
}
