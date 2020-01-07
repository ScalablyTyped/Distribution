package typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Play Game Services Management API
  *
  * The Management API for Google Play Game Services.
  *
  * @example
  * const {google} = require('googleapis');
  * const gamesManagement = google.gamesManagement('v1management');
  *
  * @namespace gamesManagement
  * @type {Function}
  * @version v1management
  * @variation v1management
  * @param {object=} options Options for Gamesmanagement
  */
@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Gamesmanagement")
@js.native
class Gamesmanagement protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var achievements: Resource$Achievements = js.native
  var applications: Resource$Applications = js.native
  var context: APIRequestContext = js.native
  var events: Resource$Events = js.native
  var players: Resource$Players = js.native
  var quests: Resource$Quests = js.native
  var rooms: Resource$Rooms = js.native
  var scores: Resource$Scores = js.native
  var turnBasedMatches: Resource$Turnbasedmatches = js.native
}

