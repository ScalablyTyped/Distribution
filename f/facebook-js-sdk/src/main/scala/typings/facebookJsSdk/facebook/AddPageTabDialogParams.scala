package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.pagetab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddPageTabDialogParams extends DialogParams {
  var method: pagetab = js.native
  @JSName("redirect_uri")
  var redirect_uri_AddPageTabDialogParams: String = js.native
}

object AddPageTabDialogParams {
  @scala.inline
  def apply(method: pagetab, redirect_uri: String): AddPageTabDialogParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPageTabDialogParams]
  }
  @scala.inline
  implicit class AddPageTabDialogParamsOps[Self <: AddPageTabDialogParams] (val x: Self) extends AnyVal {
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
    def setMethod(value: pagetab): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirect_uri(value: String): Self = this.set("redirect_uri", value.asInstanceOf[js.Any])
  }
  
}

