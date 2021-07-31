package typings.evernote.anon

import typings.evernote.mod.Types.LazyMap
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Altitude extends StObject {
  
  var altitude: js.UndefOr[Double] = js.undefined
  
  var applicationData: js.UndefOr[LazyMap] = js.undefined
  
  var author: js.UndefOr[String] = js.undefined
  
  var classifications: js.UndefOr[Map[String, String]] = js.undefined
  
  var conflictSourceNoteGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  
  var contentClass: js.UndefOr[String] = js.undefined
  
  var creatorId: js.UndefOr[UserID] = js.undefined
  
  var lastEditedBy: js.UndefOr[String] = js.undefined
  
  var lastEditorId: js.UndefOr[UserID] = js.undefined
  
  var latitude: js.UndefOr[Double] = js.undefined
  
  var longitude: js.UndefOr[Double] = js.undefined
  
  var noteTitleQuality: js.UndefOr[Double] = js.undefined
  
  var placeName: js.UndefOr[String] = js.undefined
  
  var reminderDoneTime: js.UndefOr[Timestamp] = js.undefined
  
  var reminderOrder: js.UndefOr[Double] = js.undefined
  
  var reminderTime: js.UndefOr[Timestamp] = js.undefined
  
  var shareDate: js.UndefOr[Timestamp] = js.undefined
  
  var sharedWithBusiness: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var sourceApplication: js.UndefOr[String] = js.undefined
  
  var sourceURL: js.UndefOr[String] = js.undefined
  
  var subjectDate: js.UndefOr[Timestamp] = js.undefined
}
object Altitude {
  
  @scala.inline
  def apply(): Altitude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Altitude]
  }
  
  @scala.inline
  implicit class AltitudeMutableBuilder[Self <: Altitude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setApplicationData(value: LazyMap): Self = StObject.set(x, "applicationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationDataUndefined: Self = StObject.set(x, "applicationData", js.undefined)
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setClassifications(value: Map[String, String]): Self = StObject.set(x, "classifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationsUndefined: Self = StObject.set(x, "classifications", js.undefined)
    
    @scala.inline
    def setConflictSourceNoteGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "conflictSourceNoteGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictSourceNoteGuidUndefined: Self = StObject.set(x, "conflictSourceNoteGuid", js.undefined)
    
    @scala.inline
    def setContentClass(value: String): Self = StObject.set(x, "contentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentClassUndefined: Self = StObject.set(x, "contentClass", js.undefined)
    
    @scala.inline
    def setCreatorId(value: UserID): Self = StObject.set(x, "creatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorIdUndefined: Self = StObject.set(x, "creatorId", js.undefined)
    
    @scala.inline
    def setLastEditedBy(value: String): Self = StObject.set(x, "lastEditedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEditedByUndefined: Self = StObject.set(x, "lastEditedBy", js.undefined)
    
    @scala.inline
    def setLastEditorId(value: UserID): Self = StObject.set(x, "lastEditorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEditorIdUndefined: Self = StObject.set(x, "lastEditorId", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setNoteTitleQuality(value: Double): Self = StObject.set(x, "noteTitleQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteTitleQualityUndefined: Self = StObject.set(x, "noteTitleQuality", js.undefined)
    
    @scala.inline
    def setPlaceName(value: String): Self = StObject.set(x, "placeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceNameUndefined: Self = StObject.set(x, "placeName", js.undefined)
    
    @scala.inline
    def setReminderDoneTime(value: Timestamp): Self = StObject.set(x, "reminderDoneTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminderDoneTimeUndefined: Self = StObject.set(x, "reminderDoneTime", js.undefined)
    
    @scala.inline
    def setReminderOrder(value: Double): Self = StObject.set(x, "reminderOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminderOrderUndefined: Self = StObject.set(x, "reminderOrder", js.undefined)
    
    @scala.inline
    def setReminderTime(value: Timestamp): Self = StObject.set(x, "reminderTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminderTimeUndefined: Self = StObject.set(x, "reminderTime", js.undefined)
    
    @scala.inline
    def setShareDate(value: Timestamp): Self = StObject.set(x, "shareDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareDateUndefined: Self = StObject.set(x, "shareDate", js.undefined)
    
    @scala.inline
    def setSharedWithBusiness(value: Boolean): Self = StObject.set(x, "sharedWithBusiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedWithBusinessUndefined: Self = StObject.set(x, "sharedWithBusiness", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceApplication(value: String): Self = StObject.set(x, "sourceApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceApplicationUndefined: Self = StObject.set(x, "sourceApplication", js.undefined)
    
    @scala.inline
    def setSourceURL(value: String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceURLUndefined: Self = StObject.set(x, "sourceURL", js.undefined)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSubjectDate(value: Timestamp): Self = StObject.set(x, "subjectDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectDateUndefined: Self = StObject.set(x, "subjectDate", js.undefined)
  }
}
