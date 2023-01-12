package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instant game tournament.
  */
trait Tournament extends StObject {
  
  /**
    * The unique context ID that is associated with this instant tournament.
    *
    * @returns A unique identifier for the game context.
    */
  def getContextID(): String
  
  /**
    * Timestamp when the instant tournament ends. If the end time is in the past, then the instant tournament is already finished and has expired.
    *
    * @returns A unix timestamp of when the tournament will end.
    * @example
    * FBInstant.getTournamentAsync()
    *   .then((tournament) => {
    *     console.log(tournament.getEndTime());
    *   });
    */
  def getEndTime(): Double
  
  /**
    * The unique ID that is associated with this instant tournament.
    *
    * @returns A unique identifier for the instant tournament.
    */
  def getID(): String
  
  /**
    * Payload of the tournament provided upon the creation of the tournament.
    *
    * This is an optional field that can be set by creating the tournament using the FBInstant.tournament.createAsync() API.
    */
  def getPayload(): Any
  
  /**
    * Title of the tournament provided upon the creation of the tournament.
    *
    * This is an optional field that can be set by creating the tournament using the FBInstant.tournament.createAsync() API.
    * @example
    * FBInstant.getTournamentAsync()
    *   .then((tournament) => {
    *     console.log(tournament.getTitle());
    *   });
    */
  def getTitle(): js.UndefOr[String]
}
object Tournament {
  
  inline def apply(
    getContextID: () => String,
    getEndTime: () => Double,
    getID: () => String,
    getPayload: () => Any,
    getTitle: () => js.UndefOr[String]
  ): Tournament = {
    val __obj = js.Dynamic.literal(getContextID = js.Any.fromFunction0(getContextID), getEndTime = js.Any.fromFunction0(getEndTime), getID = js.Any.fromFunction0(getID), getPayload = js.Any.fromFunction0(getPayload), getTitle = js.Any.fromFunction0(getTitle))
    __obj.asInstanceOf[Tournament]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tournament] (val x: Self) extends AnyVal {
    
    inline def setGetContextID(value: () => String): Self = StObject.set(x, "getContextID", js.Any.fromFunction0(value))
    
    inline def setGetEndTime(value: () => Double): Self = StObject.set(x, "getEndTime", js.Any.fromFunction0(value))
    
    inline def setGetID(value: () => String): Self = StObject.set(x, "getID", js.Any.fromFunction0(value))
    
    inline def setGetPayload(value: () => Any): Self = StObject.set(x, "getPayload", js.Any.fromFunction0(value))
    
    inline def setGetTitle(value: () => js.UndefOr[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
  }
}
