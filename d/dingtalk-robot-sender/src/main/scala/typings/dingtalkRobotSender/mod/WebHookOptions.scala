package typings.dingtalkRobotSender.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebHookOptions extends js.Object {
  
  var httpclient: js.UndefOr[js.Any] = js.native
  
  var webhook: String = js.native
}
object WebHookOptions {
  
  @scala.inline
  def apply(webhook: String): WebHookOptions = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebHookOptions]
  }
  
  @scala.inline
  implicit class WebHookOptionsOps[Self <: WebHookOptions] (val x: Self) extends AnyVal {
    
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
    def setWebhook(value: String): Self = this.set("webhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpclient(value: js.Any): Self = this.set("httpclient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpclient: Self = this.set("httpclient", js.undefined)
  }
}
