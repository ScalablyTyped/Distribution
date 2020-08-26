package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContainerVersionsResponse extends js.Object {
  /** All container version headers of a GTM Container. */
  var containerVersionHeader: js.UndefOr[js.Array[ContainerVersionHeader]] = js.native
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListContainerVersionsResponse {
  @scala.inline
  def apply(): ListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContainerVersionsResponse]
  }
  @scala.inline
  implicit class ListContainerVersionsResponseOps[Self <: ListContainerVersionsResponse] (val x: Self) extends AnyVal {
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
    def setContainerVersionHeaderVarargs(value: ContainerVersionHeader*): Self = this.set("containerVersionHeader", js.Array(value :_*))
    @scala.inline
    def setContainerVersionHeader(value: js.Array[ContainerVersionHeader]): Self = this.set("containerVersionHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerVersionHeader: Self = this.set("containerVersionHeader", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

