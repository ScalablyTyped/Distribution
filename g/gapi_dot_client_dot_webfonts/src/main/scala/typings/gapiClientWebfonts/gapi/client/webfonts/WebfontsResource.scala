package typings.gapiClientWebfonts.gapi.client.webfonts

import typings.gapiClient.gapi.client.Request
import typings.gapiClientWebfonts.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebfontsResource extends js.Object {
  /** Retrieves the list of fonts currently served by the Google Fonts Developer API */
  def list(request: Alt): Request[WebfontList] = js.native
}

object WebfontsResource {
  @scala.inline
  def apply(list: Alt => Request[WebfontList]): WebfontsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[WebfontsResource]
  }
  @scala.inline
  implicit class WebfontsResourceOps[Self <: WebfontsResource] (val x: Self) extends AnyVal {
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
    def setList(value: Alt => Request[WebfontList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

