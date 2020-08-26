package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConnectionsResponse extends js.Object {
  var connections: js.UndefOr[js.Array[Person]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var nextSyncToken: js.UndefOr[String] = js.native
  var totalItems: js.UndefOr[Double] = js.native
  var totalPeople: js.UndefOr[Double] = js.native
}

object ListConnectionsResponse {
  @scala.inline
  def apply(): ListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionsResponse]
  }
  @scala.inline
  implicit class ListConnectionsResponseOps[Self <: ListConnectionsResponse] (val x: Self) extends AnyVal {
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
    def setConnectionsVarargs(value: Person*): Self = this.set("connections", js.Array(value :_*))
    @scala.inline
    def setConnections(value: js.Array[Person]): Self = this.set("connections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setNextSyncToken(value: String): Self = this.set("nextSyncToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextSyncToken: Self = this.set("nextSyncToken", js.undefined)
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
    @scala.inline
    def setTotalPeople(value: Double): Self = this.set("totalPeople", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalPeople: Self = this.set("totalPeople", js.undefined)
  }
  
}

