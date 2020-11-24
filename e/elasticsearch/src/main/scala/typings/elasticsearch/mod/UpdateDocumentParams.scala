package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.force
import typings.elasticsearch.elasticsearchStrings.internal
import typings.std.Date
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
  implicit class UpdateDocumentParamsOps[Self <: UpdateDocumentParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceVarargs(value: String*): Self = this.set("_source", js.Array(value :_*))
    
    @scala.inline
    def set_source(value: NameList): Self = this.set("_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_source: Self = this.set("_source", js.undefined)
    
    @scala.inline
    def set_sourceExcludeVarargs(value: String*): Self = this.set("_sourceExclude", js.Array(value :_*))
    
    @scala.inline
    def set_sourceExclude(value: NameList): Self = this.set("_sourceExclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sourceExclude: Self = this.set("_sourceExclude", js.undefined)
    
    @scala.inline
    def set_sourceIncludeVarargs(value: String*): Self = this.set("_sourceInclude", js.Array(value :_*))
    
    @scala.inline
    def set_sourceInclude(value: NameList): Self = this.set("_sourceInclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sourceInclude: Self = this.set("_sourceInclude", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: NameList): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setRefresh(value: Refresh): Self = this.set("refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    
    @scala.inline
    def setRetryOnConflict(value: Double): Self = this.set("retryOnConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryOnConflict: Self = this.set("retryOnConflict", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = this.set("routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Date | Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setTtl(value: TimeSpan): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersionType(value: internal | force): Self = this.set("versionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionType: Self = this.set("versionType", js.undefined)
    
    @scala.inline
    def setWaitForActiveShards(value: String): Self = this.set("waitForActiveShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForActiveShards: Self = this.set("waitForActiveShards", js.undefined)
  }
}
