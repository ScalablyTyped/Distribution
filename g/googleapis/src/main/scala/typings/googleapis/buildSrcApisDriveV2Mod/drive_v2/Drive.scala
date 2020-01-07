package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

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
  * const drive = google.drive('v2');
  *
  * @namespace drive
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Drive
  */
@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Drive")
@js.native
class Drive protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var about: Resource$About = js.native
  var apps: Resource$Apps = js.native
  var changes: Resource$Changes = js.native
  var channels: Resource$Channels = js.native
  var children: Resource$Children = js.native
  var comments: Resource$Comments = js.native
  var context: APIRequestContext = js.native
  var files: Resource$Files = js.native
  var parents: Resource$Parents = js.native
  var permissions: Resource$Permissions = js.native
  var properties: Resource$Properties = js.native
  var realtime: Resource$Realtime = js.native
  var replies: Resource$Replies = js.native
  var revisions: Resource$Revisions = js.native
  var teamdrives: Resource$Teamdrives = js.native
}

