package typings.gapiClientWebfonts.gapi.client.webfonts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebfontList extends js.Object {
  /** The list of fonts currently served by the Google Fonts API. */
  var items: js.UndefOr[js.Array[Webfont]] = js.native
  /** This kind represents a list of webfont objects in the webfonts service. */
  var kind: js.UndefOr[String] = js.native
}

object WebfontList {
  @scala.inline
  def apply(): WebfontList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebfontList]
  }
  @scala.inline
  implicit class WebfontListOps[Self <: WebfontList] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Webfont*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Webfont]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

