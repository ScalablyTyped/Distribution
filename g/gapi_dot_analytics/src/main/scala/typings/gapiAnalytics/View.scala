package typings.gapiAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var webPropertyId: js.UndefOr[String] = js.native
  var webViewId: js.UndefOr[String] = js.native
}

object View {
  @scala.inline
  def apply(): View = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[View]
  }
  @scala.inline
  implicit class ViewOps[Self <: View] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
    @scala.inline
    def setWebViewId(value: String): Self = this.set("webViewId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebViewId: Self = this.set("webViewId", js.undefined)
  }
  
}

