package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEnvironmentsResponse extends js.Object {
  var environment: js.UndefOr[js.Array[Environment]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListEnvironmentsResponse {
  @scala.inline
  def apply(): ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsResponse]
  }
  @scala.inline
  implicit class ListEnvironmentsResponseOps[Self <: ListEnvironmentsResponse] (val x: Self) extends AnyVal {
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
    def setEnvironmentVarargs(value: Environment*): Self = this.set("environment", js.Array(value :_*))
    @scala.inline
    def setEnvironment(value: js.Array[Environment]): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

