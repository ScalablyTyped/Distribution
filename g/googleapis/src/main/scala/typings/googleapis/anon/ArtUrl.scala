package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtUrl extends js.Object {
  var artUrl: js.UndefOr[String] = js.native
  var gservicesKey: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[Author]] = js.native
}

object ArtUrl {
  @scala.inline
  def apply(): ArtUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtUrl]
  }
  @scala.inline
  implicit class ArtUrlOps[Self <: ArtUrl] (val x: Self) extends AnyVal {
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
    def setArtUrl(value: String): Self = this.set("artUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtUrl: Self = this.set("artUrl", js.undefined)
    @scala.inline
    def setGservicesKey(value: String): Self = this.set("gservicesKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGservicesKey: Self = this.set("gservicesKey", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Author*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Author]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

