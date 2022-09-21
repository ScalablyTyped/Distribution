package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchStatistic extends StObject {
  
  var game_type: Double
  
  var players_searching: Double | Null
  
  var search_time_avg: Double | Null
}
object SearchStatistic {
  
  inline def apply(game_type: Double): SearchStatistic = {
    val __obj = js.Dynamic.literal(game_type = game_type.asInstanceOf[js.Any], players_searching = null, search_time_avg = null)
    __obj.asInstanceOf[SearchStatistic]
  }
  
  extension [Self <: SearchStatistic](x: Self) {
    
    inline def setGame_type(value: Double): Self = StObject.set(x, "game_type", value.asInstanceOf[js.Any])
    
    inline def setPlayers_searching(value: Double): Self = StObject.set(x, "players_searching", value.asInstanceOf[js.Any])
    
    inline def setPlayers_searchingNull: Self = StObject.set(x, "players_searching", null)
    
    inline def setSearch_time_avg(value: Double): Self = StObject.set(x, "search_time_avg", value.asInstanceOf[js.Any])
    
    inline def setSearch_time_avgNull: Self = StObject.set(x, "search_time_avg", null)
  }
}
