package typings.googleapisCommon.schemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleapisCommon.anon.Protocols
import typings.googleapisCommon.anon.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaMethod extends js.Object {
  
  var description: String = js.native
  
  var fragment: String = js.native
  
  var httpMethod: HttpMethod = js.native
  
  var id: String = js.native
  
  var mediaUpload: Protocols = js.native
  
  var parameterOrder: js.UndefOr[js.Array[String]] = js.native
  
  var parameters: js.UndefOr[StringDictionary[SchemaParameter]] = js.native
  
  var path: String = js.native
  
  var request: Ref = js.native
  
  var response: Ref = js.native
  
  var sampleUrl: String = js.native
  
  var scopes: js.Array[String] = js.native
}
object SchemaMethod {
  
  @scala.inline
  def apply(
    description: String,
    fragment: String,
    httpMethod: HttpMethod,
    id: String,
    mediaUpload: Protocols,
    path: String,
    request: Ref,
    response: Ref,
    sampleUrl: String,
    scopes: js.Array[String]
  ): SchemaMethod = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mediaUpload = mediaUpload.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], sampleUrl = sampleUrl.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMethod]
  }
  
  @scala.inline
  implicit class SchemaMethodOps[Self <: SchemaMethod] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpMethod(value: HttpMethod): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUpload(value: Protocols): Self = this.set("mediaUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Ref): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Ref): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleUrl(value: String): Self = this.set("sampleUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterOrderVarargs(value: String*): Self = this.set("parameterOrder", js.Array(value :_*))
    
    @scala.inline
    def setParameterOrder(value: js.Array[String]): Self = this.set("parameterOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterOrder: Self = this.set("parameterOrder", js.undefined)
    
    @scala.inline
    def setParameters(value: StringDictionary[SchemaParameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
