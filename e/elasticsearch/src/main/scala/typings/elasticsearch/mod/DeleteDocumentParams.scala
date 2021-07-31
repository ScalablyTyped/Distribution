package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDocumentParams
  extends StObject
     with GenericParams {
  
  var id: String
  
  var index: String
  
  var parent: js.UndefOr[String] = js.undefined
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var routing: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  
  var `type`: String
  
  var version: js.UndefOr[Double] = js.undefined
  
  var versionType: js.UndefOr[VersionType] = js.undefined
  
  var waitForActiveShards: js.UndefOr[String] = js.undefined
}
object DeleteDocumentParams {
  
  @scala.inline
  def apply(id: String, index: String, `type`: String): DeleteDocumentParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentParams]
  }
  
  @scala.inline
  implicit class DeleteDocumentParamsMutableBuilder[Self <: DeleteDocumentParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
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
    def setWaitForActiveShards(value: String): Self = StObject.set(x, "waitForActiveShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForActiveShardsUndefined: Self = StObject.set(x, "waitForActiveShards", js.undefined)
  }
}
