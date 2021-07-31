package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesPutSettingsParams
  extends StObject
     with GenericParams {
  
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var flatSettings: js.UndefOr[Boolean] = js.undefined
  
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: NameList
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var preserveExisting: js.UndefOr[Boolean] = js.undefined
}
object IndicesPutSettingsParams {
  
  @scala.inline
  def apply(index: NameList): IndicesPutSettingsParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesPutSettingsParams]
  }
  
  @scala.inline
  implicit class IndicesPutSettingsParamsMutableBuilder[Self <: IndicesPutSettingsParams] (val x: Self) extends AnyVal {
    
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
    def setIgnoreUnavailable(value: Boolean): Self = StObject.set(x, "ignoreUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnavailableUndefined: Self = StObject.set(x, "ignoreUnavailable", js.undefined)
    
    @scala.inline
    def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    @scala.inline
    def setPreserveExisting(value: Boolean): Self = StObject.set(x, "preserveExisting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveExistingUndefined: Self = StObject.set(x, "preserveExisting", js.undefined)
  }
}
