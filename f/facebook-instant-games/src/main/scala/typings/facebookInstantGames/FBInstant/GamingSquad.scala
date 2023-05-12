package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of a group of players playing together in a messenger thread.
  *
  * @since 7.1
  */
@js.native
trait GamingSquad extends StObject {
  
  /**
    * Brings up a dialog for the player to add their friends to the current squad.
    *
    * @example
    * FBInstant.squads.getAsync(squadID)
    *   .then(function(squad) {
    *     squad.addToSquadAsync().then(...)
    *   });
    * @throws INVALID_OPERATION
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    * @throws USER_INPUT
    */
  def addToSquadAsync(): js.Promise[Unit] = js.native
  def addToSquadAsync(payload: AddToGamingSquadPayload): js.Promise[Unit] = js.native
  
  /**
    * The unique context ID that is associated with this gaming squad.
    *
    * @example
    * FBInstant.squads.getAsync(id)
    *   .then(function(squad) {
    *     console.log(squad.getContextID());
    *   });
    * @returns The context ID for this gaming squad.
    */
  def getContextID(): String = js.native
  
  /**
    * The unique gaming squad ID.
    *
    * @example
    * FBInstant.squads.getAsync(contextID)
    *   .then(function(squad) {
    *     console.log(squad.getID());
    *   });
    * @returns The gaming squad ID.
    */
  def getID(): String = js.native
  
  /**
    * The URI for the gaming squad image.
    *
    * @example
    * FBInstant.squads.getAsync(contextID)
    *   .then(function(squad) {
    *     console.log(squad.getImage());
    *   });
    * @returns URI for gaming squad image.
    */
  def getImage(): String = js.native
  
  /**
    * The gaming squad name.
    *
    * @example
    * FBInstant.squads.getAsync(contextID)
    *   .then(function(squad) {
    *     console.log(squad.getName());
    *   });
    * @returns The name of the squad.
    */
  def getName(): String = js.native
  
  /**
    * Brings up a dialog for the player to join a Squad if they are not part of it. If the user accepts, they
    * become part of the squad thread and the game context switches into the squad. If they are part of the Squad
    * already, the dialog will prompt the user to switch into the Squad context.
    *
    * @example
    * FBInstant.squads.getAsync(squadID)
    *   .then(function(squad) {
    *     squad.joinAsync().then(...)
    *   });
    * @throws INVALID_OPERATION
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    * @throws USER_INPUT
    */
  def joinAsync(): js.Promise[Unit] = js.native
  def joinAsync(payload: JoinGamingSquadPayload): js.Promise[Unit] = js.native
  
  /**
    * Brings up a dialog for the player to confirm if they want to leave the Squad. If the player confirms, they
    * are removed from the Squad and the messenger thread that is associated with this Squad.
    *
    * @example
    * FBInstant.squads.getAsync(squadID)
    *   .then(function(squad) {
    *     squad.leaveAsync().then(...)
    *   });
    * @throws INVALID_OPERATION
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    * @throws USER_INPUT
    */
  def leaveAsync(): js.Promise[Unit] = js.native
  def leaveAsync(payload: LeaveGamingSquadPayload): js.Promise[Unit] = js.native
}
