package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDocumentParams extends GenericParams {
  
  var id: String = js.native
  
  var index: String = js.native
  
  var parent: js.UndefOr[String] = js.native
  
  var refresh: js.UndefOr[Refresh] = js.native
  
  var routing: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
  
  var `type`: String = js.native
  
  var version: js.UndefOr[Double] = js.native
  
  var versionType: js.UndefOr[VersionType] = js.native
  
  var waitForActiveShards: js.UndefOr[String] = js.native
}
object DeleteDocumentParams {
  
  @scala.inline
  def apply(id: String, index: String, `type`: String): DeleteDocumentParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentParams]
  }
  
  @scala.inline
  implicit class DeleteDocumentParamsOps[Self <: DeleteDocumentParams] (val x: Self) extends AnyVal {
    
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
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setRefresh(value: Refresh): Self = this.set("refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = this.set("routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersionType(value: VersionType): Self = this.set("versionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionType: Self = this.set("versionType", js.undefined)
    
    @scala.inline
    def setWaitForActiveShards(value: String): Self = this.set("waitForActiveShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForActiveShards: Self = this.set("waitForActiveShards", js.undefined)
  }
}
