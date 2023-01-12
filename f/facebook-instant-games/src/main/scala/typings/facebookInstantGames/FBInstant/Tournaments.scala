package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains functions and properties related to instant tournaments.
  */
trait Tournaments extends StObject {
  
  /**
    * Opens the tournament creation dialog if the player is not currently in a tournament session
    *
    * @param payload CreateTournamentPayload
    * @returns Promise<Tournament>
    * @throws INVALID_PARAM
    * @throws INVALID_OPERATION
    * @throws DUPLICATE_POST
    * @throws NETWORK_FAILURE
    */
  def createAsync(payload: CreateTournamentPayload): js.Promise[Tournament]
  
  /**
    * Returns a list of eligible tournaments that can be surfaced in-game, including tournaments:
    *  1) the player has created;
    *  2) the player is participating in;
    *  3) the player's friends (who granted permission) are participating in.
    *
    * The instant tournaments returned are active. An instant tournament is expired if its end time is in the past.
    * For each instant tournament, there is only one unique context ID linked to it, and that ID doesn't change.
    *
    * @returns Promise<Tournament[]>
    * @throws NETWORK_FAILURE
    * @throws INVALID_OPERATION
    */
  def getTournamentsAsync(): js.Promise[js.Array[Tournament]]
  
  /**
    * Requests a switch into a specific tournament context. The promise will resolve when the game has switched into the specified context.
    *
    * @param tournamentID The Tournament ID of the desired context to switch into.
    * @returns A promise that resolves when the game has switched into the specified tournament context, or rejects otherwise.
    * @throws INVALID_OPERATION
    * @throws INVALID_PARAM
    * @throws SAME_CONTEXT
    * @throws NETWORK_FAILURE
    * @throws USER_INPUT
    * @throws TOURNAMENT_NOT_FOUND
    */
  def joinAsync(tournamentID: String): js.Promise[Unit]
  
  /**
    * Posts a player's score to Facebook.
    *
    * This API should only be called within a tournament context at the end of an activity (example: when the player doesn't have "lives" to continue the game).
    * This API will be rate-limited when called too frequently. Scores posted using this API should be consistent and comparable across game sessions.
    * For example, if Player A achieves 200 points in a session, and Player B achieves 320 points in a session, those two scores should be generated
    * from activities where the scores are fair to be compared and ranked against each other.
    *
    * @param score An integer value representing the player's score at the end of an activity.
    * @returns A promise that resolves when the score post is completed.
    * @throws INVALID_PARAM
    * @throws TOURNAMENT_NOT_FOUND
    * @throws NETWORK_FAILURE
    */
  def postScoreAsync(score: Double): js.Promise[Unit]
  
  /**
    * Opens the reshare tournament dialog if the player is currently in a tournament session
    *
    * Posts a player’s score to Facebook, and renders a tournament share dialog if the player is currently in a tournament session.
    * The promise will resolve when the user action is completed.
    *
    * @param payload Specifies share content. See example for details.
    * @returns A promise that resolves if the tournament is shared, or rejects otherwise.
    * @throws INVALID_OPERATION
    * @throws TOURNAMENT_NOT_FOUND
    * @throws NETWORK_FAILURE
    * @throws USER_INPUT
    */
  def shareAsync(payload: ShareTournamentPayload): js.Promise[Unit]
}
object Tournaments {
  
  inline def apply(
    createAsync: CreateTournamentPayload => js.Promise[Tournament],
    getTournamentsAsync: () => js.Promise[js.Array[Tournament]],
    joinAsync: String => js.Promise[Unit],
    postScoreAsync: Double => js.Promise[Unit],
    shareAsync: ShareTournamentPayload => js.Promise[Unit]
  ): Tournaments = {
    val __obj = js.Dynamic.literal(createAsync = js.Any.fromFunction1(createAsync), getTournamentsAsync = js.Any.fromFunction0(getTournamentsAsync), joinAsync = js.Any.fromFunction1(joinAsync), postScoreAsync = js.Any.fromFunction1(postScoreAsync), shareAsync = js.Any.fromFunction1(shareAsync))
    __obj.asInstanceOf[Tournaments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tournaments] (val x: Self) extends AnyVal {
    
    inline def setCreateAsync(value: CreateTournamentPayload => js.Promise[Tournament]): Self = StObject.set(x, "createAsync", js.Any.fromFunction1(value))
    
    inline def setGetTournamentsAsync(value: () => js.Promise[js.Array[Tournament]]): Self = StObject.set(x, "getTournamentsAsync", js.Any.fromFunction0(value))
    
    inline def setJoinAsync(value: String => js.Promise[Unit]): Self = StObject.set(x, "joinAsync", js.Any.fromFunction1(value))
    
    inline def setPostScoreAsync(value: Double => js.Promise[Unit]): Self = StObject.set(x, "postScoreAsync", js.Any.fromFunction1(value))
    
    inline def setShareAsync(value: ShareTournamentPayload => js.Promise[Unit]): Self = StObject.set(x, "shareAsync", js.Any.fromFunction1(value))
  }
}
