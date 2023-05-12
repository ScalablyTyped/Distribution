package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains functions and properties related to gaming squads.
  *
  * @since 7.1
  */
@js.native
trait Squads extends StObject {
  
  /**
    * Fetches the current player's existing squads, if any.
    *
    * @example
    * FBInstant.squads.canUseSquadsAsync()
    *   .then(function(isEligible) {
    *     if (isEligible) {
    *      FBInstant.squads.getAsync(squadID)
    *       .then(function(squad) {
    *       console.log(squad.getID())
    *     });
    *     }
    *   });
    * @returns Whether the current user is eligible to use squads.
    * @throws INVALID_OPERATION
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    */
  def canUseSquadsAsync(): js.Promise[Boolean] = js.native
  
  /**
    * Brings up a dialog for the player to create a Squad. If the player creates the Squad, the promise will
    * resolve with the new Squad instance and the game session will be switched into this newly created Squad
    * context. The promise will reject if the player closes the dialog instead.
    *
    * @example
    * FBInstant.squads.createAsync()
    *   .then(function(squad) {
    *     ...
    *   });
    * @throws INVALID_OPERATION
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    * @throws USER_INPUT
    */
  def createAsync(): js.Promise[GamingSquad] = js.native
  def createAsync(payload: CreateGamingSquadPayload): js.Promise[GamingSquad] = js.native
  
  /**
    * Fetch an existing Squad. If the Squad does not exist, or the player cannot interact with the Squad, this API
    * will reject with the `GAMING_SQUAD_NOT_FOUND` error code.
    *
    * @example
    * FBInstant.squads.getAsync(squadID)
    *   .then(function(squad) {
    *     console.log(squad.getID())
    *   });
    * @param id The squad ID or context ID.
    * @throws GAMING_SQUAD_NOT_FOUND
    * @throws INVALID_OPERATION
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    */
  def getAsync(id: String): js.Promise[GamingSquad] = js.native
  
  /**
    * Fetches the current player's existing squads, if any.
    *
    * @example
    * FBInstant.squads.getPlayerSquadsAsync()
    *   .then(function(squads) {
    *     squads.forEach(squad => console.log(squad.getID()));
    *   });
    * @throws GAMING_SQUAD_NOT_FOUND
    * @throws INVALID_OPERATION
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    */
  def getPlayerSquadsAsync(): js.Promise[js.Array[GamingSquad]] = js.native
}
