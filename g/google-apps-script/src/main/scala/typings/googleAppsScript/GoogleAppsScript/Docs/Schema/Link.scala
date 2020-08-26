package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Link extends js.Object {
  var bookmarkId: js.UndefOr[String] = js.native
  var headingId: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object Link {
  @scala.inline
  def apply(): Link = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Link]
  }
  @scala.inline
  implicit class LinkOps[Self <: Link] (val x: Self) extends AnyVal {
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
    def setBookmarkId(value: String): Self = this.set("bookmarkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookmarkId: Self = this.set("bookmarkId", js.undefined)
    @scala.inline
    def setHeadingId(value: String): Self = this.set("headingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadingId: Self = this.set("headingId", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

