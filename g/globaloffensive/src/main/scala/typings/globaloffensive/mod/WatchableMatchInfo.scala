package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchableMatchInfo extends StObject {
  
  var cl_decryptdata_key: Any | Null
  
  var cl_decryptdata_key_pub: String | Null
  
  var game_map: String | Null
  
  var game_mapgroup: String | Null
  
  var game_type: Double | Null
  
  var match_id: String | Null
  
  var reservation_id: Any | Null
  
  var server_id: String | Null
  
  var server_ip: Double | Null
  
  var tv_port: Double | Null
  
  var tv_spectators: Double
  
  var tv_time: Double | Null
  
  var tv_watch_password: Any | Null
}
object WatchableMatchInfo {
  
  inline def apply(tv_spectators: Double): WatchableMatchInfo = {
    val __obj = js.Dynamic.literal(tv_spectators = tv_spectators.asInstanceOf[js.Any], cl_decryptdata_key = null, cl_decryptdata_key_pub = null, game_map = null, game_mapgroup = null, game_type = null, match_id = null, reservation_id = null, server_id = null, server_ip = null, tv_port = null, tv_time = null, tv_watch_password = null)
    __obj.asInstanceOf[WatchableMatchInfo]
  }
  
  extension [Self <: WatchableMatchInfo](x: Self) {
    
    inline def setCl_decryptdata_key(value: Any): Self = StObject.set(x, "cl_decryptdata_key", value.asInstanceOf[js.Any])
    
    inline def setCl_decryptdata_keyNull: Self = StObject.set(x, "cl_decryptdata_key", null)
    
    inline def setCl_decryptdata_key_pub(value: String): Self = StObject.set(x, "cl_decryptdata_key_pub", value.asInstanceOf[js.Any])
    
    inline def setCl_decryptdata_key_pubNull: Self = StObject.set(x, "cl_decryptdata_key_pub", null)
    
    inline def setGame_map(value: String): Self = StObject.set(x, "game_map", value.asInstanceOf[js.Any])
    
    inline def setGame_mapNull: Self = StObject.set(x, "game_map", null)
    
    inline def setGame_mapgroup(value: String): Self = StObject.set(x, "game_mapgroup", value.asInstanceOf[js.Any])
    
    inline def setGame_mapgroupNull: Self = StObject.set(x, "game_mapgroup", null)
    
    inline def setGame_type(value: Double): Self = StObject.set(x, "game_type", value.asInstanceOf[js.Any])
    
    inline def setGame_typeNull: Self = StObject.set(x, "game_type", null)
    
    inline def setMatch_id(value: String): Self = StObject.set(x, "match_id", value.asInstanceOf[js.Any])
    
    inline def setMatch_idNull: Self = StObject.set(x, "match_id", null)
    
    inline def setReservation_id(value: Any): Self = StObject.set(x, "reservation_id", value.asInstanceOf[js.Any])
    
    inline def setReservation_idNull: Self = StObject.set(x, "reservation_id", null)
    
    inline def setServer_id(value: String): Self = StObject.set(x, "server_id", value.asInstanceOf[js.Any])
    
    inline def setServer_idNull: Self = StObject.set(x, "server_id", null)
    
    inline def setServer_ip(value: Double): Self = StObject.set(x, "server_ip", value.asInstanceOf[js.Any])
    
    inline def setServer_ipNull: Self = StObject.set(x, "server_ip", null)
    
    inline def setTv_port(value: Double): Self = StObject.set(x, "tv_port", value.asInstanceOf[js.Any])
    
    inline def setTv_portNull: Self = StObject.set(x, "tv_port", null)
    
    inline def setTv_spectators(value: Double): Self = StObject.set(x, "tv_spectators", value.asInstanceOf[js.Any])
    
    inline def setTv_time(value: Double): Self = StObject.set(x, "tv_time", value.asInstanceOf[js.Any])
    
    inline def setTv_timeNull: Self = StObject.set(x, "tv_time", null)
    
    inline def setTv_watch_password(value: Any): Self = StObject.set(x, "tv_watch_password", value.asInstanceOf[js.Any])
    
    inline def setTv_watch_passwordNull: Self = StObject.set(x, "tv_watch_password", null)
  }
}
