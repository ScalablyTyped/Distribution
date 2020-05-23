package typings.gapiClientFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskList extends js.Object {
  /** List of all requested tasks. */
  var items: js.UndefOr[js.Array[Task]] = js.undefined
  /** Type of the resource. This is always "fusiontables#taskList". */
  var kind: js.UndefOr[String] = js.undefined
  /** Token used to access the next page of this result. No token is displayed if there are no more pages left. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Total number of tasks for the table. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object TaskList {
  @scala.inline
  def apply(
    items: js.Array[Task] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: js.UndefOr[Double] = js.undefined
  ): TaskList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskList]
  }
}

