package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLiensResponse extends js.Object {
  /** A list of Liens. */
  var liens: js.UndefOr[js.Array[Lien]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListLiensResponse {
  @scala.inline
  def apply(): ListLiensResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLiensResponse]
  }
  @scala.inline
  implicit class ListLiensResponseOps[Self <: ListLiensResponse] (val x: Self) extends AnyVal {
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
    def setLiensVarargs(value: Lien*): Self = this.set("liens", js.Array(value :_*))
    @scala.inline
    def setLiens(value: js.Array[Lien]): Self = this.set("liens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiens: Self = this.set("liens", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

