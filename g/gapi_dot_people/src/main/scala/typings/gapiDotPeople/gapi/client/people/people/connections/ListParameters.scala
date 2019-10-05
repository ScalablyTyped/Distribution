package typings.gapiDotPeople.gapi.client.people.people.connections

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
    pageSize: Int | Double = null,
    pageToken: String = null,
    sortOrder: SortOrder = null,
    syncToken: String = null
  ): ListParameters = {
    val __obj = js.Dynamic.literal(personFields = personFields, resourceName = resourceName)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken)
    __obj.asInstanceOf[ListParameters]
  }
}

