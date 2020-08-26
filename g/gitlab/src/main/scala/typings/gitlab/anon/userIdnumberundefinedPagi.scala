package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  userId :number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.PaginatedRequestOptions */
@js.native
trait userIdnumberundefinedPagi
  extends /* key */ StringDictionary[js.Any] {
  var maxPages: js.UndefOr[Double] = js.native
  var page: js.UndefOr[Double] = js.native
  var perPage: js.UndefOr[Double] = js.native
  var showPagination: js.UndefOr[Boolean] = js.native
  var sudo: js.UndefOr[String | Double] = js.native
  var userId: js.UndefOr[Double] = js.native
}

object userIdnumberundefinedPagi {
  @scala.inline
  def apply(): userIdnumberundefinedPagi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[userIdnumberundefinedPagi]
  }
  @scala.inline
  implicit class userIdnumberundefinedPagiOps[Self <: userIdnumberundefinedPagi] (val x: Self) extends AnyVal {
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
    def setMaxPages(value: Double): Self = this.set("maxPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPages: Self = this.set("maxPages", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPerPage(value: Double): Self = this.set("perPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerPage: Self = this.set("perPage", js.undefined)
    @scala.inline
    def setShowPagination(value: Boolean): Self = this.set("showPagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPagination: Self = this.set("showPagination", js.undefined)
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
    @scala.inline
    def setUserId(value: Double): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

