package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestParams
  extends StObject
     with GenericParams {
  
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: NameList
  
  var preference: js.UndefOr[String] = js.undefined
  
  var routing: js.UndefOr[String] = js.undefined
}
object SuggestParams {
  
  @scala.inline
  def apply(index: NameList): SuggestParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestParams]
  }
  
  @scala.inline
  implicit class SuggestParamsMutableBuilder[Self <: SuggestParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNoIndices(value: Boolean): Self = StObject.set(x, "allowNoIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNoIndicesUndefined: Self = StObject.set(x, "allowNoIndices", js.undefined)
    
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
    def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
  }
}
