package typings.firebase.mod.firebase.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FcmOptions extends js.Object {
  
  /**
    * Label associated with the message's analytics data. See
    * {@link https://firebase.google.com/docs/cloud-messaging/understand-delivery#adding-analytics-labels-to-messages
    * Adding analytics labels}.
    */
  var analyticsLabel: js.UndefOr[String] = js.native
  
  /**
    * The link to open when the user clicks on the notification. For all URL values, HTTPS is
    * required. For example, by setting this value to your app's URL, a notification click event
    * will put your app in focus for the user.
    */
  var link: js.UndefOr[String] = js.native
}
object FcmOptions {
  
  @scala.inline
  def apply(): FcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FcmOptions]
  }
  
  @scala.inline
  implicit class FcmOptionsOps[Self <: FcmOptions] (val x: Self) extends AnyVal {
    
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
    def setAnalyticsLabel(value: String): Self = this.set("analyticsLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyticsLabel: Self = this.set("analyticsLabel", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
  }
}
