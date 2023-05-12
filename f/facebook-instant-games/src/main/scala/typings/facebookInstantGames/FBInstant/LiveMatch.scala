package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instant game live match that is played in a Messenger Rooms call simultaneously by all the participants.
  *
  * @since 7.1
  */
trait LiveMatch extends StObject {
  
  /**
    * Retrieves a list of players currently active in the match.
    *
    * @example
    * FBInstant.room.getCurrentMatchAsync()
    *   .then(function(match) {
    *     match.getActiveParticipantsAsync().then(activeParticipants => GameMatch.updatePlayers(activeParticipants))
    *   });
    */
  def getActiveParticipantsAsync(): js.Promise[js.Array[LiveMatchPlayer]]
  
  /**
    * The unique context ID that is associated with this live match.
    *
    * @example
    * FBInstant.room.getCurrentMatchAsync()
    *   .then(function(match) {
    *     console.log(match.getContextID());
    *   });
    * @returns The context ID for this live match.
    */
  def getContextID(): String
  
  /**
    * The unique live match ID.
    *
    * @example
    * FBInstant.room.getCurrentMatchAsync()
    *   .then(function(match) {
    *     console.log(match.getID());
    *   });
    * @returns The live match ID.
    */
  def getID(): String
  
  /**
    * The current status of the live match, for example: `PENDING`, `ABANDONED`, `CONCLUDED`, `RUNNING`.
    *
    * @example
    * FBInstant.room.getCurrentMatchAsync()
    *   .then(function(match) {
    *     match.getStatusAsync().then(status => console.log(status));
    *   });
    * @returns The status of the live match.
    */
  def getStatusAsync(): js.Promise[LiveMatchStatusType]
}
object LiveMatch {
  
  inline def apply(
    getActiveParticipantsAsync: () => js.Promise[js.Array[LiveMatchPlayer]],
    getContextID: () => String,
    getID: () => String,
    getStatusAsync: () => js.Promise[LiveMatchStatusType]
  ): LiveMatch = {
    val __obj = js.Dynamic.literal(getActiveParticipantsAsync = js.Any.fromFunction0(getActiveParticipantsAsync), getContextID = js.Any.fromFunction0(getContextID), getID = js.Any.fromFunction0(getID), getStatusAsync = js.Any.fromFunction0(getStatusAsync))
    __obj.asInstanceOf[LiveMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiveMatch] (val x: Self) extends AnyVal {
    
    inline def setGetActiveParticipantsAsync(value: () => js.Promise[js.Array[LiveMatchPlayer]]): Self = StObject.set(x, "getActiveParticipantsAsync", js.Any.fromFunction0(value))
    
    inline def setGetContextID(value: () => String): Self = StObject.set(x, "getContextID", js.Any.fromFunction0(value))
    
    inline def setGetID(value: () => String): Self = StObject.set(x, "getID", js.Any.fromFunction0(value))
    
    inline def setGetStatusAsync(value: () => js.Promise[LiveMatchStatusType]): Self = StObject.set(x, "getStatusAsync", js.Any.fromFunction0(value))
  }
}
