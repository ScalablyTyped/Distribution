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
  
  @scala.inline
  def apply(format: String): CatShardsParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatShardsParams]
  }
  
  @scala.inline
  implicit class CatShardsParamsMutableBuilder[Self <: CatShardsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytes(value: CatBytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    @scala.inline
    def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
  }
}
