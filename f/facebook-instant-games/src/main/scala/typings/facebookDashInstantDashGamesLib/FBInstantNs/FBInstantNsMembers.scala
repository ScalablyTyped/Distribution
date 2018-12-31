package typings
package facebookDashInstantDashGamesLib.FBInstantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant")
@js.native
object FBInstantNsMembers extends js.Object {
  /**
    * Contains functions and properties related to the current game context.
    */
  var context: Context = js.native
  /**
    * Contains functions and properties related to payments and purchases of game products.
    */
  var payments: Payments = js.native
  /**
    * Contains functions and properties related to the current player.
    */
  var player: Player = js.native
  /**
    * Returns whether or not the user is eligible to have shortcut creation requested.
    *
    * Will return false if createShortcutAsync was already called this session or the user is ineligible for shortcut creation.
    *
    * @returns Promise that resolves with true if the game can request the player create a shortcut to the game, and false otherwise
    * @throws PENDING_REQUEST
    * @throws CLIENT_REQUIRES_UPDATE
    * @throws INVALID_OPERATION
    */
  def canCreateShortcutAsync(): js.Promise[scala.Boolean] = js.native
  /**
    * Checks if the current player is eligible for the matchPlayerAsync API.
    * @returns  A promise that resolves with true if the player is eligible to match with other players and false otherwise.
    * @throws NETWORK_FAILURE
    * @throws CLIENT_UNSUPPORTED_OPERATION
    */
  def checkCanPlayerMatchAsync(): js.Promise[scala.Boolean] = js.native
  /**
    * Prompts the user to create a shortcut to the game if they are eligible to Can only be called once per session. (see canCreateShortcutAsync)
    * @throws USER_INPUT
    * @throws PENDING_REQUEST
    * @throws CLIENT_REQUIRES_UPDATE
    * @throws INVALID_OPERATION
    */
  def createShortcutAsync(): js.Promise[scala.Unit] = js.native
  /**
    * Returns the entry point that the game was launched from.
    * This function should be called after FBInstant.startGameAsync() resolves.
    *
    * @returns The name of the entry point from which the user started the game.
    */
  def getEntryPointAsync(): js.Promise[java.lang.String] = js.native
  /**
    * Returns any data object associated with the entry point that the game was launched from.
    *
    * The contents of the object are developer-defined, and can occur from entry points on different platforms.
    * This will return null for older mobile clients, as well as when there is no data associated with the particular entry point.
    *
    * @returns Data associated with the current entry point.
    */
  def getEntryPointData(): js.Any = js.native
  /**
    * Attempt to create an instance of interstitial ad. This instance can then be preloaded and presented.
    * @param placementID The placement ID that's been setup in your Audience Network settings.
    * @returns A promise that resolves with a AdInstance, or rejects with a APIError if it couldn't be created.
    * @throws ADS_TOO_MANY_INSTANCES
    * @throws CLIENT_UNSUPPORTED_OPERATION
    */
  def getInterstitialAdAsync(placementID: java.lang.String): js.Promise[AdInstance] = js.native
  /**
    * Fetch a specific leaderboard belonging to this Instant Game.
    *
    * @param name The name of the leaderboard. Each leaderboard for an Instant Game must have its own distinct name.
    * @returns A promise that resolves with the matching leaderboard, rejecting if one is not found.
    * @throws LEADERBOARD_NOT_FOUND
    * @throws NETWORK_FAILURE
    * @throws CLIENT_UNSUPPORTED_OPERATION
    * @throws INVALID_OPERATION
    * @throws INVALID_PARAM
    */
  def getLeaderboardAsync(name: java.lang.String): js.Promise[Leaderboard] = js.native
  /**
    * The current locale. Use this to determine what language the current game should be localized with.
    * The value will not be accurate until FBInstant.startGameAsync() resolves.
    *
    * @returns The current locale.
    */
  def getLocale(): java.lang.String | scala.Null = js.native
  /**
    * The platform on which the game is currently running. The value will always be null until FBInstant.initializeAsync() resolves.
    */
  def getPlatform(): Platform | scala.Null = js.native
  /**
    * Attempt to create an instance of rewarded video. This instance can then be preloaded and presented.
    * @param placementID The placement ID that's been setup in your Audience Network settings.
    * @returns A promise that resolves with a AdInstance, or rejects with a APIError if it couldn't be created.
    * @throws ADS_TOO_MANY_INSTANCES
    * @throws CLIENT_UNSUPPORTED_OPERATION
    */
  def getRewardedVideoAsync(placementID: java.lang.String): js.Promise[AdInstance] = js.native
  /**
    * The string representation of this SDK version.
    *
    * @returns The SDK version.
    */
  def getSDKVersion(): java.lang.String = js.native
  /**
    * Provides a list of API functions that are supported by the client.
    *
    * @returns List of API functions that the client explicitly supports.
    */
  def getSupportedAPIs(): js.Array[java.lang.String] = js.native
  /**
    * Initializes the SDK library. This should be called before any other SDK functions.
    *
    * @returns A promise that resolves when the SDK is ready to use.
    * @throws INVALID_OPERATION
    */
  def initializeAsync(): js.Promise[scala.Unit] = js.native
  /**
    * Log an app event with FB Analytics. See https://developers.facebook.com/docs/javascript/reference/v2.8#app_events for more details about FB Analytics.
    *
    * @param eventName Name of the event. Must be 2 to 40 characters, and can only contain '_', '-', ' ', and alphanumeric characters.
    * @param valueToSum An optional numeric value that FB Analytics can calculate a sum with.
    * @param parameters An optional object that can contain up to 25 key-value pairs to be logged with the event. Keys must be 2 to 40 characters,
    * and can only contain '_', '-', ' ', and alphanumeric characters. Values must be less than 100 characters in length.
    * @returns The error if the event failed to log; otherwise returns null.
    */
  def logEvent(eventName: java.lang.String): APIError | scala.Null = js.native
  def logEvent(eventName: java.lang.String, valueToSum: scala.Double): APIError | scala.Null = js.native
  def logEvent(
    eventName: java.lang.String,
    valueToSum: scala.Double,
    parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): APIError | scala.Null = js.native
  /**
    * Attempts to match the current player with other users looking for people to play with. If successful, a new Messenger group
    * thread will be created containing the matched players and the player will be context switched to that thread.
    * The default minimum and maximum number of players in one matched thread are 2 and 20 respectively, depending on how many players
    * are trying to get matched around the same time. The values can be changed in fbapp-config.json. See the
    * [Bundle Config documentation]https://developers.facebook.com/docs/games/instant-games/bundle-config for documentation about fbapp-config.json.
    *
    * @param matchTag Optional extra information about the player used to group them with similar players. Players will only be grouped with other players with exactly the same tag.
    * The tag must only include letters, numbers, and underscores and be 100 characters or less in length.
    * @param switchContextWhenMatched Optional extra parameter that specifies whether the player should be immediately switched to the new context when a match is found.
    * By default this will be false which will mean the player needs explicitly press play after being matched to switch to the new context.
    * @returns A promise that resolves when the player has been added to a group thread and switched into the thread's context.
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    * @throws USER_INPUT
    * @throws PENDING_REQUEST
    * @throws CLIENT_UNSUPPORTED_OPERATION
    * @throws INVALID_OPERATION
    */
  def matchPlayerAsync(): js.Promise[scala.Unit] = js.native
  def matchPlayerAsync(matchTag: java.lang.String): js.Promise[scala.Unit] = js.native
  def matchPlayerAsync(matchTag: java.lang.String, switchContextWhenMatched: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Set a callback to be fired when a pause event is triggered.
    * @param func A function to call when a pause event occurs.
    */
  def onPause(func: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Quits the game.
    */
  def quit(): scala.Unit = js.native
  /**
    * Report the game's initial loading progress.
    *
    * @param percentage A number between 0 and 100.
    */
  def setLoadingProgress(percentage: scala.Double): scala.Unit = js.native
  /**
    * Sets the data associated with the individual gameplay session for the current context.
    *
    * This function should be called whenever the game would like to update the current session data.
    * This session data may be used to populate a variety of payloads, such as game play webhooks.
    *
    * @param sessionData An arbitrary data object, which must be less than or equal to 1000 characters when stringified.
    */
  def setSessionData(sessionData: js.Any): scala.Unit = js.native
  /**
    * This invokes a dialog to let the user share specified content, either as a message in Messenger or as a post on the user's timeline.
    * A blob of data can be attached to the share which every game session launched from the share will be able to access from FBInstant.getEntryPointData().
    * This data must be less than or equal to 1000 characters when stringified. The user may choose to cancel the share action and close the dialog, and the
    * returned promise will resolve when the dialog is closed regardless if the user actually shared the content or not.
    *
    * @param payload Specify what to share. See example for details.
    * @returns A promise that resolves when the share is completed or cancelled.
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    * @throws PENDING_REQUEST
    * @throws CLIENT_UNSUPPORTED_OPERATION
    * @throws INVALID_OPERATION
    */
  def shareAsync(payload: SharePayload): js.Promise[scala.Unit] = js.native
  /**
    * This indicates that the game has finished initial loading and is ready to start.
    * Context information will be up-to-date when the returned promise resolves.
    *
    * @returns A promise that resolves when the game should start.
    * @throws INVALID_PARAM
    * @throws CLIENT_UNSUPPORTED_OPERATION
    */
  def startGameAsync(): js.Promise[scala.Unit] = js.native
  /**
    * Request that the client switch to a different Instant Game. The API will reject if the switch fails - else, the client will load the new game.
    *
    * @param appID The Application ID of the Instant Game to switch to. The application must be an Instant Game, and must belong to the same business as the current game.
    * To associate different games with the same business, you can use Business Manager: https://developers.facebook.com/docs/apps/business-manager#update-business.
    * @param data An optional data payload. This will be set as the entrypoint data for the game being switched to. Must be less than or equal to 1000 characters when stringified.
    * @throws USER_INPUT
    * @throws INVALID_PARAM
    * @throws PENDING_REQUEST
    * @throws CLIENT_REQUIRES_UPDATE
    */
  def switchGameAsync(appID: java.lang.String): js.Promise[scala.Unit] = js.native
  def switchGameAsync(appID: java.lang.String, data: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Informs Facebook of an update that occurred in the game. This will temporarily yield control to Facebook and Facebook will decide what to do based on what the update is.
    * The returned promise will resolve/reject when Facebook returns control to the game.
    *
    * @param payload A payload that describes the update.
    * @returns A promise that resolves when Facebook gives control back to the game.
    * @throws INVALID_PARAM
    * @throws PENDING_REQUEST
    * @throws INVALID_OPERATION
    */
  def updateAsync(payload: CustomUpdatePayload): js.Promise[scala.Unit] = js.native
  def updateAsync(payload: LeaderboardUpdatePayload): js.Promise[scala.Unit] = js.native
}

