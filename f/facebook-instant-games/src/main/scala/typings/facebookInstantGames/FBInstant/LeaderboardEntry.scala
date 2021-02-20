package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A score entry for an Instant Game leaderboard
  */
@js.native
trait LeaderboardEntry extends StObject {
  
  /**
    * Gets the developer-specified payload associated with the score, or null if one was not set.
    * @returns An optional developer-specified payload associated with the score.
    */
  def getExtraData(): String | Null = js.native
  
  /**
    * Gets the score associated with the entry, formatted with the score format associated with the leaderboard.
    * @returns Returns a formatted score.
    */
  def getFormattedScore(): String = js.native
  
  /**
    * Gets information about the player associated with the entry.
    */
  def getPlayer(): LeaderboardPlayer = js.native
  
  /**
    * Gets the rank of the player's score in the leaderboard
    * @returns Returns the entry's leaderboard ranking.
    */
  def getRank(): Double = js.native
  
  /**
    * Gets the score associated with the entry.
    * @returns Returns an integer score value.
    */
  def getScore(): Double = js.native
  
  /**
    * Gets the timestamp of when the leaderboard entry was last updated.
    * @returns Returns a Unix timestamp.
    */
  def getTimestamp(): Double = js.native
}
object LeaderboardEntry {
  
  @scala.inline
  def apply(
    getExtraData: () => String | Null,
    getFormattedScore: () => String,
    getPlayer: () => LeaderboardPlayer,
    getRank: () => Double,
    getScore: () => Double,
    getTimestamp: () => Double
  ): LeaderboardEntry = {
    val __obj = js.Dynamic.literal(getExtraData = js.Any.fromFunction0(getExtraData), getFormattedScore = js.Any.fromFunction0(getFormattedScore), getPlayer = js.Any.fromFunction0(getPlayer), getRank = js.Any.fromFunction0(getRank), getScore = js.Any.fromFunction0(getScore), getTimestamp = js.Any.fromFunction0(getTimestamp))
    __obj.asInstanceOf[LeaderboardEntry]
  }
  
  @scala.inline
  implicit class LeaderboardEntryMutableBuilder[Self <: LeaderboardEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetExtraData(value: () => String | Null): Self = StObject.set(x, "getExtraData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormattedScore(value: () => String): Self = StObject.set(x, "getFormattedScore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlayer(value: () => LeaderboardPlayer): Self = StObject.set(x, "getPlayer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRank(value: () => Double): Self = StObject.set(x, "getRank", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScore(value: () => Double): Self = StObject.set(x, "getScore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimestamp(value: () => Double): Self = StObject.set(x, "getTimestamp", js.Any.fromFunction0(value))
  }
}
