package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Publisher extends js.Object {
  var caeNumber: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var ipiNumber: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
}

object Publisher {
  @scala.inline
  def apply(): Publisher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Publisher]
  }
  @scala.inline
  implicit class PublisherOps[Self <: Publisher] (val x: Self) extends AnyVal {
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
    def setCaeNumber(value: String): Self = this.set("caeNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaeNumber: Self = this.set("caeNumber", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIpiNumber(value: String): Self = this.set("ipiNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpiNumber: Self = this.set("ipiNumber", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

