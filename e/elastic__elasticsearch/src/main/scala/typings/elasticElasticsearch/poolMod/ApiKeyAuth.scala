package typings.elasticElasticsearch.poolMod

import typings.elasticElasticsearch.anon.Apikey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiKeyAuth extends js.Object {
  
  var apiKey: String | Apikey = js.native
}
object ApiKeyAuth {
  
  @scala.inline
  def apply(apiKey: String | Apikey): ApiKeyAuth = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyAuth]
  }
  
  @scala.inline
  implicit class ApiKeyAuthOps[Self <: ApiKeyAuth] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String | Apikey): Self = this.set("apiKey", value.asInstanceOf[js.Any])
  }
}
