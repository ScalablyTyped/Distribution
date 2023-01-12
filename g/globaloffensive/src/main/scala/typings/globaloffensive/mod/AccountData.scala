package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region AccountData
trait AccountData extends StObject {
  
  var account_id: Double
  
  var activity: Any | Null
  
  var commendation: Commendation
  
  var global_stats: GlobalStats
  
  /**
    * Achievement medals, their ranks and coins
    */
  var medals: Medals | Null
  
  var my_current_event: Any | Null
  
  var my_current_event_stages: js.Array[Any]
  
  var my_current_event_teams: js.Array[Any]
  
  var my_current_team: Any | Null
  
  var ongoingmatch: Any | Null
  
  var penalty_reason: Any | Null
  
  var penalty_seconds: Double | Null
  
  /**
    * Current XP, starting at 327680000 (level % = (player_cur_xp - 327680000) / 5000)
    */
  var player_cur_xp: Double
  
  /**
    * Private rank level
    */
  var player_level: Double
  
  /**
    * Seems to alway be `null`
    */
  var player_xp_bonus_flags: Null
  
  var ranking: Ranking | Null
  
  var rankings: js.Array[Ranking]
  
  var survey_vote: Any | Null
  
  var vac_banned: Double | Null
}
object AccountData {
  
  inline def apply(
    account_id: Double,
    commendation: Commendation,
    global_stats: GlobalStats,
    my_current_event_stages: js.Array[Any],
    my_current_event_teams: js.Array[Any],
    player_cur_xp: Double,
    player_level: Double,
    player_xp_bonus_flags: Null,
    rankings: js.Array[Ranking]
  ): AccountData = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], commendation = commendation.asInstanceOf[js.Any], global_stats = global_stats.asInstanceOf[js.Any], my_current_event_stages = my_current_event_stages.asInstanceOf[js.Any], my_current_event_teams = my_current_event_teams.asInstanceOf[js.Any], player_cur_xp = player_cur_xp.asInstanceOf[js.Any], player_level = player_level.asInstanceOf[js.Any], player_xp_bonus_flags = player_xp_bonus_flags.asInstanceOf[js.Any], rankings = rankings.asInstanceOf[js.Any], activity = null, medals = null, my_current_event = null, my_current_team = null, ongoingmatch = null, penalty_reason = null, penalty_seconds = null, ranking = null, survey_vote = null, vac_banned = null)
    __obj.asInstanceOf[AccountData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountData] (val x: Self) extends AnyVal {
    
    inline def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setActivity(value: Any): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityNull: Self = StObject.set(x, "activity", null)
    
    inline def setCommendation(value: Commendation): Self = StObject.set(x, "commendation", value.asInstanceOf[js.Any])
    
    inline def setGlobal_stats(value: GlobalStats): Self = StObject.set(x, "global_stats", value.asInstanceOf[js.Any])
    
    inline def setMedals(value: Medals): Self = StObject.set(x, "medals", value.asInstanceOf[js.Any])
    
    inline def setMedalsNull: Self = StObject.set(x, "medals", null)
    
    inline def setMy_current_event(value: Any): Self = StObject.set(x, "my_current_event", value.asInstanceOf[js.Any])
    
    inline def setMy_current_eventNull: Self = StObject.set(x, "my_current_event", null)
    
    inline def setMy_current_event_stages(value: js.Array[Any]): Self = StObject.set(x, "my_current_event_stages", value.asInstanceOf[js.Any])
    
    inline def setMy_current_event_stagesVarargs(value: Any*): Self = StObject.set(x, "my_current_event_stages", js.Array(value*))
    
    inline def setMy_current_event_teams(value: js.Array[Any]): Self = StObject.set(x, "my_current_event_teams", value.asInstanceOf[js.Any])
    
    inline def setMy_current_event_teamsVarargs(value: Any*): Self = StObject.set(x, "my_current_event_teams", js.Array(value*))
    
    inline def setMy_current_team(value: Any): Self = StObject.set(x, "my_current_team", value.asInstanceOf[js.Any])
    
    inline def setMy_current_teamNull: Self = StObject.set(x, "my_current_team", null)
    
    inline def setOngoingmatch(value: Any): Self = StObject.set(x, "ongoingmatch", value.asInstanceOf[js.Any])
    
    inline def setOngoingmatchNull: Self = StObject.set(x, "ongoingmatch", null)
    
    inline def setPenalty_reason(value: Any): Self = StObject.set(x, "penalty_reason", value.asInstanceOf[js.Any])
    
    inline def setPenalty_reasonNull: Self = StObject.set(x, "penalty_reason", null)
    
    inline def setPenalty_seconds(value: Double): Self = StObject.set(x, "penalty_seconds", value.asInstanceOf[js.Any])
    
    inline def setPenalty_secondsNull: Self = StObject.set(x, "penalty_seconds", null)
    
    inline def setPlayer_cur_xp(value: Double): Self = StObject.set(x, "player_cur_xp", value.asInstanceOf[js.Any])
    
    inline def setPlayer_level(value: Double): Self = StObject.set(x, "player_level", value.asInstanceOf[js.Any])
    
    inline def setPlayer_xp_bonus_flags(value: Null): Self = StObject.set(x, "player_xp_bonus_flags", value.asInstanceOf[js.Any])
    
    inline def setRanking(value: Ranking): Self = StObject.set(x, "ranking", value.asInstanceOf[js.Any])
    
    inline def setRankingNull: Self = StObject.set(x, "ranking", null)
    
    inline def setRankings(value: js.Array[Ranking]): Self = StObject.set(x, "rankings", value.asInstanceOf[js.Any])
    
    inline def setRankingsVarargs(value: Ranking*): Self = StObject.set(x, "rankings", js.Array(value*))
    
    inline def setSurvey_vote(value: Any): Self = StObject.set(x, "survey_vote", value.asInstanceOf[js.Any])
    
    inline def setSurvey_voteNull: Self = StObject.set(x, "survey_vote", null)
    
    inline def setVac_banned(value: Double): Self = StObject.set(x, "vac_banned", value.asInstanceOf[js.Any])
    
    inline def setVac_bannedNull: Self = StObject.set(x, "vac_banned", null)
  }
}
