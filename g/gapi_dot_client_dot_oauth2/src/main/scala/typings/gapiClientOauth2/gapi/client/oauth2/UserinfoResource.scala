package typings.gapiClientOauth2.gapi.client.oauth2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientOauth2.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserinfoResource extends js.Object {
  var v2: V2Resource = js.native
  def get(request: Alt): Request[Userinfoplus] = js.native
}

object UserinfoResource {
  @scala.inline
  def apply(get: Alt => Request[Userinfoplus], v2: V2Resource): UserinfoResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), v2 = v2.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserinfoResource]
  }
  @scala.inline
  implicit class UserinfoResourceOps[Self <: UserinfoResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Alt => Request[Userinfoplus]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setV2(value: V2Resource): Self = this.set("v2", value.asInstanceOf[js.Any])
  }
  
}

