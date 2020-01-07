package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive Activity API
  *
  * Provides a historical view of activity in Google Drive.
  *
  * @example
  * const {google} = require('googleapis');
  * const driveactivity = google.driveactivity('v2');
  *
  * @namespace driveactivity
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Driveactivity
  */
@JSImport("googleapis/build/src/apis/driveactivity/v2", "driveactivity_v2.Driveactivity")
@js.native
class Driveactivity protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var activity: Resource$Activity = js.native
  var context: APIRequestContext = js.native
}

