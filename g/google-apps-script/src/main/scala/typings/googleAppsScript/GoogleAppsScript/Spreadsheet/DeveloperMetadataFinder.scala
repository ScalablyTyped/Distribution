package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search for developer metadata in a spreadsheet. To create new developer metadata finder use
  * Range.createDeveloperMetadataFinder(), Sheet.createDeveloperMetadataFinder(),
  * or Spreadsheet.createDeveloperMetadataFinder().
  */
@js.native
trait DeveloperMetadataFinder extends js.Object {
  
  def find(): js.Array[DeveloperMetadata] = js.native
  
  def onIntersectingLocations(): DeveloperMetadataFinder = js.native
  
  def withId(id: Integer): DeveloperMetadataFinder = js.native
  
  def withKey(key: String): DeveloperMetadataFinder = js.native
  
  def withLocationType(locationType: DeveloperMetadataLocationType): DeveloperMetadataFinder = js.native
  
  def withValue(value: String): DeveloperMetadataFinder = js.native
  
  def withVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadataFinder = js.native
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
  
  @scala.inline
  implicit class DeveloperMetadataFinderOps[Self <: DeveloperMetadataFinder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFind(value: () => js.Array[DeveloperMetadata]): Self = this.set("find", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnIntersectingLocations(value: () => DeveloperMetadataFinder): Self = this.set("onIntersectingLocations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWithId(value: Integer => DeveloperMetadataFinder): Self = this.set("withId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithKey(value: String => DeveloperMetadataFinder): Self = this.set("withKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithLocationType(value: DeveloperMetadataLocationType => DeveloperMetadataFinder): Self = this.set("withLocationType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithValue(value: String => DeveloperMetadataFinder): Self = this.set("withValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithVisibility(value: DeveloperMetadataVisibility => DeveloperMetadataFinder): Self = this.set("withVisibility", js.Any.fromFunction1(value))
  }
}
