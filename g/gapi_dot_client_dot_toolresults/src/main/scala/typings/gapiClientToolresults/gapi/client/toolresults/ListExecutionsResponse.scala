package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListExecutionsResponse extends js.Object {
  /**
    * Executions.
    *
    * Always set.
    */
  var executions: js.UndefOr[js.Array[Execution]] = js.native
  /**
    * A continuation token to resume the query at the next item.
    *
    * Will only be set if there are more Executions to fetch.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListExecutionsResponse {
  @scala.inline
  def apply(): ListExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExecutionsResponse]
  }
  @scala.inline
  implicit class ListExecutionsResponseOps[Self <: ListExecutionsResponse] (val x: Self) extends AnyVal {
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
    def setExecutionsVarargs(value: Execution*): Self = this.set("executions", js.Array(value :_*))
    @scala.inline
    def setExecutions(value: js.Array[Execution]): Self = this.set("executions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutions: Self = this.set("executions", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

