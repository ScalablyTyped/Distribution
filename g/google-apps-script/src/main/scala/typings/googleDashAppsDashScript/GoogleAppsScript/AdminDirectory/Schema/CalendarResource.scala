package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarResource extends js.Object {
  var buildingId: js.UndefOr[String] = js.undefined
  var capacity: js.UndefOr[Double] = js.undefined
  var etags: js.UndefOr[String] = js.undefined
  var featureInstances: js.UndefOr[js.Object] = js.undefined
  var floorName: js.UndefOr[String] = js.undefined
  var floorSection: js.UndefOr[String] = js.undefined
  var generatedResourceName: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var resourceCategory: js.UndefOr[String] = js.undefined
  var resourceDescription: js.UndefOr[String] = js.undefined
  var resourceEmail: js.UndefOr[String] = js.undefined
  var resourceId: js.UndefOr[String] = js.undefined
  var resourceName: js.UndefOr[String] = js.undefined
  var resourceType: js.UndefOr[String] = js.undefined
  var userVisibleDescription: js.UndefOr[String] = js.undefined
}

object CalendarResource {
  @scala.inline
  def apply(
    buildingId: String = null,
    capacity: Int | Double = null,
    etags: String = null,
    featureInstances: js.Object = null,
    floorName: String = null,
    floorSection: String = null,
    generatedResourceName: String = null,
    kind: String = null,
    resourceCategory: String = null,
    resourceDescription: String = null,
    resourceEmail: String = null,
    resourceId: String = null,
    resourceName: String = null,
    resourceType: String = null,
    userVisibleDescription: String = null
  ): CalendarResource = {
    val __obj = js.Dynamic.literal()
    if (buildingId != null) __obj.updateDynamic("buildingId")(buildingId)
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (etags != null) __obj.updateDynamic("etags")(etags)
    if (featureInstances != null) __obj.updateDynamic("featureInstances")(featureInstances)
    if (floorName != null) __obj.updateDynamic("floorName")(floorName)
    if (floorSection != null) __obj.updateDynamic("floorSection")(floorSection)
    if (generatedResourceName != null) __obj.updateDynamic("generatedResourceName")(generatedResourceName)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (resourceCategory != null) __obj.updateDynamic("resourceCategory")(resourceCategory)
    if (resourceDescription != null) __obj.updateDynamic("resourceDescription")(resourceDescription)
    if (resourceEmail != null) __obj.updateDynamic("resourceEmail")(resourceEmail)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (userVisibleDescription != null) __obj.updateDynamic("userVisibleDescription")(userVisibleDescription)
    __obj.asInstanceOf[CalendarResource]
  }
}

