package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion AccountData
//#region Match
trait MatchesData extends StObject {
  
  var accountid: Double | Null
  
  var matches: js.Array[Match]
  
  var msgrequestid: Double
  
  var servertime: Double
  
  var streams: js.Array[Any]
  
  var tournamentinfo: Any | Null
}
object MatchesData {
  
  inline def apply(matches: js.Array[Match], msgrequestid: Double, servertime: Double, streams: js.Array[Any]): MatchesData = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], msgrequestid = msgrequestid.asInstanceOf[js.Any], servertime = servertime.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any], accountid = null, tournamentinfo = null)
    __obj.asInstanceOf[MatchesData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchesData] (val x: Self) extends AnyVal {
    
    inline def setAccountid(value: Double): Self = StObject.set(x, "accountid", value.asInstanceOf[js.Any])
    
    inline def setAccountidNull: Self = StObject.set(x, "accountid", null)
    
    inline def setMatches(value: js.Array[Match]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesVarargs(value: Match*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setMsgrequestid(value: Double): Self = StObject.set(x, "msgrequestid", value.asInstanceOf[js.Any])
    
    inline def setServertime(value: Double): Self = StObject.set(x, "servertime", value.asInstanceOf[js.Any])
    
    inline def setStreams(value: js.Array[Any]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsVarargs(value: Any*): Self = StObject.set(x, "streams", js.Array(value*))
    
    inline def setTournamentinfo(value: Any): Self = StObject.set(x, "tournamentinfo", value.asInstanceOf[js.Any])
    
    inline def setTournamentinfoNull: Self = StObject.set(x, "tournamentinfo", null)
  }
}
