package typings.dogapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Apihost extends js.Object {
  
  var api_host: js.UndefOr[String] = js.native
  
  var api_key: String = js.native
  
  var app_key: String = js.native
}
object Apihost {
  
  @scala.inline
  def apply(api_key: String, app_key: String): Apihost = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], app_key = app_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apihost]
  }
  
  @scala.inline
  implicit class ApihostOps[Self <: Apihost] (val x: Self) extends AnyVal {
    
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
    def setApi_key(value: String): Self = this.set("api_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_key(value: String): Self = this.set("app_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_host(value: String): Self = this.set("api_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApi_host: Self = this.set("api_host", js.undefined)
  }
}
