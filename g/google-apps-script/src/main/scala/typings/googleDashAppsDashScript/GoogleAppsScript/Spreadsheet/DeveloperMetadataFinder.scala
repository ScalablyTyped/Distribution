package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataFinder extends js.Object {
  def find(): js.Array[DeveloperMetadata]
  def onIntersectingLocations(): DeveloperMetadataFinder
  def withId(id: Integer): DeveloperMetadataFinder
  def withKey(key: String): DeveloperMetadataFinder
  def withLocationType(locationType: DeveloperMetadataLocationType): DeveloperMetadataFinder
  def withValue(value: String): DeveloperMetadataFinder
  def withVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadataFinder
}

object DeveloperMetadataFinder {
  @scala.inline
  def apply(
    find: () => js.Array[DeveloperMetadata],
    onIntersectingLocations: () => DeveloperMetadataFinder,
    withId: Integer => DeveloperMetadataFinder,
    withKey: String => DeveloperMetadataFinder,
    withLocationType: DeveloperMetadataLocationType => DeveloperMetadataFinder,
    withValue: String => DeveloperMetadataFinder,
    withVisibility: DeveloperMetadataVisibility => DeveloperMetadataFinder
  ): DeveloperMetadataFinder = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction0(find), onIntersectingLocations = js.Any.fromFunction0(onIntersectingLocations), withId = js.Any.fromFunction1(withId), withKey = js.Any.fromFunction1(withKey), withLocationType = js.Any.fromFunction1(withLocationType), withValue = js.Any.fromFunction1(withValue), withVisibility = js.Any.fromFunction1(withVisibility))
  
    __obj.asInstanceOf[DeveloperMetadataFinder]
  }
}

