package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive API
  *
  * Manages files in Drive including uploading, downloading, searching,
  * detecting changes, and updating sharing permissions.
  *
  * @example
  * const {google} = require('googleapis');
  * const drive = google.drive('v3');
  *
  * @namespace drive
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Drive
  */
@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Drive")
@js.native
class Drive protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var about: Resource$About = js.native
  var changes: Resource$Changes = js.native
  var channels: Resource$Channels = js.native
  var comments: Resource$Comments = js.native
  var context: APIRequestContext = js.native
  var files: Resource$Files = js.native
  var permissions: Resource$Permissions = js.native
  var replies: Resource$Replies = js.native
  var revisions: Resource$Revisions = js.native
  var teamdrives: Resource$Teamdrives = js.native
}

