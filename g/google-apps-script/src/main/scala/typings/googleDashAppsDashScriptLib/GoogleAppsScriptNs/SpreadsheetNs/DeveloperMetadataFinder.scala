package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataFinder extends js.Object {
  def find(): js.Array[DeveloperMetadata]
  def onIntersectingLocations(): DeveloperMetadataFinder
  def withId(id: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): DeveloperMetadataFinder
  def withKey(key: java.lang.String): DeveloperMetadataFinder
  def withLocationType(locationType: DeveloperMetadataLocationType): DeveloperMetadataFinder
  def withValue(value: java.lang.String): DeveloperMetadataFinder
  def withVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadataFinder
}

object DeveloperMetadataFinder {
  @scala.inline
  def apply(
    find: js.Function0[js.Array[DeveloperMetadata]],
    onIntersectingLocations: js.Function0[DeveloperMetadataFinder],
    withId: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, DeveloperMetadataFinder],
    withKey: js.Function1[java.lang.String, DeveloperMetadataFinder],
    withLocationType: js.Function1[DeveloperMetadataLocationType, DeveloperMetadataFinder],
    withValue: js.Function1[java.lang.String, DeveloperMetadataFinder],
    withVisibility: js.Function1[DeveloperMetadataVisibility, DeveloperMetadataFinder]
  ): DeveloperMetadataFinder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("find")(find)
    __obj.updateDynamic("onIntersectingLocations")(onIntersectingLocations)
    __obj.updateDynamic("withId")(withId)
    __obj.updateDynamic("withKey")(withKey)
    __obj.updateDynamic("withLocationType")(withLocationType)
    __obj.updateDynamic("withValue")(withValue)
    __obj.updateDynamic("withVisibility")(withVisibility)
    __obj.asInstanceOf[DeveloperMetadataFinder]
  }
}

