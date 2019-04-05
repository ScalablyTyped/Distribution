package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarResource extends js.Object {
  var buildingId: js.UndefOr[java.lang.String] = js.undefined
  var capacity: js.UndefOr[scala.Double] = js.undefined
  var etags: js.UndefOr[java.lang.String] = js.undefined
  var featureInstances: js.UndefOr[js.Object] = js.undefined
  var floorName: js.UndefOr[java.lang.String] = js.undefined
  var floorSection: js.UndefOr[java.lang.String] = js.undefined
  var generatedResourceName: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var resourceCategory: js.UndefOr[java.lang.String] = js.undefined
  var resourceDescription: js.UndefOr[java.lang.String] = js.undefined
  var resourceEmail: js.UndefOr[java.lang.String] = js.undefined
  var resourceId: js.UndefOr[java.lang.String] = js.undefined
  var resourceName: js.UndefOr[java.lang.String] = js.undefined
  var resourceType: js.UndefOr[java.lang.String] = js.undefined
  var userVisibleDescription: js.UndefOr[java.lang.String] = js.undefined
}

object CalendarResource {
  @scala.inline
  def apply(
    buildingId: java.lang.String = null,
    capacity: scala.Int | scala.Double = null,
    etags: java.lang.String = null,
    featureInstances: js.Object = null,
    floorName: java.lang.String = null,
    floorSection: java.lang.String = null,
    generatedResourceName: java.lang.String = null,
    kind: java.lang.String = null,
    resourceCategory: java.lang.String = null,
    resourceDescription: java.lang.String = null,
    resourceEmail: java.lang.String = null,
    resourceId: java.lang.String = null,
    resourceName: java.lang.String = null,
    resourceType: java.lang.String = null,
    userVisibleDescription: java.lang.String = null
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

