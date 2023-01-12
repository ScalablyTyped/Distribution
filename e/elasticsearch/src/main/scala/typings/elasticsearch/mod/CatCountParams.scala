package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatCountParams
  extends StObject
     with CatCommonParams {
  
  var index: js.UndefOr[NameList] = js.undefined
}
object CatCountParams {
  
  inline def apply(format: String): CatCountParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatCountParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatCountParams] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value*))
  }
}
