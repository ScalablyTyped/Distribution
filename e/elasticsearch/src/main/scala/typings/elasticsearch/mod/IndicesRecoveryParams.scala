package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRecoveryParams
  extends StObject
     with GenericParams {
  
  var activeOnly: js.UndefOr[Boolean] = js.undefined
  
  var detailed: js.UndefOr[Boolean] = js.undefined
  
  var human: js.UndefOr[Boolean] = js.undefined
  
  var index: NameList
}
object IndicesRecoveryParams {
  
  inline def apply(index: NameList): IndicesRecoveryParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRecoveryParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesRecoveryParams] (val x: Self) extends AnyVal {
    
    inline def setActiveOnly(value: Boolean): Self = StObject.set(x, "activeOnly", value.asInstanceOf[js.Any])
    
    inline def setActiveOnlyUndefined: Self = StObject.set(x, "activeOnly", js.undefined)
    
    inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    inline def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    
    inline def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    inline def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
    
    inline def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value*))
  }
}
