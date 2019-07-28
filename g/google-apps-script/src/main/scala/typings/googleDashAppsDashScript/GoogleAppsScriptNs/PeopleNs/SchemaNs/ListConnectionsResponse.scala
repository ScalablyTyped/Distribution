package typings.googleDashAppsDashScript.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConnectionsResponse extends js.Object {
  var connections: js.UndefOr[js.Array[Person]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var nextSyncToken: js.UndefOr[String] = js.undefined
  var totalItems: js.UndefOr[Double] = js.undefined
  var totalPeople: js.UndefOr[Double] = js.undefined
}

object ListConnectionsResponse {
  @scala.inline
  def apply(
    connections: js.Array[Person] = null,
    nextPageToken: String = null,
    nextSyncToken: String = null,
    totalItems: Int | Double = null,
    totalPeople: Int | Double = null
  ): ListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    if (connections != null) __obj.updateDynamic("connections")(connections)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    if (totalPeople != null) __obj.updateDynamic("totalPeople")(totalPeople.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConnectionsResponse]
  }
}

