package typings.firebaseMessaging.apiMod

import typings.firebaseMessaging.anon.ApplicationPubKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiRequestBody extends js.Object {
  
  var web: ApplicationPubKey = js.native
}
object ApiRequestBody {
  
  @scala.inline
  def apply(web: ApplicationPubKey): ApiRequestBody = {
    val __obj = js.Dynamic.literal(web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiRequestBody]
  }
  
  @scala.inline
  implicit class ApiRequestBodyOps[Self <: ApiRequestBody] (val x: Self) extends AnyVal {
    
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
    def setWeb(value: ApplicationPubKey): Self = this.set("web", value.asInstanceOf[js.Any])
  }
}
