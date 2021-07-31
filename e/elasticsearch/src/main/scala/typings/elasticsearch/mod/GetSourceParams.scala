package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSourceParams
  extends StObject
     with GenericParams {
  
  var _source: NameList
  
  var _sourceExclude: js.UndefOr[NameList] = js.undefined
  
  var _sourceInclude: js.UndefOr[NameList] = js.undefined
  
  var id: String
  
  var index: String
  
  var preference: js.UndefOr[String] = js.undefined
  
  var realtime: js.UndefOr[Boolean] = js.undefined
  
  var refresh: js.UndefOr[Boolean] = js.undefined
  
  var routing: js.UndefOr[String] = js.undefined
  
  var `type`: String
  
  var version: js.UndefOr[Double] = js.undefined
  
  var versionType: js.UndefOr[VersionType] = js.undefined
}
object GetSourceParams {
  
  @scala.inline
  def apply(_source: NameList, id: String, index: String, `type`: String): GetSourceParams = {
    val __obj = js.Dynamic.literal(_source = _source.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSourceParams]
  }
  
  @scala.inline
  implicit class GetSourceParamsMutableBuilder[Self <: GetSourceParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    @scala.inline
    def setRealtime(value: Boolean): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeUndefined: Self = StObject.set(x, "realtime", js.undefined)
    
    @scala.inline
    def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionType(value: VersionType): Self = StObject.set(x, "versionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionTypeUndefined: Self = StObject.set(x, "versionType", js.undefined)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def set_source(value: NameList): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceExclude(value: NameList): Self = StObject.set(x, "_sourceExclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceExcludeUndefined: Self = StObject.set(x, "_sourceExclude", js.undefined)
    
    @scala.inline
    def set_sourceExcludeVarargs(value: String*): Self = StObject.set(x, "_sourceExclude", js.Array(value :_*))
    
    @scala.inline
    def set_sourceInclude(value: NameList): Self = StObject.set(x, "_sourceInclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceIncludeUndefined: Self = StObject.set(x, "_sourceInclude", js.undefined)
    
    @scala.inline
    def set_sourceIncludeVarargs(value: String*): Self = StObject.set(x, "_sourceInclude", js.Array(value :_*))
    
    @scala.inline
    def set_sourceVarargs(value: String*): Self = StObject.set(x, "_source", js.Array(value :_*))
  }
}
