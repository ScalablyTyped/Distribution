package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoundStats extends StObject {
  
  var assists: js.Array[Double]
  
  var b_switched_teams: Any | Null
  
  var confirm: Any | Null
  
  var deaths: js.Array[Double]
  
  var drop_info: Any | Null
  
  var enemy_2ks: js.Array[Double]
  
  var enemy_3ks: js.Array[Double]
  
  var enemy_4ks: js.Array[Double]
  
  var enemy_5ks: js.Array[Double]
  
  var enemy_headshots: js.Array[Double]
  
  var enemy_kills: js.Array[Double]
  
  var enemy_kills_agg: js.Array[Double]
  
  var kills: js.Array[Double]
  
  var map: String | Null
  
  var match_duration: Double
  
  var match_result: Double | Null
  
  var max_rounds: Double | Null
  
  var mvps: js.Array[Double]
  
  var pings: js.Array[Double]
  
  var player_spawned: js.Array[Double]
  
  var reservation: Reservation
  
  var reservation_stage: Double
  
  var reservationid: String | Null
  
  var round: Any | Null
  
  var round_result: Any | Null
  
  var scores: js.Array[Double]
  
  var spectators_count: Any | Null
  
  var spectators_count_lnk: Any | Null
  
  var spectators_count_tv: Any | Null
  
  var team_scores: js.Array[Double]
  
  var team_spawn_count: js.Array[Double]
}
object RoundStats {
  
  inline def apply(
    assists: js.Array[Double],
    deaths: js.Array[Double],
    enemy_2ks: js.Array[Double],
    enemy_3ks: js.Array[Double],
    enemy_4ks: js.Array[Double],
    enemy_5ks: js.Array[Double],
    enemy_headshots: js.Array[Double],
    enemy_kills: js.Array[Double],
    enemy_kills_agg: js.Array[Double],
    kills: js.Array[Double],
    match_duration: Double,
    mvps: js.Array[Double],
    pings: js.Array[Double],
    player_spawned: js.Array[Double],
    reservation: Reservation,
    reservation_stage: Double,
    scores: js.Array[Double],
    team_scores: js.Array[Double],
    team_spawn_count: js.Array[Double]
  ): RoundStats = {
    val __obj = js.Dynamic.literal(assists = assists.asInstanceOf[js.Any], deaths = deaths.asInstanceOf[js.Any], enemy_2ks = enemy_2ks.asInstanceOf[js.Any], enemy_3ks = enemy_3ks.asInstanceOf[js.Any], enemy_4ks = enemy_4ks.asInstanceOf[js.Any], enemy_5ks = enemy_5ks.asInstanceOf[js.Any], enemy_headshots = enemy_headshots.asInstanceOf[js.Any], enemy_kills = enemy_kills.asInstanceOf[js.Any], enemy_kills_agg = enemy_kills_agg.asInstanceOf[js.Any], kills = kills.asInstanceOf[js.Any], match_duration = match_duration.asInstanceOf[js.Any], mvps = mvps.asInstanceOf[js.Any], pings = pings.asInstanceOf[js.Any], player_spawned = player_spawned.asInstanceOf[js.Any], reservation = reservation.asInstanceOf[js.Any], reservation_stage = reservation_stage.asInstanceOf[js.Any], scores = scores.asInstanceOf[js.Any], team_scores = team_scores.asInstanceOf[js.Any], team_spawn_count = team_spawn_count.asInstanceOf[js.Any], b_switched_teams = null, confirm = null, drop_info = null, map = null, match_result = null, max_rounds = null, reservationid = null, round = null, round_result = null, spectators_count = null, spectators_count_lnk = null, spectators_count_tv = null)
    __obj.asInstanceOf[RoundStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoundStats] (val x: Self) extends AnyVal {
    
    inline def setAssists(value: js.Array[Double]): Self = StObject.set(x, "assists", value.asInstanceOf[js.Any])
    
    inline def setAssistsVarargs(value: Double*): Self = StObject.set(x, "assists", js.Array(value*))
    
    inline def setB_switched_teams(value: Any): Self = StObject.set(x, "b_switched_teams", value.asInstanceOf[js.Any])
    
    inline def setB_switched_teamsNull: Self = StObject.set(x, "b_switched_teams", null)
    
    inline def setConfirm(value: Any): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setConfirmNull: Self = StObject.set(x, "confirm", null)
    
    inline def setDeaths(value: js.Array[Double]): Self = StObject.set(x, "deaths", value.asInstanceOf[js.Any])
    
    inline def setDeathsVarargs(value: Double*): Self = StObject.set(x, "deaths", js.Array(value*))
    
    inline def setDrop_info(value: Any): Self = StObject.set(x, "drop_info", value.asInstanceOf[js.Any])
    
    inline def setDrop_infoNull: Self = StObject.set(x, "drop_info", null)
    
    inline def setEnemy_2ks(value: js.Array[Double]): Self = StObject.set(x, "enemy_2ks", value.asInstanceOf[js.Any])
    
    inline def setEnemy_2ksVarargs(value: Double*): Self = StObject.set(x, "enemy_2ks", js.Array(value*))
    
    inline def setEnemy_3ks(value: js.Array[Double]): Self = StObject.set(x, "enemy_3ks", value.asInstanceOf[js.Any])
    
    inline def setEnemy_3ksVarargs(value: Double*): Self = StObject.set(x, "enemy_3ks", js.Array(value*))
    
    inline def setEnemy_4ks(value: js.Array[Double]): Self = StObject.set(x, "enemy_4ks", value.asInstanceOf[js.Any])
    
    inline def setEnemy_4ksVarargs(value: Double*): Self = StObject.set(x, "enemy_4ks", js.Array(value*))
    
    inline def setEnemy_5ks(value: js.Array[Double]): Self = StObject.set(x, "enemy_5ks", value.asInstanceOf[js.Any])
    
    inline def setEnemy_5ksVarargs(value: Double*): Self = StObject.set(x, "enemy_5ks", js.Array(value*))
    
    inline def setEnemy_headshots(value: js.Array[Double]): Self = StObject.set(x, "enemy_headshots", value.asInstanceOf[js.Any])
    
    inline def setEnemy_headshotsVarargs(value: Double*): Self = StObject.set(x, "enemy_headshots", js.Array(value*))
    
    inline def setEnemy_kills(value: js.Array[Double]): Self = StObject.set(x, "enemy_kills", value.asInstanceOf[js.Any])
    
    inline def setEnemy_killsVarargs(value: Double*): Self = StObject.set(x, "enemy_kills", js.Array(value*))
    
    inline def setEnemy_kills_agg(value: js.Array[Double]): Self = StObject.set(x, "enemy_kills_agg", value.asInstanceOf[js.Any])
    
    inline def setEnemy_kills_aggVarargs(value: Double*): Self = StObject.set(x, "enemy_kills_agg", js.Array(value*))
    
    inline def setKills(value: js.Array[Double]): Self = StObject.set(x, "kills", value.asInstanceOf[js.Any])
    
    inline def setKillsVarargs(value: Double*): Self = StObject.set(x, "kills", js.Array(value*))
    
    inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMatch_duration(value: Double): Self = StObject.set(x, "match_duration", value.asInstanceOf[js.Any])
    
    inline def setMatch_result(value: Double): Self = StObject.set(x, "match_result", value.asInstanceOf[js.Any])
    
    inline def setMatch_resultNull: Self = StObject.set(x, "match_result", null)
    
    inline def setMax_rounds(value: Double): Self = StObject.set(x, "max_rounds", value.asInstanceOf[js.Any])
    
    inline def setMax_roundsNull: Self = StObject.set(x, "max_rounds", null)
    
    inline def setMvps(value: js.Array[Double]): Self = StObject.set(x, "mvps", value.asInstanceOf[js.Any])
    
    inline def setMvpsVarargs(value: Double*): Self = StObject.set(x, "mvps", js.Array(value*))
    
    inline def setPings(value: js.Array[Double]): Self = StObject.set(x, "pings", value.asInstanceOf[js.Any])
    
    inline def setPingsVarargs(value: Double*): Self = StObject.set(x, "pings", js.Array(value*))
    
    inline def setPlayer_spawned(value: js.Array[Double]): Self = StObject.set(x, "player_spawned", value.asInstanceOf[js.Any])
    
    inline def setPlayer_spawnedVarargs(value: Double*): Self = StObject.set(x, "player_spawned", js.Array(value*))
    
    inline def setReservation(value: Reservation): Self = StObject.set(x, "reservation", value.asInstanceOf[js.Any])
    
    inline def setReservation_stage(value: Double): Self = StObject.set(x, "reservation_stage", value.asInstanceOf[js.Any])
    
    inline def setReservationid(value: String): Self = StObject.set(x, "reservationid", value.asInstanceOf[js.Any])
    
    inline def setReservationidNull: Self = StObject.set(x, "reservationid", null)
    
    inline def setRound(value: Any): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundNull: Self = StObject.set(x, "round", null)
    
    inline def setRound_result(value: Any): Self = StObject.set(x, "round_result", value.asInstanceOf[js.Any])
    
    inline def setRound_resultNull: Self = StObject.set(x, "round_result", null)
    
    inline def setScores(value: js.Array[Double]): Self = StObject.set(x, "scores", value.asInstanceOf[js.Any])
    
    inline def setScoresVarargs(value: Double*): Self = StObject.set(x, "scores", js.Array(value*))
    
    inline def setSpectators_count(value: Any): Self = StObject.set(x, "spectators_count", value.asInstanceOf[js.Any])
    
    inline def setSpectators_countNull: Self = StObject.set(x, "spectators_count", null)
    
    inline def setSpectators_count_lnk(value: Any): Self = StObject.set(x, "spectators_count_lnk", value.asInstanceOf[js.Any])
    
    inline def setSpectators_count_lnkNull: Self = StObject.set(x, "spectators_count_lnk", null)
    
    inline def setSpectators_count_tv(value: Any): Self = StObject.set(x, "spectators_count_tv", value.asInstanceOf[js.Any])
    
    inline def setSpectators_count_tvNull: Self = StObject.set(x, "spectators_count_tv", null)
    
    inline def setTeam_scores(value: js.Array[Double]): Self = StObject.set(x, "team_scores", value.asInstanceOf[js.Any])
    
    inline def setTeam_scoresVarargs(value: Double*): Self = StObject.set(x, "team_scores", js.Array(value*))
    
    inline def setTeam_spawn_count(value: js.Array[Double]): Self = StObject.set(x, "team_spawn_count", value.asInstanceOf[js.Any])
    
    inline def setTeam_spawn_countVarargs(value: Double*): Self = StObject.set(x, "team_spawn_count", js.Array(value*))
  }
}
