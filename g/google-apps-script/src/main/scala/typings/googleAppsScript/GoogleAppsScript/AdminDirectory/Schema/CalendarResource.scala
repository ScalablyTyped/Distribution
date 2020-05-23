package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

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
    capacity: js.UndefOr[Double] = js.undefined,
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
    if (buildingId != null) __obj.updateDynamic("buildingId")(buildingId.asInstanceOf[js.Any])
    if (!js.isUndefined(capacity)) __obj.updateDynamic("capacity")(capacity.get.asInstanceOf[js.Any])
    if (etags != null) __obj.updateDynamic("etags")(etags.asInstanceOf[js.Any])
    if (featureInstances != null) __obj.updateDynamic("featureInstances")(featureInstances.asInstanceOf[js.Any])
    if (floorName != null) __obj.updateDynamic("floorName")(floorName.asInstanceOf[js.Any])
    if (floorSection != null) __obj.updateDynamic("floorSection")(floorSection.asInstanceOf[js.Any])
    if (generatedResourceName != null) __obj.updateDynamic("generatedResourceName")(generatedResourceName.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resourceCategory != null) __obj.updateDynamic("resourceCategory")(resourceCategory.asInstanceOf[js.Any])
    if (resourceDescription != null) __obj.updateDynamic("resourceDescription")(resourceDescription.asInstanceOf[js.Any])
    if (resourceEmail != null) __obj.updateDynamic("resourceEmail")(resourceEmail.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (userVisibleDescription != null) __obj.updateDynamic("userVisibleDescription")(userVisibleDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarResource]
  }
}

