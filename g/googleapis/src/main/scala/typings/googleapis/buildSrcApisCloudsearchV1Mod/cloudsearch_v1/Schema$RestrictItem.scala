package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information relevant only to a restrict entry. NextId: 12
  */
@js.native
trait Schema$RestrictItem extends js.Object {
  /**
    * LINT.ThenChange(//depot/google3/java/com/google/apps/search/quality/itemsuggest/utils/SubtypeRerankingUtils.java)
    */
  var driveFollowUpRestrict: js.UndefOr[Schema$DriveFollowUpRestrict] = js.native
  var driveLocationRestrict: js.UndefOr[Schema$DriveLocationRestrict] = js.native
  /**
    * LINT.IfChange Drive Types.
    */
  var driveMimeTypeRestrict: js.UndefOr[Schema$DriveMimeTypeRestrict] = js.native
  var driveTimeSpanRestrict: js.UndefOr[Schema$DriveTimeSpanRestrict] = js.native
  var gmailActionRestrict: js.UndefOr[Schema$GmailActionRestrict] = js.native
  var gmailAttachmentRestrict: js.UndefOr[Schema$GmailAttachmentRestrict] = js.native
  /**
    * Gmail Types.
    */
  var gmailFolderRestrict: js.UndefOr[Schema$GmailFolderRestrict] = js.native
  var gmailIntelligentRestrict: js.UndefOr[Schema$GmailIntelligentRestrict] = js.native
  var gmailTimeRestrict: js.UndefOr[Schema$GmailTimeRestrict] = js.native
  /**
    * The search restrict (e.g. &quot;after:2017-09-11
    * before:2017-09-12&quot;).
    */
  var searchOperator: js.UndefOr[String] = js.native
}

object Schema$RestrictItem {
  @scala.inline
  def apply(
    driveFollowUpRestrict: Schema$DriveFollowUpRestrict = null,
    driveLocationRestrict: Schema$DriveLocationRestrict = null,
    driveMimeTypeRestrict: Schema$DriveMimeTypeRestrict = null,
    driveTimeSpanRestrict: Schema$DriveTimeSpanRestrict = null,
    gmailActionRestrict: Schema$GmailActionRestrict = null,
    gmailAttachmentRestrict: Schema$GmailAttachmentRestrict = null,
    gmailFolderRestrict: Schema$GmailFolderRestrict = null,
    gmailIntelligentRestrict: Schema$GmailIntelligentRestrict = null,
    gmailTimeRestrict: Schema$GmailTimeRestrict = null,
    searchOperator: String = null
  ): Schema$RestrictItem = {
    val __obj = js.Dynamic.literal()
    if (driveFollowUpRestrict != null) __obj.updateDynamic("driveFollowUpRestrict")(driveFollowUpRestrict.asInstanceOf[js.Any])
    if (driveLocationRestrict != null) __obj.updateDynamic("driveLocationRestrict")(driveLocationRestrict.asInstanceOf[js.Any])
    if (driveMimeTypeRestrict != null) __obj.updateDynamic("driveMimeTypeRestrict")(driveMimeTypeRestrict.asInstanceOf[js.Any])
    if (driveTimeSpanRestrict != null) __obj.updateDynamic("driveTimeSpanRestrict")(driveTimeSpanRestrict.asInstanceOf[js.Any])
    if (gmailActionRestrict != null) __obj.updateDynamic("gmailActionRestrict")(gmailActionRestrict.asInstanceOf[js.Any])
    if (gmailAttachmentRestrict != null) __obj.updateDynamic("gmailAttachmentRestrict")(gmailAttachmentRestrict.asInstanceOf[js.Any])
    if (gmailFolderRestrict != null) __obj.updateDynamic("gmailFolderRestrict")(gmailFolderRestrict.asInstanceOf[js.Any])
    if (gmailIntelligentRestrict != null) __obj.updateDynamic("gmailIntelligentRestrict")(gmailIntelligentRestrict.asInstanceOf[js.Any])
    if (gmailTimeRestrict != null) __obj.updateDynamic("gmailTimeRestrict")(gmailTimeRestrict.asInstanceOf[js.Any])
    if (searchOperator != null) __obj.updateDynamic("searchOperator")(searchOperator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RestrictItem]
  }
}

