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
    val __obj = js.Dynamic.literal(find = find, onIntersectingLocations = onIntersectingLocations, withId = withId, withKey = withKey, withLocationType = withLocationType, withValue = withValue, withVisibility = withVisibility)
  
    __obj.asInstanceOf[DeveloperMetadataFinder]
  }
}

