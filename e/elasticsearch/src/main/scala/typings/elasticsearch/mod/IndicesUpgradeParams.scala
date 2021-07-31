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
  
  @scala.inline
  def apply(index: NameList): IndicesUpgradeParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesUpgradeParams]
  }
  
  @scala.inline
  implicit class IndicesUpgradeParamsMutableBuilder[Self <: IndicesUpgradeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpandWildcards(value: ExpandWildcards): Self = StObject.set(x, "expandWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandWildcardsUndefined: Self = StObject.set(x, "expandWildcards", js.undefined)
    
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = StObject.set(x, "ignoreUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnavailableUndefined: Self = StObject.set(x, "ignoreUnavailable", js.undefined)
    
    @scala.inline
    def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setOnlyAncientSegments(value: Boolean): Self = StObject.set(x, "onlyAncientSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyAncientSegmentsUndefined: Self = StObject.set(x, "onlyAncientSegments", js.undefined)
    
    @scala.inline
    def setWaitForCompletion(value: Boolean): Self = StObject.set(x, "waitForCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForCompletionUndefined: Self = StObject.set(x, "waitForCompletion", js.undefined)
  }
}
