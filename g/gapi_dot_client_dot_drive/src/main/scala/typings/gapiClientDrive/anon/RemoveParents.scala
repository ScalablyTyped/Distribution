package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveParents extends js.Object {
  /** A comma-separated list of parent IDs to add. */
  var addParents: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * Set to true to opt in to API behavior that aims for all items to have exactly one parent. This parameter only takes effect if the item is not in a
    * shared drive. If the item's owner makes a request to add a single parent, the item is removed from all current folders and placed in the requested
    * folder. Other requests that increase the number of parents fail, except when the canAddMyDriveParent file capability is true and a single parent is
    * being added.
    */
  var enforceSingleParent: js.UndefOr[Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** The ID of the file. */
  var fileId: String
  /**
    * Whether to set the 'keepForever' field in the new head revision. This is only applicable to files with binary content in Google Drive. Only 200
    * revisions for the file can be kept forever. If the limit is reached, try deleting pinned revisions.
    */
  var keepRevisionForever: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** A language hint for OCR processing during image import (ISO 639-1 code). */
  var ocrLanguage: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** A comma-separated list of parent IDs to remove. */
  var removeParents: js.UndefOr[String] = js.undefined
  /** Whether the requesting application supports both My Drives and shared drives. */
  var supportsAllDrives: js.UndefOr[Boolean] = js.undefined
  /** Deprecated use supportsAllDrives instead. */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  /** Whether to use the uploaded content as indexable text. */
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.undefined
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
}

object RemoveParents {
  @scala.inline
  def apply(
    fileId: String,
    addParents: String = null,
    alt: String = null,
    enforceSingleParent: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    keepRevisionForever: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    oauth_token: String = null,
    ocrLanguage: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    removeParents: String = null,
    supportsAllDrives: js.UndefOr[Boolean] = js.undefined,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    useContentAsIndexableText: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): RemoveParents = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    if (addParents != null) __obj.updateDynamic("addParents")(addParents.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceSingleParent)) __obj.updateDynamic("enforceSingleParent")(enforceSingleParent.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(keepRevisionForever)) __obj.updateDynamic("keepRevisionForever")(keepRevisionForever.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (ocrLanguage != null) __obj.updateDynamic("ocrLanguage")(ocrLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (removeParents != null) __obj.updateDynamic("removeParents")(removeParents.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsAllDrives)) __obj.updateDynamic("supportsAllDrives")(supportsAllDrives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useContentAsIndexableText)) __obj.updateDynamic("useContentAsIndexableText")(useContentAsIndexableText.get.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveParents]
  }
}

