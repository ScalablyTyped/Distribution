package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reservation extends StObject {
  
  var account_ids: js.Array[Double]
  
  var encryption_key: Any | Null
  
  var encryption_key_pub: Any | Null
  
  var flags: Any | Null
  
  var game_type: Double | Null
  
  var match_id: Any | Null
  
  var party_ids: js.Array[Double]
  
  var pre_match_data: Any | Null
  
  var rankings: js.Array[Any]
  
  var rtime32_event_start: Any | Null
  
  var server_version: Double
  
  var tournament_casters_account_ids: js.Array[Double]
  
  var tournament_event: TournamentEvent | Null
  
  var tournament_teams: js.Array[TournamentTeams]
  
  var tv_control: Any | Null
  
  var tv_master_steamid: Any | Null
  
  var tv_relay_steamid: Any | Null
}
object Reservation {
  
  inline def apply(
    account_ids: js.Array[Double],
    party_ids: js.Array[Double],
    rankings: js.Array[Any],
    server_version: Double,
    tournament_casters_account_ids: js.Array[Double],
    tournament_teams: js.Array[TournamentTeams]
  ): Reservation = {
    val __obj = js.Dynamic.literal(account_ids = account_ids.asInstanceOf[js.Any], party_ids = party_ids.asInstanceOf[js.Any], rankings = rankings.asInstanceOf[js.Any], server_version = server_version.asInstanceOf[js.Any], tournament_casters_account_ids = tournament_casters_account_ids.asInstanceOf[js.Any], tournament_teams = tournament_teams.asInstanceOf[js.Any], encryption_key = null, encryption_key_pub = null, flags = null, game_type = null, match_id = null, pre_match_data = null, rtime32_event_start = null, tournament_event = null, tv_control = null, tv_master_steamid = null, tv_relay_steamid = null)
    __obj.asInstanceOf[Reservation]
  }
  
  extension [Self <: Reservation](x: Self) {
    
    inline def setAccount_ids(value: js.Array[Double]): Self = StObject.set(x, "account_ids", value.asInstanceOf[js.Any])
    
    inline def setAccount_idsVarargs(value: Double*): Self = StObject.set(x, "account_ids", js.Array(value*))
    
    inline def setEncryption_key(value: Any): Self = StObject.set(x, "encryption_key", value.asInstanceOf[js.Any])
    
    inline def setEncryption_keyNull: Self = StObject.set(x, "encryption_key", null)
    
    inline def setEncryption_key_pub(value: Any): Self = StObject.set(x, "encryption_key_pub", value.asInstanceOf[js.Any])
    
    inline def setEncryption_key_pubNull: Self = StObject.set(x, "encryption_key_pub", null)
    
    inline def setFlags(value: Any): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsNull: Self = StObject.set(x, "flags", null)
    
    inline def setGame_type(value: Double): Self = StObject.set(x, "game_type", value.asInstanceOf[js.Any])
    
    inline def setGame_typeNull: Self = StObject.set(x, "game_type", null)
    
    inline def setMatch_id(value: Any): Self = StObject.set(x, "match_id", value.asInstanceOf[js.Any])
    
    inline def setMatch_idNull: Self = StObject.set(x, "match_id", null)
    
    inline def setParty_ids(value: js.Array[Double]): Self = StObject.set(x, "party_ids", value.asInstanceOf[js.Any])
    
    inline def setParty_idsVarargs(value: Double*): Self = StObject.set(x, "party_ids", js.Array(value*))
    
    inline def setPre_match_data(value: Any): Self = StObject.set(x, "pre_match_data", value.asInstanceOf[js.Any])
    
    inline def setPre_match_dataNull: Self = StObject.set(x, "pre_match_data", null)
    
    inline def setRankings(value: js.Array[Any]): Self = StObject.set(x, "rankings", value.asInstanceOf[js.Any])
    
    inline def setRankingsVarargs(value: Any*): Self = StObject.set(x, "rankings", js.Array(value*))
    
    inline def setRtime32_event_start(value: Any): Self = StObject.set(x, "rtime32_event_start", value.asInstanceOf[js.Any])
    
    inline def setRtime32_event_startNull: Self = StObject.set(x, "rtime32_event_start", null)
    
    inline def setServer_version(value: Double): Self = StObject.set(x, "server_version", value.asInstanceOf[js.Any])
    
    inline def setTournament_casters_account_ids(value: js.Array[Double]): Self = StObject.set(x, "tournament_casters_account_ids", value.asInstanceOf[js.Any])
    
    inline def setTournament_casters_account_idsVarargs(value: Double*): Self = StObject.set(x, "tournament_casters_account_ids", js.Array(value*))
    
    inline def setTournament_event(value: TournamentEvent): Self = StObject.set(x, "tournament_event", value.asInstanceOf[js.Any])
    
    inline def setTournament_eventNull: Self = StObject.set(x, "tournament_event", null)
    
    inline def setTournament_teams(value: js.Array[TournamentTeams]): Self = StObject.set(x, "tournament_teams", value.asInstanceOf[js.Any])
    
    inline def setTournament_teamsVarargs(value: TournamentTeams*): Self = StObject.set(x, "tournament_teams", js.Array(value*))
    
    inline def setTv_control(value: Any): Self = StObject.set(x, "tv_control", value.asInstanceOf[js.Any])
    
    inline def setTv_controlNull: Self = StObject.set(x, "tv_control", null)
    
    inline def setTv_master_steamid(value: Any): Self = StObject.set(x, "tv_master_steamid", value.asInstanceOf[js.Any])
    
    inline def setTv_master_steamidNull: Self = StObject.set(x, "tv_master_steamid", null)
    
    inline def setTv_relay_steamid(value: Any): Self = StObject.set(x, "tv_relay_steamid", value.asInstanceOf[js.Any])
    
    inline def setTv_relay_steamidNull: Self = StObject.set(x, "tv_relay_steamid", null)
  }
}
