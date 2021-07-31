package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesGetSettingsParams
  extends StObject
     with GenericParams {
  
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var flatSettings: js.UndefOr[Boolean] = js.undefined
  
  var human: js.UndefOr[Boolean] = js.undefined
  
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  
  var includeDefaults: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[NameList] = js.undefined
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[NameList] = js.undefined
}
object IndicesGetSettingsParams {
  
  @scala.inline
  def apply(): IndicesGetSettingsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesGetSettingsParams]
  }
  
  @scala.inline
  implicit class IndicesGetSettingsParamsMutableBuilder[Self <: IndicesGetSettingsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNoIndices(value: Boolean): Self = StObject.set(x, "allowNoIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNoIndicesUndefined: Self = StObject.set(x, "allowNoIndices", js.undefined)
    
    @scala.inline
    def setExpandWildcards(value: ExpandWildcards): Self = StObject.set(x, "expandWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandWildcardsUndefined: Self = StObject.set(x, "expandWildcards", js.undefined)
    
    @scala.inline
    def setFlatSettings(value: Boolean): Self = StObject.set(x, "flatSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatSettingsUndefined: Self = StObject.set(x, "flatSettings", js.undefined)
    
    @scala.inline
    def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
    
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = StObject.set(x, "ignoreUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnavailableUndefined: Self = StObject.set(x, "ignoreUnavailable", js.undefined)
    
    @scala.inline
    def setIncludeDefaults(value: Boolean): Self = StObject.set(x, "includeDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDefaultsUndefined: Self = StObject.set(x, "includeDefaults", js.undefined)
    
    @scala.inline
    def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setName(value: NameList): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
