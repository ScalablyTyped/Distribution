package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatCountRequest
  extends StObject
     with CatCatRequestBase {
  
  var index: js.UndefOr[Indices] = js.undefined
}
object CatCountRequest {
  
  inline def apply(): CatCountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatCountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatCountRequest] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
  }
}
