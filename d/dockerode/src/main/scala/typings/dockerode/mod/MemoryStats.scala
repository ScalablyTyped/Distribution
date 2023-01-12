package typings.dockerode.mod

import typings.dockerode.anon.Activeanon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryStats extends StObject {
  
  // Windows Memory Stats
  var commitbytes: js.UndefOr[Double] = js.undefined
  
  var commitpeakbytes: js.UndefOr[Double] = js.undefined
  
  var failcnt: Double
  
  var limit: Double
  
  var max_usage: Double
  
  var privateworkingset: js.UndefOr[Double] = js.undefined
  
  // Linux Memory Stats
  var stats: Activeanon
  
  var usage: Double
}
object MemoryStats {
  
  inline def apply(failcnt: Double, limit: Double, max_usage: Double, stats: Activeanon, usage: Double): MemoryStats = {
    val __obj = js.Dynamic.literal(failcnt = failcnt.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], max_usage = max_usage.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryStats] (val x: Self) extends AnyVal {
    
    inline def setCommitbytes(value: Double): Self = StObject.set(x, "commitbytes", value.asInstanceOf[js.Any])
    
    inline def setCommitbytesUndefined: Self = StObject.set(x, "commitbytes", js.undefined)
    
    inline def setCommitpeakbytes(value: Double): Self = StObject.set(x, "commitpeakbytes", value.asInstanceOf[js.Any])
    
    inline def setCommitpeakbytesUndefined: Self = StObject.set(x, "commitpeakbytes", js.undefined)
    
    inline def setFailcnt(value: Double): Self = StObject.set(x, "failcnt", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setMax_usage(value: Double): Self = StObject.set(x, "max_usage", value.asInstanceOf[js.Any])
    
    inline def setPrivateworkingset(value: Double): Self = StObject.set(x, "privateworkingset", value.asInstanceOf[js.Any])
    
    inline def setPrivateworkingsetUndefined: Self = StObject.set(x, "privateworkingset", js.undefined)
    
    inline def setStats(value: Activeanon): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
  }
}
