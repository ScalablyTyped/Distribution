package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVersionsResponse extends js.Object {
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The versions belonging to the requested service. */
  var versions: js.UndefOr[js.Array[Version]] = js.native
}

object ListVersionsResponse {
  @scala.inline
  def apply(): ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVersionsResponse]
  }
  @scala.inline
  implicit class ListVersionsResponseOps[Self <: ListVersionsResponse] (val x: Self) extends AnyVal {
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
    def setVersionsVarargs(value: Version*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: js.Array[Version]): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
  
}

