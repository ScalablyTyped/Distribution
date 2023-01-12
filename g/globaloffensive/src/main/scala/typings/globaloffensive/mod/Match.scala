package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Match extends StObject {
  
  var matchid: String
  
  var matchtime: Double | Any
  
  var roundstats_legacy: RoundStats | Null
  
  var roundstatsall: js.Array[RoundStats]
  
  var watchablematchinfo: WatchableMatchInfo
}
object Match {
  
  inline def apply(
    matchid: String,
    matchtime: Double | Any,
    roundstatsall: js.Array[RoundStats],
    watchablematchinfo: WatchableMatchInfo
  ): Match = {
    val __obj = js.Dynamic.literal(matchid = matchid.asInstanceOf[js.Any], matchtime = matchtime.asInstanceOf[js.Any], roundstatsall = roundstatsall.asInstanceOf[js.Any], watchablematchinfo = watchablematchinfo.asInstanceOf[js.Any], roundstats_legacy = null)
    __obj.asInstanceOf[Match]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
    
    inline def setMatchid(value: String): Self = StObject.set(x, "matchid", value.asInstanceOf[js.Any])
    
    inline def setMatchtime(value: Double | Any): Self = StObject.set(x, "matchtime", value.asInstanceOf[js.Any])
    
    inline def setRoundstats_legacy(value: RoundStats): Self = StObject.set(x, "roundstats_legacy", value.asInstanceOf[js.Any])
    
    inline def setRoundstats_legacyNull: Self = StObject.set(x, "roundstats_legacy", null)
    
    inline def setRoundstatsall(value: js.Array[RoundStats]): Self = StObject.set(x, "roundstatsall", value.asInstanceOf[js.Any])
    
    inline def setRoundstatsallVarargs(value: RoundStats*): Self = StObject.set(x, "roundstatsall", js.Array(value*))
    
    inline def setWatchablematchinfo(value: WatchableMatchInfo): Self = StObject.set(x, "watchablematchinfo", value.asInstanceOf[js.Any])
  }
}
