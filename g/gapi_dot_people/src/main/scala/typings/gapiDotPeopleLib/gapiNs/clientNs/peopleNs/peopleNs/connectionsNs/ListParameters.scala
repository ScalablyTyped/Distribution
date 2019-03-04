package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs.peopleNs.connectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListParameters extends js.Object {
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  // Query parameters
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  var personFields: java.lang.String
  var resourceName: java.lang.String
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
  var syncToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListParameters {
  @scala.inline
  def apply(
    personFields: java.lang.String,
    resourceName: java.lang.String,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    sortOrder: SortOrder = null,
    syncToken: java.lang.String = null
  ): ListParameters = {
    val __obj = js.Dynamic.literal(personFields = personFields, resourceName = resourceName)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken)
    __obj.asInstanceOf[ListParameters]
  }
}

