package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageInfo extends js.Object {
  /** The number of results included in the API response. */
  var resultsPerPage: js.UndefOr[Double] = js.native
  /** The total number of results in the result set. */
  var totalResults: js.UndefOr[Double] = js.native
}

object PageInfo {
  @scala.inline
  def apply(): PageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageInfo]
  }
  @scala.inline
  implicit class PageInfoOps[Self <: PageInfo] (val x: Self) extends AnyVal {
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
    def setResultsPerPage(value: Double): Self = this.set("resultsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultsPerPage: Self = this.set("resultsPerPage", js.undefined)
    @scala.inline
    def setTotalResults(value: Double): Self = this.set("totalResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalResults: Self = this.set("totalResults", js.undefined)
  }
  
}

