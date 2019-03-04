package typings
package gapiDotClientDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddParents extends js.Object {
  /** A comma-separated list of parent IDs to add. */
  var addParents: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the file. */
  var fileId: java.lang.String
  /** Whether to set the 'keepForever' field in the new head revision. This is only applicable to files with binary content in Drive. */
  var keepRevisionForever: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** A language hint for OCR processing during image import (ISO 639-1 code). */
  var ocrLanguage: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** A comma-separated list of parent IDs to remove. */
  var removeParents: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the requesting application supports Team Drives. */
  var supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to use the uploaded content as indexable text. */
  var useContentAsIndexableText: js.UndefOr[scala.Boolean] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AddParents {
  @scala.inline
  def apply(
    fileId: java.lang.String,
    addParents: java.lang.String = null,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    keepRevisionForever: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    ocrLanguage: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    removeParents: java.lang.String = null,
    supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined,
    useContentAsIndexableText: js.UndefOr[scala.Boolean] = js.undefined,
    userIp: java.lang.String = null
  ): Anon_AddParents = {
    val __obj = js.Dynamic.literal(fileId = fileId)
    if (addParents != null) __obj.updateDynamic("addParents")(addParents)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(keepRevisionForever)) __obj.updateDynamic("keepRevisionForever")(keepRevisionForever)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (ocrLanguage != null) __obj.updateDynamic("ocrLanguage")(ocrLanguage)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (removeParents != null) __obj.updateDynamic("removeParents")(removeParents)
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives)
    if (!js.isUndefined(useContentAsIndexableText)) __obj.updateDynamic("useContentAsIndexableText")(useContentAsIndexableText)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AddParents]
  }
}

