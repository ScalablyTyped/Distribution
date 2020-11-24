package typings.enhancedResolve.commonTypesMod

import typings.enhancedResolve.descriptionFileUtilsMod.DescriptionFileData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverRequest extends js.Object {
  
  var __innerRequest: js.UndefOr[String] = js.native
  
  var __innerRequest_relativePath: js.UndefOr[String] = js.native
  
  var __innerRequest_request: js.UndefOr[String] = js.native
  
  var context: ResolveContext = js.native
  
  var descriptionFileData: js.UndefOr[DescriptionFileData] = js.native
  
  var descriptionFilePath: js.UndefOr[String] = js.native
  
  var descriptionFileRoot: js.UndefOr[String] = js.native
  
  var directory: js.UndefOr[Boolean] = js.native
  
  var module: js.UndefOr[Boolean] = js.native
  
  var path: String = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var relativePath: js.UndefOr[String] = js.native
  
  var request: String = js.native
}
object ResolverRequest {
  
  @scala.inline
  def apply(context: ResolveContext, path: String, request: String): ResolverRequest = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRequest]
  }
  
  @scala.inline
  implicit class ResolverRequestOps[Self <: ResolverRequest] (val x: Self) extends AnyVal {
    
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
    def setContext(value: ResolveContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: String): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__innerRequest(value: String): Self = this.set("__innerRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__innerRequest: Self = this.set("__innerRequest", js.undefined)
    
    @scala.inline
    def set__innerRequest_relativePath(value: String): Self = this.set("__innerRequest_relativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__innerRequest_relativePath: Self = this.set("__innerRequest_relativePath", js.undefined)
    
    @scala.inline
    def set__innerRequest_request(value: String): Self = this.set("__innerRequest_request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__innerRequest_request: Self = this.set("__innerRequest_request", js.undefined)
    
    @scala.inline
    def setDescriptionFileData(value: DescriptionFileData): Self = this.set("descriptionFileData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptionFileData: Self = this.set("descriptionFileData", js.undefined)
    
    @scala.inline
    def setDescriptionFilePath(value: String): Self = this.set("descriptionFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptionFilePath: Self = this.set("descriptionFilePath", js.undefined)
    
    @scala.inline
    def setDescriptionFileRoot(value: String): Self = this.set("descriptionFileRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptionFileRoot: Self = this.set("descriptionFileRoot", js.undefined)
    
    @scala.inline
    def setDirectory(value: Boolean): Self = this.set("directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    
    @scala.inline
    def setModule(value: Boolean): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRelativePath(value: String): Self = this.set("relativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativePath: Self = this.set("relativePath", js.undefined)
  }
}
