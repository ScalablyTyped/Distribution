package typings.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLogsResponse extends js.Object {
  /** A list of log names. For example, "projects/my-project/syslog" or "organizations/123/cloudresourcemanager.googleapis.com%2Factivity". */
  var logNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * If there might be more results than those appearing in this response, then nextPageToken is included. To get the next set of results, call this method
    * again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListLogsResponse {
  @scala.inline
  def apply(): ListLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogsResponse]
  }
  @scala.inline
  implicit class ListLogsResponseOps[Self <: ListLogsResponse] (val x: Self) extends AnyVal {
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
    def setLogNamesVarargs(value: String*): Self = this.set("logNames", js.Array(value :_*))
    @scala.inline
    def setLogNames(value: js.Array[String]): Self = this.set("logNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogNames: Self = this.set("logNames", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

