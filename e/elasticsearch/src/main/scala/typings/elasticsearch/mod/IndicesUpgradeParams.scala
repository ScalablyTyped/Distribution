package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesUpgradeParams
  extends StObject
     with GenericParams {
  
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: NameList
  
  var onlyAncientSegments: js.UndefOr[Boolean] = js.undefined
  
  var waitForCompletion: js.UndefOr[Boolean] = js.undefined
}
object IndicesUpgradeParams {
  
  inline def apply(index: NameList): IndicesUpgradeParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesUpgradeParams]
  }
  
  extension [Self <: IndicesUpgradeParams](x: Self) {
    
    inline def setExpandWildcards(value: ExpandWildcards): Self = StObject.set(x, "expandWildcards", value.asInstanceOf[js.Any])
    
    inline def setExpandWildcardsUndefined: Self = StObject.set(x, "expandWildcards", js.undefined)
    
    inline def setIgnoreUnavailable(value: Boolean): Self = StObject.set(x, "ignoreUnavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnavailableUndefined: Self = StObject.set(x, "ignoreUnavailable", js.undefined)
    
    inline def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setOnlyAncientSegments(value: Boolean): Self = StObject.set(x, "onlyAncientSegments", value.asInstanceOf[js.Any])
    
    inline def setOnlyAncientSegmentsUndefined: Self = StObject.set(x, "onlyAncientSegments", js.undefined)
    
    inline def setWaitForCompletion(value: Boolean): Self = StObject.set(x, "waitForCompletion", value.asInstanceOf[js.Any])
    
    inline def setWaitForCompletionUndefined: Self = StObject.set(x, "waitForCompletion", js.undefined)
  }
}
