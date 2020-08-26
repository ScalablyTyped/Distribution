package typings.evernote.anon

import typings.evernote.mod.Types.LazyMap
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Altitude extends js.Object {
  var altitude: js.UndefOr[Double] = js.native
  var applicationData: js.UndefOr[LazyMap] = js.native
  var author: js.UndefOr[String] = js.native
  var classifications: js.UndefOr[Map[String, String]] = js.native
  var conflictSourceNoteGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  var contentClass: js.UndefOr[String] = js.native
  var creatorId: js.UndefOr[UserID] = js.native
  var lastEditedBy: js.UndefOr[String] = js.native
  var lastEditorId: js.UndefOr[UserID] = js.native
  var latitude: js.UndefOr[Double] = js.native
  var longitude: js.UndefOr[Double] = js.native
  var noteTitleQuality: js.UndefOr[Double] = js.native
  var placeName: js.UndefOr[String] = js.native
  var reminderDoneTime: js.UndefOr[Timestamp] = js.native
  var reminderOrder: js.UndefOr[Double] = js.native
  var reminderTime: js.UndefOr[Timestamp] = js.native
  var shareDate: js.UndefOr[Timestamp] = js.native
  var sharedWithBusiness: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[String] = js.native
  var sourceApplication: js.UndefOr[String] = js.native
  var sourceURL: js.UndefOr[String] = js.native
  var subjectDate: js.UndefOr[Timestamp] = js.native
}

object Altitude {
  @scala.inline
  def apply(): Altitude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Altitude]
  }
  @scala.inline
  implicit class AltitudeOps[Self <: Altitude] (val x: Self) extends AnyVal {
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
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    @scala.inline
    def setApplicationData(value: LazyMap): Self = this.set("applicationData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationData: Self = this.set("applicationData", js.undefined)
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setClassifications(value: Map[String, String]): Self = this.set("classifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassifications: Self = this.set("classifications", js.undefined)
    @scala.inline
    def setConflictSourceNoteGuid(value: typings.evernote.mod.Types.Guid): Self = this.set("conflictSourceNoteGuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConflictSourceNoteGuid: Self = this.set("conflictSourceNoteGuid", js.undefined)
    @scala.inline
    def setContentClass(value: String): Self = this.set("contentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClass: Self = this.set("contentClass", js.undefined)
    @scala.inline
    def setCreatorId(value: UserID): Self = this.set("creatorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatorId: Self = this.set("creatorId", js.undefined)
    @scala.inline
    def setLastEditedBy(value: String): Self = this.set("lastEditedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastEditedBy: Self = this.set("lastEditedBy", js.undefined)
    @scala.inline
    def setLastEditorId(value: UserID): Self = this.set("lastEditorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastEditorId: Self = this.set("lastEditorId", js.undefined)
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    @scala.inline
    def setNoteTitleQuality(value: Double): Self = this.set("noteTitleQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteTitleQuality: Self = this.set("noteTitleQuality", js.undefined)
    @scala.inline
    def setPlaceName(value: String): Self = this.set("placeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceName: Self = this.set("placeName", js.undefined)
    @scala.inline
    def setReminderDoneTime(value: Timestamp): Self = this.set("reminderDoneTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReminderDoneTime: Self = this.set("reminderDoneTime", js.undefined)
    @scala.inline
    def setReminderOrder(value: Double): Self = this.set("reminderOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReminderOrder: Self = this.set("reminderOrder", js.undefined)
    @scala.inline
    def setReminderTime(value: Timestamp): Self = this.set("reminderTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReminderTime: Self = this.set("reminderTime", js.undefined)
    @scala.inline
    def setShareDate(value: Timestamp): Self = this.set("shareDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareDate: Self = this.set("shareDate", js.undefined)
    @scala.inline
    def setSharedWithBusiness(value: Boolean): Self = this.set("sharedWithBusiness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedWithBusiness: Self = this.set("sharedWithBusiness", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSourceApplication(value: String): Self = this.set("sourceApplication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceApplication: Self = this.set("sourceApplication", js.undefined)
    @scala.inline
    def setSourceURL(value: String): Self = this.set("sourceURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceURL: Self = this.set("sourceURL", js.undefined)
    @scala.inline
    def setSubjectDate(value: Timestamp): Self = this.set("subjectDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubjectDate: Self = this.set("subjectDate", js.undefined)
  }
  
}

