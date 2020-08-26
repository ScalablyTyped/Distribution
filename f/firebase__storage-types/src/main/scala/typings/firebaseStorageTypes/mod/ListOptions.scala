package typings.firebaseStorageTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOptions extends js.Object {
  var maxResults: js.UndefOr[Double | Null] = js.native
  var pageToken: js.UndefOr[String | Null] = js.native
}

object ListOptions {
  @scala.inline
  def apply(): ListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOptions]
  }
  @scala.inline
  implicit class ListOptionsOps[Self <: ListOptions] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setMaxResultsNull: Self = this.set("maxResults", null)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPageTokenNull: Self = this.set("pageToken", null)
  }
  
}

