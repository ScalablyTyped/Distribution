package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.green
import typings.elasticsearch.elasticsearchStrings.red
import typings.elasticsearch.elasticsearchStrings.yellow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatIndicesParams
  extends StObject
     with CatCommonParams {
  
  var bytes: js.UndefOr[CatBytes] = js.undefined
  
  var health: js.UndefOr[green | yellow | red] = js.undefined
  
  var index: js.UndefOr[NameList] = js.undefined
  
  var pri: js.UndefOr[Boolean] = js.undefined
}
object CatIndicesParams {
  
  inline def apply(format: String): CatIndicesParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatIndicesParams]
  }
  
  extension [Self <: CatIndicesParams](x: Self) {
    
    inline def setBytes(value: CatBytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setHealth(value: green | yellow | red): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setPri(value: Boolean): Self = StObject.set(x, "pri", value.asInstanceOf[js.Any])
    
    inline def setPriUndefined: Self = StObject.set(x, "pri", js.undefined)
  }
}
