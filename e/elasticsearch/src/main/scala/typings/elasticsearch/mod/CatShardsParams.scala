package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatShardsParams
  extends StObject
     with CatCommonParams {
  
  var bytes: js.UndefOr[CatBytes] = js.undefined
  
  var index: js.UndefOr[NameList] = js.undefined
}
object CatShardsParams {
  
  inline def apply(format: String): CatShardsParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatShardsParams]
  }
  
  extension [Self <: CatShardsParams](x: Self) {
    
    inline def setBytes(value: CatBytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
  }
}
