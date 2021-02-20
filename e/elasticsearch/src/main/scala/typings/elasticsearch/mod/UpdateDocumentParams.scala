package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.force
import typings.elasticsearch.elasticsearchStrings.internal
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDocumentParams extends GenericParams {
  
  var _source: js.UndefOr[NameList] = js.native
  
  var _sourceExclude: js.UndefOr[NameList] = js.native
  
  var _sourceInclude: js.UndefOr[NameList] = js.native
  
  var fields: js.UndefOr[NameList] = js.native
  
  var id: String = js.native
  
  var index: String = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var parent: js.UndefOr[String] = js.native
  
  var refresh: js.UndefOr[Refresh] = js.native
  
  var retryOnConflict: js.UndefOr[Double] = js.native
  
  var routing: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
  
  var timestamp: js.UndefOr[Date | Double] = js.native
  
  var ttl: js.UndefOr[TimeSpan] = js.native
  
  var `type`: String = js.native
  
  var version: js.UndefOr[Double] = js.native
  
  var versionType: js.UndefOr[internal | force] = js.native
  
  var waitForActiveShards: js.UndefOr[String] = js.native
}
object UpdateDocumentParams {
  
  @scala.inline
  def apply(id: String, index: String, `type`: String): UpdateDocumentParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentParams]
  }
  
  @scala.inline
  implicit class UpdateDocumentParamsMutableBuilder[Self <: UpdateDocumentParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: NameList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setRetryOnConflict(value: Double): Self = StObject.set(x, "retryOnConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryOnConflictUndefined: Self = StObject.set(x, "retryOnConflict", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Date | Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setTtl(value: TimeSpan): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionType(value: internal | force): Self = StObject.set(x, "versionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionTypeUndefined: Self = StObject.set(x, "versionType", js.undefined)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWaitForActiveShards(value: String): Self = StObject.set(x, "waitForActiveShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForActiveShardsUndefined: Self = StObject.set(x, "waitForActiveShards", js.undefined)
    
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
    def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    @scala.inline
    def set_sourceVarargs(value: String*): Self = StObject.set(x, "_source", js.Array(value :_*))
  }
}
