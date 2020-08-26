package typings.gaxios.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaxiosXMLHttpRequest extends js.Object {
  var responseURL: String = js.native
}

object GaxiosXMLHttpRequest {
  @scala.inline
  def apply(responseURL: String): GaxiosXMLHttpRequest = {
    val __obj = js.Dynamic.literal(responseURL = responseURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaxiosXMLHttpRequest]
  }
  @scala.inline
  implicit class GaxiosXMLHttpRequestOps[Self <: GaxiosXMLHttpRequest] (val x: Self) extends AnyVal {
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
    def setResponseURL(value: String): Self = this.set("responseURL", value.asInstanceOf[js.Any])
  }
  
}

