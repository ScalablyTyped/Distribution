package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.Anon_Aperture
import typings.googleapis.Anon_CanAddChildren
import typings.googleapis.Anon_DurationMillis
import typings.googleapis.Anon_Hidden
import typings.googleapis.Anon_Image
import typings.googleapis.Anon_Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata for a file.
  */
@js.native
trait Schema$File extends js.Object {
  /**
    * A link for opening the file in a relevant Google editor or viewer.
    */
  var alternateLink: js.UndefOr[String] = js.native
  /**
    * Whether this file is in the Application Data folder.
    */
  var appDataContents: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated: use capabilities/canComment.
    */
  var canComment: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated: use capabilities/canReadRevisions.
    */
  var canReadRevisions: js.UndefOr[Boolean] = js.native
  /**
    * Capabilities the current user has on this file. Each capability
    * corresponds to a fine-grained action that a user may take.
    */
  var capabilities: js.UndefOr[Anon_CanAddChildren] = js.native
  /**
    * Whether the options to copy, print, or download this file, should be
    * disabled for readers and commenters.
    */
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated: use capabilities/canCopy.
    */
  var copyable: js.UndefOr[Boolean] = js.native
  /**
    * Create time for this file (formatted RFC 3339 timestamp).
    */
  var createdDate: js.UndefOr[String] = js.native
  /**
    * A link to open this file with the user&#39;s default app for this file.
    * Only populated when the drive.apps.readonly scope is used.
    */
  var defaultOpenWithLink: js.UndefOr[String] = js.native
  /**
    * A short description of the file.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Short lived download URL for the file. This field is only populated for
    * files with content stored in Drive; it is not populated for Google Docs
    * or shortcut files.
    */
  var downloadUrl: js.UndefOr[String] = js.native
  /**
    * Deprecated: use capabilities/canEdit.
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * A link for embedding the file.
    */
  var embedLink: js.UndefOr[String] = js.native
  /**
    * ETag of the file.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Whether this file has been explicitly trashed, as opposed to recursively
    * trashed.
    */
  var explicitlyTrashed: js.UndefOr[Boolean] = js.native
  /**
    * Links for exporting Google Docs to specific formats.
    */
  var exportLinks: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The final component of fullFileExtension with trailing text that does not
    * appear to be part of the extension removed. This field is only populated
    * for files with content stored in Drive; it is not populated for Google
    * Docs or shortcut files.
    */
  var fileExtension: js.UndefOr[String] = js.native
  /**
    * The size of the file in bytes. This field is only populated for files
    * with content stored in Drive; it is not populated for Google Docs or
    * shortcut files.
    */
  var fileSize: js.UndefOr[String] = js.native
  /**
    * Folder color as an RGB hex string if the file is a folder. The list of
    * supported colors is available in the folderColorPalette field of the
    * About resource. If an unsupported color is specified, it will be changed
    * to the closest color in the palette. Not populated for Team Drive files.
    */
  var folderColorRgb: js.UndefOr[String] = js.native
  /**
    * The full file extension; extracted from the title. May contain multiple
    * concatenated extensions, such as &quot;tar.gz&quot;. Removing an
    * extension from the title does not clear this field; however, changing the
    * extension on the title does update this field. This field is only
    * populated for files with content stored in Drive; it is not populated for
    * Google Docs or shortcut files.
    */
  var fullFileExtension: js.UndefOr[String] = js.native
  /**
    * Whether any users are granted file access directly on this file. This
    * field is only populated for Team Drive files.
    */
  var hasAugmentedPermissions: js.UndefOr[Boolean] = js.native
  /**
    * Whether this file has a thumbnail. This does not indicate whether the
    * requesting app has access to the thumbnail. To check access, look for the
    * presence of the thumbnailLink field.
    */
  var hasThumbnail: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the file&#39;s head revision. This field is only populated for
    * files with content stored in Drive; it is not populated for Google Docs
    * or shortcut files.
    */
  var headRevisionId: js.UndefOr[String] = js.native
  /**
    * A link to the file&#39;s icon.
    */
  var iconLink: js.UndefOr[String] = js.native
  /**
    * The ID of the file.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Metadata about image media. This will only be present for image types,
    * and its contents will depend on what can be parsed from the image
    * content.
    */
  var imageMediaMetadata: js.UndefOr[Anon_Aperture] = js.native
  /**
    * Indexable text attributes for the file (can only be written)
    */
  var indexableText: js.UndefOr[Anon_Text] = js.native
  /**
    * Whether the file was created or opened by the requesting app.
    */
  var isAppAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * The type of file. This is always drive#file.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A group of labels for the file.
    */
  var labels: js.UndefOr[Anon_Hidden] = js.native
  /**
    * The last user to modify this file.
    */
  var lastModifyingUser: js.UndefOr[Schema$User] = js.native
  /**
    * Name of the last user to modify this file.
    */
  var lastModifyingUserName: js.UndefOr[String] = js.native
  /**
    * Last time this file was viewed by the user (formatted RFC 3339
    * timestamp).
    */
  var lastViewedByMeDate: js.UndefOr[String] = js.native
  /**
    * Deprecated.
    */
  var markedViewedByMeDate: js.UndefOr[String] = js.native
  /**
    * An MD5 checksum for the content of this file. This field is only
    * populated for files with content stored in Drive; it is not populated for
    * Google Docs or shortcut files.
    */
  var md5Checksum: js.UndefOr[String] = js.native
  /**
    * The MIME type of the file. This is only mutable on update when uploading
    * new content. This field can be left blank, and the mimetype will be
    * determined from the uploaded content&#39;s MIME type.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Last time this file was modified by the user (formatted RFC 3339
    * timestamp). Note that setting modifiedDate will also update the
    * modifiedByMe date for the user which set the date.
    */
  var modifiedByMeDate: js.UndefOr[String] = js.native
  /**
    * Last time this file was modified by anyone (formatted RFC 3339
    * timestamp). This is only mutable on update when the setModifiedDate
    * parameter is set.
    */
  var modifiedDate: js.UndefOr[String] = js.native
  /**
    * A map of the id of each of the user&#39;s apps to a link to open this
    * file with that app. Only populated when the drive.apps.readonly scope is
    * used.
    */
  var openWithLinks: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The original filename of the uploaded content if available, or else the
    * original value of the title field. This is only available for files with
    * binary content in Drive.
    */
  var originalFilename: js.UndefOr[String] = js.native
  /**
    * Whether the file is owned by the current user. Not populated for Team
    * Drive files.
    */
  var ownedByMe: js.UndefOr[Boolean] = js.native
  /**
    * Name(s) of the owner(s) of this file. Not populated for Team Drive files.
    */
  var ownerNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The owner(s) of this file. Not populated for Team Drive files.
    */
  var owners: js.UndefOr[js.Array[Schema$User]] = js.native
  /**
    * Collection of parent folders which contain this file. If not specified as
    * part of an insert request, the file will be placed directly in the
    * user&#39;s My Drive folder. If not specified as part of a copy request,
    * the file will inherit any discoverable parents of the source file. Update
    * requests can also use the addParents and removeParents parameters to
    * modify the parents list.
    */
  var parents: js.UndefOr[js.Array[Schema$ParentReference]] = js.native
  /**
    * List of permission IDs for users with access to this file.
    */
  var permissionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of permissions for users with access to this file. Not populated
    * for Team Drive files.
    */
  var permissions: js.UndefOr[js.Array[Schema$Permission]] = js.native
  /**
    * The list of properties.
    */
  var properties: js.UndefOr[js.Array[Schema$Property]] = js.native
  /**
    * The number of quota bytes used by this file.
    */
  var quotaBytesUsed: js.UndefOr[String] = js.native
  /**
    * A link back to this file.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Deprecated: use capabilities/canShare.
    */
  var shareable: js.UndefOr[Boolean] = js.native
  /**
    * Whether the file has been shared. Not populated for Team Drive files.
    */
  var shared: js.UndefOr[Boolean] = js.native
  /**
    * Time at which this file was shared with the user (formatted RFC 3339
    * timestamp).
    */
  var sharedWithMeDate: js.UndefOr[String] = js.native
  /**
    * User that shared the item with the current user, if available.
    */
  var sharingUser: js.UndefOr[Schema$User] = js.native
  /**
    * The list of spaces which contain the file. Supported values are
    * &#39;drive&#39;, &#39;appDataFolder&#39; and &#39;photos&#39;.
    */
  var spaces: js.UndefOr[js.Array[String]] = js.native
  /**
    * ID of the Team Drive the file resides in.
    */
  var teamDriveId: js.UndefOr[String] = js.native
  /**
    * A thumbnail for the file. This will only be used if Drive cannot generate
    * a standard thumbnail.
    */
  var thumbnail: js.UndefOr[Anon_Image] = js.native
  /**
    * A short-lived link to the file&#39;s thumbnail. Typically lasts on the
    * order of hours. Only populated when the requesting app can access the
    * file&#39;s content.
    */
  var thumbnailLink: js.UndefOr[String] = js.native
  /**
    * The thumbnail version for use in thumbnail cache invalidation.
    */
  var thumbnailVersion: js.UndefOr[String] = js.native
  /**
    * The title of this file. Note that for immutable items such as the top
    * level folders of Team Drives, My Drive root folder, and Application Data
    * folder the title is constant.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The time that the item was trashed (formatted RFC 3339 timestamp). Only
    * populated for Team Drive files.
    */
  var trashedDate: js.UndefOr[String] = js.native
  /**
    * If the file has been explicitly trashed, the user who trashed it. Only
    * populated for Team Drive files.
    */
  var trashingUser: js.UndefOr[Schema$User] = js.native
  /**
    * The permissions for the authenticated user on this file.
    */
  var userPermission: js.UndefOr[Schema$Permission] = js.native
  /**
    * A monotonically increasing version number for the file. This reflects
    * every change made to the file on the server, even those not visible to
    * the requesting user.
    */
  var version: js.UndefOr[String] = js.native
  /**
    * Metadata about video media. This will only be present for video types.
    */
  var videoMediaMetadata: js.UndefOr[Anon_DurationMillis] = js.native
  /**
    * A link for downloading the content of the file in a browser using cookie
    * based authentication. In cases where the content is shared publicly, the
    * content can be downloaded without any credentials.
    */
  var webContentLink: js.UndefOr[String] = js.native
  /**
    * A link only available on public folders for viewing their static web
    * assets (HTML, CSS, JS, etc) via Google Drive&#39;s Website Hosting.
    */
  var webViewLink: js.UndefOr[String] = js.native
  /**
    * Whether writers can share the document with other users. Not populated
    * for Team Drive files.
    */
  var writersCanShare: js.UndefOr[Boolean] = js.native
}

object Schema$File {
  @scala.inline
  def apply(
    alternateLink: String = null,
    appDataContents: js.UndefOr[Boolean] = js.undefined,
    canComment: js.UndefOr[Boolean] = js.undefined,
    canReadRevisions: js.UndefOr[Boolean] = js.undefined,
    capabilities: Anon_CanAddChildren = null,
    copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined,
    copyable: js.UndefOr[Boolean] = js.undefined,
    createdDate: String = null,
    defaultOpenWithLink: String = null,
    description: String = null,
    downloadUrl: String = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    embedLink: String = null,
    etag: String = null,
    explicitlyTrashed: js.UndefOr[Boolean] = js.undefined,
    exportLinks: StringDictionary[String] = null,
    fileExtension: String = null,
    fileSize: String = null,
    folderColorRgb: String = null,
    fullFileExtension: String = null,
    hasAugmentedPermissions: js.UndefOr[Boolean] = js.undefined,
    hasThumbnail: js.UndefOr[Boolean] = js.undefined,
    headRevisionId: String = null,
    iconLink: String = null,
    id: String = null,
    imageMediaMetadata: Anon_Aperture = null,
    indexableText: Anon_Text = null,
    isAppAuthorized: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    labels: Anon_Hidden = null,
    lastModifyingUser: Schema$User = null,
    lastModifyingUserName: String = null,
    lastViewedByMeDate: String = null,
    markedViewedByMeDate: String = null,
    md5Checksum: String = null,
    mimeType: String = null,
    modifiedByMeDate: String = null,
    modifiedDate: String = null,
    openWithLinks: StringDictionary[String] = null,
    originalFilename: String = null,
    ownedByMe: js.UndefOr[Boolean] = js.undefined,
    ownerNames: js.Array[String] = null,
    owners: js.Array[Schema$User] = null,
    parents: js.Array[Schema$ParentReference] = null,
    permissionIds: js.Array[String] = null,
    permissions: js.Array[Schema$Permission] = null,
    properties: js.Array[Schema$Property] = null,
    quotaBytesUsed: String = null,
    selfLink: String = null,
    shareable: js.UndefOr[Boolean] = js.undefined,
    shared: js.UndefOr[Boolean] = js.undefined,
    sharedWithMeDate: String = null,
    sharingUser: Schema$User = null,
    spaces: js.Array[String] = null,
    teamDriveId: String = null,
    thumbnail: Anon_Image = null,
    thumbnailLink: String = null,
    thumbnailVersion: String = null,
    title: String = null,
    trashedDate: String = null,
    trashingUser: Schema$User = null,
    userPermission: Schema$Permission = null,
    version: String = null,
    videoMediaMetadata: Anon_DurationMillis = null,
    webContentLink: String = null,
    webViewLink: String = null,
    writersCanShare: js.UndefOr[Boolean] = js.undefined
  ): Schema$File = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink.asInstanceOf[js.Any])
    if (!js.isUndefined(appDataContents)) __obj.updateDynamic("appDataContents")(appDataContents.asInstanceOf[js.Any])
    if (!js.isUndefined(canComment)) __obj.updateDynamic("canComment")(canComment.asInstanceOf[js.Any])
    if (!js.isUndefined(canReadRevisions)) __obj.updateDynamic("canReadRevisions")(canReadRevisions.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (!js.isUndefined(copyRequiresWriterPermission)) __obj.updateDynamic("copyRequiresWriterPermission")(copyRequiresWriterPermission.asInstanceOf[js.Any])
    if (!js.isUndefined(copyable)) __obj.updateDynamic("copyable")(copyable.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (defaultOpenWithLink != null) __obj.updateDynamic("defaultOpenWithLink")(defaultOpenWithLink.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (embedLink != null) __obj.updateDynamic("embedLink")(embedLink.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitlyTrashed)) __obj.updateDynamic("explicitlyTrashed")(explicitlyTrashed.asInstanceOf[js.Any])
    if (exportLinks != null) __obj.updateDynamic("exportLinks")(exportLinks.asInstanceOf[js.Any])
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (folderColorRgb != null) __obj.updateDynamic("folderColorRgb")(folderColorRgb.asInstanceOf[js.Any])
    if (fullFileExtension != null) __obj.updateDynamic("fullFileExtension")(fullFileExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAugmentedPermissions)) __obj.updateDynamic("hasAugmentedPermissions")(hasAugmentedPermissions.asInstanceOf[js.Any])
    if (!js.isUndefined(hasThumbnail)) __obj.updateDynamic("hasThumbnail")(hasThumbnail.asInstanceOf[js.Any])
    if (headRevisionId != null) __obj.updateDynamic("headRevisionId")(headRevisionId.asInstanceOf[js.Any])
    if (iconLink != null) __obj.updateDynamic("iconLink")(iconLink.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageMediaMetadata != null) __obj.updateDynamic("imageMediaMetadata")(imageMediaMetadata.asInstanceOf[js.Any])
    if (indexableText != null) __obj.updateDynamic("indexableText")(indexableText.asInstanceOf[js.Any])
    if (!js.isUndefined(isAppAuthorized)) __obj.updateDynamic("isAppAuthorized")(isAppAuthorized.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lastModifyingUser != null) __obj.updateDynamic("lastModifyingUser")(lastModifyingUser.asInstanceOf[js.Any])
    if (lastModifyingUserName != null) __obj.updateDynamic("lastModifyingUserName")(lastModifyingUserName.asInstanceOf[js.Any])
    if (lastViewedByMeDate != null) __obj.updateDynamic("lastViewedByMeDate")(lastViewedByMeDate.asInstanceOf[js.Any])
    if (markedViewedByMeDate != null) __obj.updateDynamic("markedViewedByMeDate")(markedViewedByMeDate.asInstanceOf[js.Any])
    if (md5Checksum != null) __obj.updateDynamic("md5Checksum")(md5Checksum.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (modifiedByMeDate != null) __obj.updateDynamic("modifiedByMeDate")(modifiedByMeDate.asInstanceOf[js.Any])
    if (modifiedDate != null) __obj.updateDynamic("modifiedDate")(modifiedDate.asInstanceOf[js.Any])
    if (openWithLinks != null) __obj.updateDynamic("openWithLinks")(openWithLinks.asInstanceOf[js.Any])
    if (originalFilename != null) __obj.updateDynamic("originalFilename")(originalFilename.asInstanceOf[js.Any])
    if (!js.isUndefined(ownedByMe)) __obj.updateDynamic("ownedByMe")(ownedByMe.asInstanceOf[js.Any])
    if (ownerNames != null) __obj.updateDynamic("ownerNames")(ownerNames.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (parents != null) __obj.updateDynamic("parents")(parents.asInstanceOf[js.Any])
    if (permissionIds != null) __obj.updateDynamic("permissionIds")(permissionIds.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (quotaBytesUsed != null) __obj.updateDynamic("quotaBytesUsed")(quotaBytesUsed.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (!js.isUndefined(shareable)) __obj.updateDynamic("shareable")(shareable.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (sharedWithMeDate != null) __obj.updateDynamic("sharedWithMeDate")(sharedWithMeDate.asInstanceOf[js.Any])
    if (sharingUser != null) __obj.updateDynamic("sharingUser")(sharingUser.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (teamDriveId != null) __obj.updateDynamic("teamDriveId")(teamDriveId.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (thumbnailLink != null) __obj.updateDynamic("thumbnailLink")(thumbnailLink.asInstanceOf[js.Any])
    if (thumbnailVersion != null) __obj.updateDynamic("thumbnailVersion")(thumbnailVersion.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trashedDate != null) __obj.updateDynamic("trashedDate")(trashedDate.asInstanceOf[js.Any])
    if (trashingUser != null) __obj.updateDynamic("trashingUser")(trashingUser.asInstanceOf[js.Any])
    if (userPermission != null) __obj.updateDynamic("userPermission")(userPermission.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (videoMediaMetadata != null) __obj.updateDynamic("videoMediaMetadata")(videoMediaMetadata.asInstanceOf[js.Any])
    if (webContentLink != null) __obj.updateDynamic("webContentLink")(webContentLink.asInstanceOf[js.Any])
    if (webViewLink != null) __obj.updateDynamic("webViewLink")(webViewLink.asInstanceOf[js.Any])
    if (!js.isUndefined(writersCanShare)) __obj.updateDynamic("writersCanShare")(writersCanShare.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$File]
  }
}

