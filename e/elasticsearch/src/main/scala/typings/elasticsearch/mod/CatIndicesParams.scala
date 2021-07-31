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
  
  @scala.inline
  def apply(format: String): CatIndicesParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatIndicesParams]
  }
  
  @scala.inline
  implicit class CatIndicesParamsMutableBuilder[Self <: CatIndicesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytes(value: CatBytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    @scala.inline
    def setHealth(value: green | yellow | red): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    @scala.inline
    def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setPri(value: Boolean): Self = StObject.set(x, "pri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriUndefined: Self = StObject.set(x, "pri", js.undefined)
  }
}
