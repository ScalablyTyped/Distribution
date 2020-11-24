package typings.geetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var api_server: js.UndefOr[String] = js.native
  
  var geetest_id: String = js.native
  
  var geetest_key: String = js.native
  
  var protocol: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(geetest_id: String, geetest_key: String): Options = {
    val __obj = js.Dynamic.literal(geetest_id = geetest_id.asInstanceOf[js.Any], geetest_key = geetest_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setGeetest_id(value: String): Self = this.set("geetest_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeetest_key(value: String): Self = this.set("geetest_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_server(value: String): Self = this.set("api_server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApi_server: Self = this.set("api_server", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
}
