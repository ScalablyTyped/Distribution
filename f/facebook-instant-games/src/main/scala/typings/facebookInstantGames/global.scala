package typings.facebookInstantGames

import org.scalablytyped.runtime.StringDictionary
import typings.facebookInstantGames.FBInstant.APIError
import typings.facebookInstantGames.FBInstant.AdInstance
import typings.facebookInstantGames.FBInstant.Context
import typings.facebookInstantGames.FBInstant.CustomUpdatePayload
import typings.facebookInstantGames.FBInstant.InvitePayload
import typings.facebookInstantGames.FBInstant.Leaderboard
import typings.facebookInstantGames.FBInstant.LeaderboardUpdatePayload
import typings.facebookInstantGames.FBInstant.Payments
import typings.facebookInstantGames.FBInstant.Platform
import typings.facebookInstantGames.FBInstant.Player
import typings.facebookInstantGames.FBInstant.SharePayload
import typings.facebookInstantGames.FBInstant.Tournament
import typings.facebookInstantGames.FBInstant.Tournaments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object FBInstant {
    
    @JSGlobal("FBInstant")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def canCreateShortcutAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("canCreateShortcutAsync")().asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Checks if the current player is eligible for the matchPlayerAsync API.
      * @returns  A promise that resolves with true if the player is eligible to match with other players and false otherwise.
      * @throws NETWORK_FAILURE
      * @throws CLIENT_UNSUPPORTED_OPERATION
      */
    inline def checkCanPlayerMatchAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkCanPlayerMatchAsync")().asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Contains functions and properties related to the current game context.
      */
    @JSGlobal("FBInstant.context")
    @js.native
    def context: Context = js.native
    inline def context_=(x: Context): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("context")(x.asInstanceOf[js.Any])
    
    /**
      * Prompts the user to create a shortcut to the game if they are eligible to Can only be called once per session. (see canCreateShortcutAsync)
      * @throws USER_INPUT
      * @throws PENDING_REQUEST
      * @throws CLIENT_REQUIRES_UPDATE
      * @throws INVALID_OPERATION
      */
    inline def createShortcutAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createShortcutAsync")().asInstanceOf[js.Promise[Unit]]
    
    /**
      * Returns the entry point that the game was launched from.
      * This function should be called after FBInstant.startGameAsync() resolves.
      *
      * @returns The name of the entry point from which the user started the game.
      */
    inline def getEntryPointAsync(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntryPointAsync")().asInstanceOf[js.Promise[String]]
    
    /**
      * Returns any data object associated with the entry point that the game was launched from.
      *
      * The contents of the object are developer-defined, and can occur from entry points on different platforms.
      * This will return null for older mobile clients, as well as when there is no data associated with the particular entry point.
      *
      * @returns Data associated with the current entry point.
      */
    inline def getEntryPointData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntryPointData")().asInstanceOf[Any]
    
    /**
      * Attempt to create an instance of interstitial ad. This instance can then be preloaded and presented.
      * @param placementID The placement ID that's been setup in your Audience Network settings.
      * @returns A promise that resolves with a AdInstance, or rejects with a APIError if it couldn't be created.
      * @throws ADS_TOO_MANY_INSTANCES
      * @throws CLIENT_UNSUPPORTED_OPERATION
      */
    inline def getInterstitialAdAsync(placementID: String): js.Promise[AdInstance] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterstitialAdAsync")(placementID.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AdInstance]]
    
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
    inline def getLeaderboardAsync(name: String): js.Promise[Leaderboard] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeaderboardAsync")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Leaderboard]]
    
    /**
      * The current locale. Use this to determine what language the current game should be localized with.
      * The value will not be accurate until FBInstant.startGameAsync() resolves.
      *
      * @returns The current locale.
      */
    inline def getLocale(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocale")().asInstanceOf[String | Null]
    
    /**
      * The platform on which the game is currently running. The value will always be null until FBInstant.initializeAsync() resolves.
      */
    inline def getPlatform(): Platform | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatform")().asInstanceOf[Platform | Null]
    
    /**
      * Attempt to create an instance of rewarded video. This instance can then be preloaded and presented.
      * @param placementID The placement ID that's been setup in your Audience Network settings.
      * @returns A promise that resolves with a AdInstance, or rejects with a APIError if it couldn't be created.
      * @throws ADS_TOO_MANY_INSTANCES
      * @throws CLIENT_UNSUPPORTED_OPERATION
      */
    inline def getRewardedVideoAsync(placementID: String): js.Promise[AdInstance] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRewardedVideoAsync")(placementID.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AdInstance]]
    
    /**
      * The string representation of this SDK version.
      *
      * @returns The SDK version.
      */
    inline def getSDKVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSDKVersion")().asInstanceOf[String]
    
    /**
      * Provides a list of API functions that are supported by the client.
      *
      * @returns List of API functions that the client explicitly supports.
      */
    inline def getSupportedAPIs(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedAPIs")().asInstanceOf[js.Array[String]]
    
    /**
      * Fetch the instant tournament out of the current context the user is playing.
      *
      * This will reject if there is no instant tournament link to the current context.
      * The instant tournament returned can be either active or expired (An instant tournament is expired if its end time is in the past).
      * For each instant tournament, there is only one unique context ID linked to it, and that ID doesn't change.
      *
      * @returns Promise<Tournament>
      * @throws PENDING_REQUEST
      * @throws NETWORK_FAILURE
      * @throws INVALID_OPERATION
      * @throws TOURNAMENT_NOT_FOUND
      * @example
      * FBInstant.getTournamentAsync()
      *   .then((tournament) => {
      *      console.log(tournament.getContextID());
      *      console.log(tournament.getEndTime());
      *   });
      */
    inline def getTournamentAsync(): js.Promise[Tournament] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTournamentAsync")().asInstanceOf[js.Promise[Tournament]]
    
    /**
      * Initializes the SDK library. This should be called before any other SDK functions.
      *
      * @returns A promise that resolves when the SDK is ready to use.
      * @throws INVALID_OPERATION
      */
    inline def initializeAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAsync")().asInstanceOf[js.Promise[Unit]]
    
    /**
      * This invokes a dialog to let the user invite one or more people to the game.
      *
      * A blob of data can be attached to the share which every game session launched from the invite will be able to access from FBInstant.getEntryPointData().
      * This data must be less than or equal to 1000 characters when stringified.
      * The user may choose to cancel the action and close the dialog, and the returned promise will resolve when the dialog is closed regardless if
      * the user actually invited people or not.
      *
      * @param payload Specify what to share. See example for details.
      * @returns A promise that resolves when the share is completed or cancelled.
      * @throws INVALID_PARAM
      * @throws NETWORK_FAILURE
      * @throws PENDING_REQUEST
      * @throws CLIENT_UNSUPPORTED_OPERATION
      * @throws INVALID_OPERATION
      */
    inline def inviteAsync(payload: InvitePayload): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("inviteAsync")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Log an app event with FB Analytics. See https://developers.facebook.com/docs/javascript/reference/v2.8#app_events for more details about FB Analytics.
      *
      * @param eventName Name of the event. Must be 2 to 40 characters, and can only contain '_', '-', ' ', and alphanumeric characters.
      * @param valueToSum An optional numeric value that FB Analytics can calculate a sum with.
      * @param parameters An optional object that can contain up to 25 key-value pairs to be logged with the event. Keys must be 2 to 40 characters,
      * and can only contain '_', '-', ' ', and alphanumeric characters. Values must be less than 100 characters in length.
      * @returns The error if the event failed to log; otherwise returns null.
      */
    inline def logEvent(eventName: String): APIError | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[APIError | Null]
    inline def logEvent(eventName: String, valueToSum: Double): APIError | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(eventName.asInstanceOf[js.Any], valueToSum.asInstanceOf[js.Any])).asInstanceOf[APIError | Null]
    inline def logEvent(eventName: String, valueToSum: Double, parameters: StringDictionary[String]): APIError | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(eventName.asInstanceOf[js.Any], valueToSum.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[APIError | Null]
    inline def logEvent(eventName: String, valueToSum: Unit, parameters: StringDictionary[String]): APIError | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(eventName.asInstanceOf[js.Any], valueToSum.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[APIError | Null]
    
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
      * @param offlineMatch Optional extra parameter that specifies whether to start a match asynchronously. By default this will be false which means the game will start a match synchronously.
      * @returns A promise that resolves when the player has been added to a group thread and switched into the thread's context.
      * @throws INVALID_PARAM
      * @throws NETWORK_FAILURE
      * @throws USER_INPUT
      * @throws PENDING_REQUEST
      * @throws CLIENT_UNSUPPORTED_OPERATION
      * @throws INVALID_OPERATION
      */
    inline def matchPlayerAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchPlayerAsync")().asInstanceOf[js.Promise[Unit]]
    inline def matchPlayerAsync(matchTag: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchPlayerAsync")(matchTag.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def matchPlayerAsync(matchTag: String, switchContextWhenMatched: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPlayerAsync")(matchTag.asInstanceOf[js.Any], switchContextWhenMatched.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def matchPlayerAsync(matchTag: String, switchContextWhenMatched: Boolean, offlineMatch: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPlayerAsync")(matchTag.asInstanceOf[js.Any], switchContextWhenMatched.asInstanceOf[js.Any], offlineMatch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def matchPlayerAsync(matchTag: String, switchContextWhenMatched: Unit, offlineMatch: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPlayerAsync")(matchTag.asInstanceOf[js.Any], switchContextWhenMatched.asInstanceOf[js.Any], offlineMatch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def matchPlayerAsync(matchTag: Unit, switchContextWhenMatched: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPlayerAsync")(matchTag.asInstanceOf[js.Any], switchContextWhenMatched.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def matchPlayerAsync(matchTag: Unit, switchContextWhenMatched: Boolean, offlineMatch: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPlayerAsync")(matchTag.asInstanceOf[js.Any], switchContextWhenMatched.asInstanceOf[js.Any], offlineMatch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def matchPlayerAsync(matchTag: Unit, switchContextWhenMatched: Unit, offlineMatch: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPlayerAsync")(matchTag.asInstanceOf[js.Any], switchContextWhenMatched.asInstanceOf[js.Any], offlineMatch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Set a callback to be fired when a pause event is triggered.
      * @param func A function to call when a pause event occurs.
      */
    inline def onPause(func: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPause")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Contains functions and properties related to payments and purchases of game products.
      */
    @JSGlobal("FBInstant.payments")
    @js.native
    def payments: Payments = js.native
    inline def payments_=(x: Payments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("payments")(x.asInstanceOf[js.Any])
    
    /**
      * Requests and performs haptic feedback on supported devices.
      *
      * @returns haptic feedback requested successfully
      * @throws CLIENT_UNSUPPORTED_OPERATION
      * @throws INVALID_OPERATION
      * @example
      * FBInstant.performHapticFeedbackAsync();
      */
    inline def performHapticFeedbackAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("performHapticFeedbackAsync")().asInstanceOf[js.Promise[Unit]]
    
    /**
      * Contains functions and properties related to the current player.
      */
    @JSGlobal("FBInstant.player")
    @js.native
    def player: Player = js.native
    inline def player_=(x: Player): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("player")(x.asInstanceOf[js.Any])
    
    /**
      * Posts a player's score to Facebook and resolves when score has been posted.
      *
      * This API should only be called at the end of an activity (example: when the player doesn't have "lives" to continue the game).
      * This API will be rate-limited when called too frequently. Scores posted using this API should be consistent and comparable across game sessions.
      * For example, if Player A achieves 200 points in a session, and Player B achieves 320 points in a session, those two scores should be generated
      * from activities where the scores are fair to be compared and ranked against each other.
      *
      * @param score An integer value representing the player's score at the end of an activity.
      * @returns A promise that resolves when all platform behavior (such as dialogs) generated from the posted score has completed, and the game should resume.
      * If the behavior resulted in a social context change, that will be reflected by the time the Promise resolves.
      */
    inline def postSessionScoreAsync(score: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("postSessionScoreAsync")(score.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Quits the game.
      */
    inline def quit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("quit")().asInstanceOf[Unit]
    
    /**
      * Report the game's initial loading progress.
      *
      * @param percentage A number between 0 and 100.
      */
    inline def setLoadingProgress(percentage: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLoadingProgress")(percentage.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Sets the data associated with the individual gameplay session for the current context.
      *
      * This function should be called whenever the game would like to update the current session data.
      * This session data may be used to populate a variety of payloads, such as game play webhooks.
      *
      * @param sessionData An arbitrary data object, which must be less than or equal to 1000 characters when stringified.
      */
    inline def setSessionData(sessionData: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSessionData")(sessionData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def shareAsync(payload: SharePayload): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareAsync")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * This indicates that the game has finished initial loading and is ready to start.
      * Context information will be up-to-date when the returned promise resolves.
      *
      * @returns A promise that resolves when the game should start.
      * @throws INVALID_PARAM
      * @throws CLIENT_UNSUPPORTED_OPERATION
      */
    inline def startGameAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("startGameAsync")().asInstanceOf[js.Promise[Unit]]
    
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
    inline def switchGameAsync(appID: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchGameAsync")(appID.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def switchGameAsync(appID: String, data: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchGameAsync")(appID.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Contains functions and properties related to tournaments.
      */
    @JSGlobal("FBInstant.tournament")
    @js.native
    def tournament: Tournaments = js.native
    inline def tournament_=(x: Tournaments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tournament")(x.asInstanceOf[js.Any])
    
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
    inline def updateAsync(payload: CustomUpdatePayload): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateAsync")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def updateAsync(payload: LeaderboardUpdatePayload): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateAsync")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
}
