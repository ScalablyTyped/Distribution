package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesPutMappingParams extends GenericParams {
  
  var allowNoIndices: js.UndefOr[Boolean] = js.native
  
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  
  var includeTypeName: js.UndefOr[Boolean] = js.native
  
  var index: NameList = js.native
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
  
  var `type`: String = js.native
  
  var updateAllTypes: js.UndefOr[Boolean] = js.native
}
object IndicesPutMappingParams {
  
  @scala.inline
  def apply(index: NameList, `type`: String): IndicesPutMappingParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesPutMappingParams]
  }
  
  @scala.inline
  implicit class IndicesPutMappingParamsMutableBuilder[Self <: IndicesPutMappingParams] (val x: Self) extends AnyVal {
    
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
    def setIncludeTypeName(value: Boolean): Self = StObject.set(x, "includeTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTypeNameUndefined: Self = StObject.set(x, "includeTypeName", js.undefined)
    
    @scala.inline
    def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAllTypes(value: Boolean): Self = StObject.set(x, "updateAllTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAllTypesUndefined: Self = StObject.set(x, "updateAllTypes", js.undefined)
  }
}
