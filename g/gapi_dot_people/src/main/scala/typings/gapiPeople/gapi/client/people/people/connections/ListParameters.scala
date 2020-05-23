package typings.gapiPeople.gapi.client.people.people.connections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListParameters extends js.Object {
  var pageSize: js.UndefOr[Double] = js.undefined
  // Query parameters
  var pageToken: js.UndefOr[String] = js.undefined
  var personFields: String
  var resourceName: String
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
  var syncToken: js.UndefOr[String] = js.undefined
}

object ListParameters {
  @scala.inline
  def apply(
    personFields: String,
    resourceName: String,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    sortOrder: SortOrder = null,
    syncToken: String = null
  ): ListParameters = {
    val __obj = js.Dynamic.literal(personFields = personFields.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListParameters]
  }
}

