package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<globaloffensive.globaloffensive.AccountData, 'global_stats'> */
trait Profile extends StObject {
  
  var account_id: Double
  
  var activity: js.UndefOr[Any | Null] = js.undefined
  
  var commendation: Commendation
  
  /**
    * Seems to always be `null`
    */
  var global_stats: Null
  
  var medals: js.UndefOr[Medals | Null] = js.undefined
  
  var my_current_event: js.UndefOr[Any | Null] = js.undefined
  
  var my_current_event_stages: js.Array[Any]
  
  var my_current_event_teams: js.Array[Any]
  
  var my_current_team: js.UndefOr[Any | Null] = js.undefined
  
  var ongoingmatch: js.UndefOr[Any | Null] = js.undefined
  
  var penalty_reason: js.UndefOr[Any | Null] = js.undefined
  
  var penalty_seconds: js.UndefOr[Double | Null] = js.undefined
  
  var player_cur_xp: Double
  
  var player_level: Double
  
  var player_xp_bonus_flags: Null
  
  var ranking: js.UndefOr[Ranking | Null] = js.undefined
  
  var rankings: js.Array[Ranking]
  
  var survey_vote: js.UndefOr[Any | Null] = js.undefined
  
  var vac_banned: js.UndefOr[Double | Null] = js.undefined
}
object Profile {
  
  inline def apply(
    account_id: Double,
    commendation: Commendation,
    global_stats: Null,
    my_current_event_stages: js.Array[Any],
    my_current_event_teams: js.Array[Any],
    player_cur_xp: Double,
    player_level: Double,
    player_xp_bonus_flags: Null,
    rankings: js.Array[Ranking]
  ): Profile = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], commendation = commendation.asInstanceOf[js.Any], global_stats = global_stats.asInstanceOf[js.Any], my_current_event_stages = my_current_event_stages.asInstanceOf[js.Any], my_current_event_teams = my_current_event_teams.asInstanceOf[js.Any], player_cur_xp = player_cur_xp.asInstanceOf[js.Any], player_level = player_level.asInstanceOf[js.Any], player_xp_bonus_flags = player_xp_bonus_flags.asInstanceOf[js.Any], rankings = rankings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  
  extension [Self <: Profile](x: Self) {
    
    inline def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setActivity(value: Any): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityNull: Self = StObject.set(x, "activity", null)
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setCommendation(value: Commendation): Self = StObject.set(x, "commendation", value.asInstanceOf[js.Any])
    
    inline def setGlobal_stats(value: Null): Self = StObject.set(x, "global_stats", value.asInstanceOf[js.Any])
    
    inline def setMedals(value: Medals): Self = StObject.set(x, "medals", value.asInstanceOf[js.Any])
    
    inline def setMedalsNull: Self = StObject.set(x, "medals", null)
    
    inline def setMedalsUndefined: Self = StObject.set(x, "medals", js.undefined)
    
    inline def setMy_current_event(value: Any): Self = StObject.set(x, "my_current_event", value.asInstanceOf[js.Any])
    
    inline def setMy_current_eventNull: Self = StObject.set(x, "my_current_event", null)
    
    inline def setMy_current_eventUndefined: Self = StObject.set(x, "my_current_event", js.undefined)
    
    inline def setMy_current_event_stages(value: js.Array[Any]): Self = StObject.set(x, "my_current_event_stages", value.asInstanceOf[js.Any])
    
    inline def setMy_current_event_stagesVarargs(value: Any*): Self = StObject.set(x, "my_current_event_stages", js.Array(value*))
    
    inline def setMy_current_event_teams(value: js.Array[Any]): Self = StObject.set(x, "my_current_event_teams", value.asInstanceOf[js.Any])
    
    inline def setMy_current_event_teamsVarargs(value: Any*): Self = StObject.set(x, "my_current_event_teams", js.Array(value*))
    
    inline def setMy_current_team(value: Any): Self = StObject.set(x, "my_current_team", value.asInstanceOf[js.Any])
    
    inline def setMy_current_teamNull: Self = StObject.set(x, "my_current_team", null)
    
    inline def setMy_current_teamUndefined: Self = StObject.set(x, "my_current_team", js.undefined)
    
    inline def setOngoingmatch(value: Any): Self = StObject.set(x, "ongoingmatch", value.asInstanceOf[js.Any])
    
    inline def setOngoingmatchNull: Self = StObject.set(x, "ongoingmatch", null)
    
    inline def setOngoingmatchUndefined: Self = StObject.set(x, "ongoingmatch", js.undefined)
    
    inline def setPenalty_reason(value: Any): Self = StObject.set(x, "penalty_reason", value.asInstanceOf[js.Any])
    
    inline def setPenalty_reasonNull: Self = StObject.set(x, "penalty_reason", null)
    
    inline def setPenalty_reasonUndefined: Self = StObject.set(x, "penalty_reason", js.undefined)
    
    inline def setPenalty_seconds(value: Double): Self = StObject.set(x, "penalty_seconds", value.asInstanceOf[js.Any])
    
    inline def setPenalty_secondsNull: Self = StObject.set(x, "penalty_seconds", null)
    
    inline def setPenalty_secondsUndefined: Self = StObject.set(x, "penalty_seconds", js.undefined)
    
    inline def setPlayer_cur_xp(value: Double): Self = StObject.set(x, "player_cur_xp", value.asInstanceOf[js.Any])
    
    inline def setPlayer_level(value: Double): Self = StObject.set(x, "player_level", value.asInstanceOf[js.Any])
    
    inline def setPlayer_xp_bonus_flags(value: Null): Self = StObject.set(x, "player_xp_bonus_flags", value.asInstanceOf[js.Any])
    
    inline def setRanking(value: Ranking): Self = StObject.set(x, "ranking", value.asInstanceOf[js.Any])
    
    inline def setRankingNull: Self = StObject.set(x, "ranking", null)
    
    inline def setRankingUndefined: Self = StObject.set(x, "ranking", js.undefined)
    
    inline def setRankings(value: js.Array[Ranking]): Self = StObject.set(x, "rankings", value.asInstanceOf[js.Any])
    
    inline def setRankingsVarargs(value: Ranking*): Self = StObject.set(x, "rankings", js.Array(value*))
    
    inline def setSurvey_vote(value: Any): Self = StObject.set(x, "survey_vote", value.asInstanceOf[js.Any])
    
    inline def setSurvey_voteNull: Self = StObject.set(x, "survey_vote", null)
    
    inline def setSurvey_voteUndefined: Self = StObject.set(x, "survey_vote", js.undefined)
    
    inline def setVac_banned(value: Double): Self = StObject.set(x, "vac_banned", value.asInstanceOf[js.Any])
    
    inline def setVac_bannedNull: Self = StObject.set(x, "vac_banned", null)
    
    inline def setVac_bannedUndefined: Self = StObject.set(x, "vac_banned", js.undefined)
  }
}
