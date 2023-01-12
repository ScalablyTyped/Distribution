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
  
  inline def apply(): Altitude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Altitude]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Altitude] (val x: Self) extends AnyVal {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setApplicationData(value: LazyMap): Self = StObject.set(x, "applicationData", value.asInstanceOf[js.Any])
    
    inline def setApplicationDataUndefined: Self = StObject.set(x, "applicationData", js.undefined)
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setClassifications(value: Map[String, String]): Self = StObject.set(x, "classifications", value.asInstanceOf[js.Any])
    
    inline def setClassificationsUndefined: Self = StObject.set(x, "classifications", js.undefined)
    
    inline def setConflictSourceNoteGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "conflictSourceNoteGuid", value.asInstanceOf[js.Any])
    
    inline def setConflictSourceNoteGuidUndefined: Self = StObject.set(x, "conflictSourceNoteGuid", js.undefined)
    
    inline def setContentClass(value: String): Self = StObject.set(x, "contentClass", value.asInstanceOf[js.Any])
    
    inline def setContentClassUndefined: Self = StObject.set(x, "contentClass", js.undefined)
    
    inline def setCreatorId(value: UserID): Self = StObject.set(x, "creatorId", value.asInstanceOf[js.Any])
    
    inline def setCreatorIdUndefined: Self = StObject.set(x, "creatorId", js.undefined)
    
    inline def setLastEditedBy(value: String): Self = StObject.set(x, "lastEditedBy", value.asInstanceOf[js.Any])
    
    inline def setLastEditedByUndefined: Self = StObject.set(x, "lastEditedBy", js.undefined)
    
    inline def setLastEditorId(value: UserID): Self = StObject.set(x, "lastEditorId", value.asInstanceOf[js.Any])
    
    inline def setLastEditorIdUndefined: Self = StObject.set(x, "lastEditorId", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setNoteTitleQuality(value: Double): Self = StObject.set(x, "noteTitleQuality", value.asInstanceOf[js.Any])
    
    inline def setNoteTitleQualityUndefined: Self = StObject.set(x, "noteTitleQuality", js.undefined)
    
    inline def setPlaceName(value: String): Self = StObject.set(x, "placeName", value.asInstanceOf[js.Any])
    
    inline def setPlaceNameUndefined: Self = StObject.set(x, "placeName", js.undefined)
    
    inline def setReminderDoneTime(value: Timestamp): Self = StObject.set(x, "reminderDoneTime", value.asInstanceOf[js.Any])
    
    inline def setReminderDoneTimeUndefined: Self = StObject.set(x, "reminderDoneTime", js.undefined)
    
    inline def setReminderOrder(value: Double): Self = StObject.set(x, "reminderOrder", value.asInstanceOf[js.Any])
    
    inline def setReminderOrderUndefined: Self = StObject.set(x, "reminderOrder", js.undefined)
    
    inline def setReminderTime(value: Timestamp): Self = StObject.set(x, "reminderTime", value.asInstanceOf[js.Any])
    
    inline def setReminderTimeUndefined: Self = StObject.set(x, "reminderTime", js.undefined)
    
    inline def setShareDate(value: Timestamp): Self = StObject.set(x, "shareDate", value.asInstanceOf[js.Any])
    
    inline def setShareDateUndefined: Self = StObject.set(x, "shareDate", js.undefined)
    
    inline def setSharedWithBusiness(value: Boolean): Self = StObject.set(x, "sharedWithBusiness", value.asInstanceOf[js.Any])
    
    inline def setSharedWithBusinessUndefined: Self = StObject.set(x, "sharedWithBusiness", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceApplication(value: String): Self = StObject.set(x, "sourceApplication", value.asInstanceOf[js.Any])
    
    inline def setSourceApplicationUndefined: Self = StObject.set(x, "sourceApplication", js.undefined)
    
    inline def setSourceURL(value: String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
    
    inline def setSourceURLUndefined: Self = StObject.set(x, "sourceURL", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSubjectDate(value: Timestamp): Self = StObject.set(x, "subjectDate", value.asInstanceOf[js.Any])
    
    inline def setSubjectDateUndefined: Self = StObject.set(x, "subjectDate", js.undefined)
  }
}
