package typings.gamedig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResult extends js.Object {
  
  var bots: js.Array[Player] = js.native
  
  var connect: String = js.native
  
  var map: String = js.native
  
  var maxplayers: Double = js.native
  
  var name: String = js.native
  
  var password: Boolean = js.native
  
  var ping: Double = js.native
  
  var players: js.Array[Player] = js.native
  
  var raw: js.UndefOr[js.Object] = js.native
}
object QueryResult {
  
  @scala.inline
  def apply(
    bots: js.Array[Player],
    connect: String,
    map: String,
    maxplayers: Double,
    name: String,
    password: Boolean,
    ping: Double,
    players: js.Array[Player]
  ): QueryResult = {
    val __obj = js.Dynamic.literal(bots = bots.asInstanceOf[js.Any], connect = connect.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], maxplayers = maxplayers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], players = players.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
  
  @scala.inline
  implicit class QueryResultOps[Self <: QueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBotsVarargs(value: Player*): Self = this.set("bots", js.Array(value :_*))
    
    @scala.inline
    def setBots(value: js.Array[Player]): Self = this.set("bots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnect(value: String): Self = this.set("connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: String): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxplayers(value: Double): Self = this.set("maxplayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: Boolean): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPing(value: Double): Self = this.set("ping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayersVarargs(value: Player*): Self = this.set("players", js.Array(value :_*))
    
    @scala.inline
    def setPlayers(value: js.Array[Player]): Self = this.set("players", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: js.Object): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
}
