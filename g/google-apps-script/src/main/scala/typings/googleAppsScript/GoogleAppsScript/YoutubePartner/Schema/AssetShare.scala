package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetShare extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var shareId: js.UndefOr[String] = js.native
  var viewId: js.UndefOr[String] = js.native
}

object AssetShare {
  @scala.inline
  def apply(): AssetShare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetShare]
  }
  @scala.inline
  implicit class AssetShareOps[Self <: AssetShare] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setShareId(value: String): Self = this.set("shareId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareId: Self = this.set("shareId", js.undefined)
    @scala.inline
    def setViewId(value: String): Self = this.set("viewId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewId: Self = this.set("viewId", js.undefined)
  }
  
}

