package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Play Game Services API
  *
  * The API for Google Play Game Services.
  *
  * @example
  * const {google} = require('googleapis');
  * const games = google.games('v1');
  *
  * @namespace games
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Games
  */
@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Games")
@js.native
class Games protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var achievementDefinitions: Resource$Achievementdefinitions = js.native
  var achievements: Resource$Achievements = js.native
  var applications: Resource$Applications = js.native
  var context: APIRequestContext = js.native
  var events: Resource$Events = js.native
  var leaderboards: Resource$Leaderboards = js.native
  var metagame: Resource$Metagame = js.native
  var players: Resource$Players = js.native
  var pushtokens: Resource$Pushtokens = js.native
  var questMilestones: Resource$Questmilestones = js.native
  var quests: Resource$Quests = js.native
  var revisions: Resource$Revisions = js.native
  var rooms: Resource$Rooms = js.native
  var scores: Resource$Scores = js.native
  var snapshots: Resource$Snapshots = js.native
  var turnBasedMatches: Resource$Turnbasedmatches = js.native
}

