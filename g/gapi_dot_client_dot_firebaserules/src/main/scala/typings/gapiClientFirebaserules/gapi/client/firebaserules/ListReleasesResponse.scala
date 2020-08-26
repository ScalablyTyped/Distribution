package typings.gapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReleasesResponse extends js.Object {
  /**
    * The pagination token to retrieve the next page of results. If the value is
    * empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** List of `Release` instances. */
  var releases: js.UndefOr[js.Array[Release]] = js.native
}

object ListReleasesResponse {
  @scala.inline
  def apply(): ListReleasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReleasesResponse]
  }
  @scala.inline
  implicit class ListReleasesResponseOps[Self <: ListReleasesResponse] (val x: Self) extends AnyVal {
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
    def setReleasesVarargs(value: Release*): Self = this.set("releases", js.Array(value :_*))
    @scala.inline
    def setReleases(value: js.Array[Release]): Self = this.set("releases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleases: Self = this.set("releases", js.undefined)
  }
  
}

