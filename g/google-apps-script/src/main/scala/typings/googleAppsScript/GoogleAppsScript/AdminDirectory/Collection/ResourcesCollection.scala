package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Resources.BuildingsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Resources.CalendarsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Resources.FeaturesCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcesCollection extends js.Object {
  
  var Buildings: js.UndefOr[BuildingsCollection] = js.native
  
  var Calendars: js.UndefOr[CalendarsCollection] = js.native
  
  var Features: js.UndefOr[FeaturesCollection] = js.native
}
object ResourcesCollection {
  
  @scala.inline
  def apply(): ResourcesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcesCollection]
  }
  
  @scala.inline
  implicit class ResourcesCollectionOps[Self <: ResourcesCollection] (val x: Self) extends AnyVal {
    
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
    def setBuildings(value: BuildingsCollection): Self = this.set("Buildings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildings: Self = this.set("Buildings", js.undefined)
    
    @scala.inline
    def setCalendars(value: CalendarsCollection): Self = this.set("Calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendars: Self = this.set("Calendars", js.undefined)
    
    @scala.inline
    def setFeatures(value: FeaturesCollection): Self = this.set("Features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("Features", js.undefined)
  }
}
