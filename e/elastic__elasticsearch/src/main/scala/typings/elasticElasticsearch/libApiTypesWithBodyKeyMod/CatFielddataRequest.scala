package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatFielddataRequest
  extends StObject
     with CatCatRequestBase {
  
  var bytes: js.UndefOr[Bytes] = js.undefined
  
  var fields: js.UndefOr[Fields] = js.undefined
}
object CatFielddataRequest {
  
  inline def apply(): CatFielddataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatFielddataRequest]
  }
  
  extension [Self <: CatFielddataRequest](x: Self) {
    
    inline def setBytes(value: Bytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
