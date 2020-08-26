package typings.gapiClientSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenPagination extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.native
  var previousPageToken: js.UndefOr[String] = js.native
}

object TokenPagination {
  @scala.inline
  def apply(): TokenPagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenPagination]
  }
  @scala.inline
  implicit class TokenPaginationOps[Self <: TokenPagination] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setPreviousPageToken(value: String): Self = this.set("previousPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousPageToken: Self = this.set("previousPageToken", js.undefined)
  }
  
}

