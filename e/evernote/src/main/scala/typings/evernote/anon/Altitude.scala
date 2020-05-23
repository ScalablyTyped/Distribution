package typings.evernote.anon

import typings.evernote.mod.Types.LazyMap
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Altitude extends js.Object {
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
  def apply(
    altitude: js.UndefOr[Double] = js.undefined,
    applicationData: LazyMap = null,
    author: String = null,
    classifications: Map[String, String] = null,
    conflictSourceNoteGuid: typings.evernote.mod.Types.Guid = null,
    contentClass: String = null,
    creatorId: js.UndefOr[UserID] = js.undefined,
    lastEditedBy: String = null,
    lastEditorId: js.UndefOr[UserID] = js.undefined,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    noteTitleQuality: js.UndefOr[Double] = js.undefined,
    placeName: String = null,
    reminderDoneTime: js.UndefOr[Timestamp] = js.undefined,
    reminderOrder: js.UndefOr[Double] = js.undefined,
    reminderTime: js.UndefOr[Timestamp] = js.undefined,
    shareDate: js.UndefOr[Timestamp] = js.undefined,
    sharedWithBusiness: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    sourceApplication: String = null,
    sourceURL: String = null,
    subjectDate: js.UndefOr[Timestamp] = js.undefined
  ): Altitude = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (applicationData != null) __obj.updateDynamic("applicationData")(applicationData.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (classifications != null) __obj.updateDynamic("classifications")(classifications.asInstanceOf[js.Any])
    if (conflictSourceNoteGuid != null) __obj.updateDynamic("conflictSourceNoteGuid")(conflictSourceNoteGuid.asInstanceOf[js.Any])
    if (contentClass != null) __obj.updateDynamic("contentClass")(contentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(creatorId)) __obj.updateDynamic("creatorId")(creatorId.get.asInstanceOf[js.Any])
    if (lastEditedBy != null) __obj.updateDynamic("lastEditedBy")(lastEditedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(lastEditorId)) __obj.updateDynamic("lastEditorId")(lastEditorId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noteTitleQuality)) __obj.updateDynamic("noteTitleQuality")(noteTitleQuality.get.asInstanceOf[js.Any])
    if (placeName != null) __obj.updateDynamic("placeName")(placeName.asInstanceOf[js.Any])
    if (!js.isUndefined(reminderDoneTime)) __obj.updateDynamic("reminderDoneTime")(reminderDoneTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reminderOrder)) __obj.updateDynamic("reminderOrder")(reminderOrder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reminderTime)) __obj.updateDynamic("reminderTime")(reminderTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shareDate)) __obj.updateDynamic("shareDate")(shareDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sharedWithBusiness)) __obj.updateDynamic("sharedWithBusiness")(sharedWithBusiness.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceApplication != null) __obj.updateDynamic("sourceApplication")(sourceApplication.asInstanceOf[js.Any])
    if (sourceURL != null) __obj.updateDynamic("sourceURL")(sourceURL.asInstanceOf[js.Any])
    if (!js.isUndefined(subjectDate)) __obj.updateDynamic("subjectDate")(subjectDate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Altitude]
  }
}

