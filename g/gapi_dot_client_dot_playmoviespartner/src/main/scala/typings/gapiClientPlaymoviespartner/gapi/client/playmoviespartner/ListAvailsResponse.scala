package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAvailsResponse extends js.Object {
  /** List of Avails that match the request criteria. */
  var avails: js.UndefOr[js.Array[Avail]] = js.native
  /** See _List methods rules_ for info about this field. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** See _List methods rules_ for more information about this field. */
  var totalSize: js.UndefOr[Double] = js.native
}

object ListAvailsResponse {
  @scala.inline
  def apply(): ListAvailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailsResponse]
  }
  @scala.inline
  implicit class ListAvailsResponseOps[Self <: ListAvailsResponse] (val x: Self) extends AnyVal {
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
    def setAvailsVarargs(value: Avail*): Self = this.set("avails", js.Array(value :_*))
    @scala.inline
    def setAvails(value: js.Array[Avail]): Self = this.set("avails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvails: Self = this.set("avails", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
  
}

