package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ranking extends StObject {
  
  var account_id: Double
  
  /**
    * Seems to alway be `null`
    */
  var rank_change: Null
  
  /**
    * Rank (0-18), starting at 0 for unranked
    */
  var rank_id: Double
  
  /**
    * Rank type (6: Matchmaking, 7: Wingman, 10: Danger Zone)
    */
  var rank_type_id: Double
  
  var wins: Double
}
object Ranking {
  
  inline def apply(account_id: Double, rank_change: Null, rank_id: Double, rank_type_id: Double, wins: Double): Ranking = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], rank_change = rank_change.asInstanceOf[js.Any], rank_id = rank_id.asInstanceOf[js.Any], rank_type_id = rank_type_id.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ranking]
  }
  
  extension [Self <: Ranking](x: Self) {
    
    inline def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setRank_change(value: Null): Self = StObject.set(x, "rank_change", value.asInstanceOf[js.Any])
    
    inline def setRank_id(value: Double): Self = StObject.set(x, "rank_id", value.asInstanceOf[js.Any])
    
    inline def setRank_type_id(value: Double): Self = StObject.set(x, "rank_type_id", value.asInstanceOf[js.Any])
    
    inline def setWins(value: Double): Self = StObject.set(x, "wins", value.asInstanceOf[js.Any])
  }
}
