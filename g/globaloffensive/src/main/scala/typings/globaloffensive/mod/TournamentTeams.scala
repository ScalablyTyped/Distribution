package typings.globaloffensive.mod

import typings.globaloffensive.anon.Accountid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TournamentTeams extends StObject {
  
  var players: Accountid
  
  var team_flag: String
  
  var team_id: Double
  
  var team_name: String
  
  var team_tag: String
}
object TournamentTeams {
  
  inline def apply(players: Accountid, team_flag: String, team_id: Double, team_name: String, team_tag: String): TournamentTeams = {
    val __obj = js.Dynamic.literal(players = players.asInstanceOf[js.Any], team_flag = team_flag.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], team_name = team_name.asInstanceOf[js.Any], team_tag = team_tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TournamentTeams]
  }
  
  extension [Self <: TournamentTeams](x: Self) {
    
    inline def setPlayers(value: Accountid): Self = StObject.set(x, "players", value.asInstanceOf[js.Any])
    
    inline def setTeam_flag(value: String): Self = StObject.set(x, "team_flag", value.asInstanceOf[js.Any])
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
    
    inline def setTeam_name(value: String): Self = StObject.set(x, "team_name", value.asInstanceOf[js.Any])
    
    inline def setTeam_tag(value: String): Self = StObject.set(x, "team_tag", value.asInstanceOf[js.Any])
  }
}
