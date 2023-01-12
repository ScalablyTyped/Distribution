package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalStats extends StObject {
  
  var active_survey_id: Double
  
  var active_tournament_eventid: Double
  
  var main_post_url: String
  
  var ongoing_matches: Double
  
  var players_online: Double
  
  var players_searching: Double
  
  var pricesheet_version: Double
  
  var required_appid_version: Double
  
  var rtime32_cur: Any | Null
  
  var rtime32_event_start: Any | Null
  
  var search_statistics: js.Array[SearchStatistic]
  
  var search_time_avg: Double
  
  var servers_available: Double
  
  var servers_online: Double
  
  var twitch_streams_version: Double
}
object GlobalStats {
  
  inline def apply(
    active_survey_id: Double,
    active_tournament_eventid: Double,
    main_post_url: String,
    ongoing_matches: Double,
    players_online: Double,
    players_searching: Double,
    pricesheet_version: Double,
    required_appid_version: Double,
    search_statistics: js.Array[SearchStatistic],
    search_time_avg: Double,
    servers_available: Double,
    servers_online: Double,
    twitch_streams_version: Double
  ): GlobalStats = {
    val __obj = js.Dynamic.literal(active_survey_id = active_survey_id.asInstanceOf[js.Any], active_tournament_eventid = active_tournament_eventid.asInstanceOf[js.Any], main_post_url = main_post_url.asInstanceOf[js.Any], ongoing_matches = ongoing_matches.asInstanceOf[js.Any], players_online = players_online.asInstanceOf[js.Any], players_searching = players_searching.asInstanceOf[js.Any], pricesheet_version = pricesheet_version.asInstanceOf[js.Any], required_appid_version = required_appid_version.asInstanceOf[js.Any], search_statistics = search_statistics.asInstanceOf[js.Any], search_time_avg = search_time_avg.asInstanceOf[js.Any], servers_available = servers_available.asInstanceOf[js.Any], servers_online = servers_online.asInstanceOf[js.Any], twitch_streams_version = twitch_streams_version.asInstanceOf[js.Any], rtime32_cur = null, rtime32_event_start = null)
    __obj.asInstanceOf[GlobalStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalStats] (val x: Self) extends AnyVal {
    
    inline def setActive_survey_id(value: Double): Self = StObject.set(x, "active_survey_id", value.asInstanceOf[js.Any])
    
    inline def setActive_tournament_eventid(value: Double): Self = StObject.set(x, "active_tournament_eventid", value.asInstanceOf[js.Any])
    
    inline def setMain_post_url(value: String): Self = StObject.set(x, "main_post_url", value.asInstanceOf[js.Any])
    
    inline def setOngoing_matches(value: Double): Self = StObject.set(x, "ongoing_matches", value.asInstanceOf[js.Any])
    
    inline def setPlayers_online(value: Double): Self = StObject.set(x, "players_online", value.asInstanceOf[js.Any])
    
    inline def setPlayers_searching(value: Double): Self = StObject.set(x, "players_searching", value.asInstanceOf[js.Any])
    
    inline def setPricesheet_version(value: Double): Self = StObject.set(x, "pricesheet_version", value.asInstanceOf[js.Any])
    
    inline def setRequired_appid_version(value: Double): Self = StObject.set(x, "required_appid_version", value.asInstanceOf[js.Any])
    
    inline def setRtime32_cur(value: Any): Self = StObject.set(x, "rtime32_cur", value.asInstanceOf[js.Any])
    
    inline def setRtime32_curNull: Self = StObject.set(x, "rtime32_cur", null)
    
    inline def setRtime32_event_start(value: Any): Self = StObject.set(x, "rtime32_event_start", value.asInstanceOf[js.Any])
    
    inline def setRtime32_event_startNull: Self = StObject.set(x, "rtime32_event_start", null)
    
    inline def setSearch_statistics(value: js.Array[SearchStatistic]): Self = StObject.set(x, "search_statistics", value.asInstanceOf[js.Any])
    
    inline def setSearch_statisticsVarargs(value: SearchStatistic*): Self = StObject.set(x, "search_statistics", js.Array(value*))
    
    inline def setSearch_time_avg(value: Double): Self = StObject.set(x, "search_time_avg", value.asInstanceOf[js.Any])
    
    inline def setServers_available(value: Double): Self = StObject.set(x, "servers_available", value.asInstanceOf[js.Any])
    
    inline def setServers_online(value: Double): Self = StObject.set(x, "servers_online", value.asInstanceOf[js.Any])
    
    inline def setTwitch_streams_version(value: Double): Self = StObject.set(x, "twitch_streams_version", value.asInstanceOf[js.Any])
  }
}
