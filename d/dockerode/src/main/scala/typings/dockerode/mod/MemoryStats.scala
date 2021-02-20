package typings.dockerode.mod

import typings.dockerode.anon.Activeanon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryStats extends StObject {
  
  var failcnt: Double = js.native
  
  var limit: Double = js.native
  
  var max_usage: Double = js.native
  
  var stats: Activeanon = js.native
  
  var usage: Double = js.native
}
object MemoryStats {
  
  @scala.inline
  def apply(failcnt: Double, limit: Double, max_usage: Double, stats: Activeanon, usage: Double): MemoryStats = {
    val __obj = js.Dynamic.literal(failcnt = failcnt.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], max_usage = max_usage.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStats]
  }
  
  @scala.inline
  implicit class MemoryStatsMutableBuilder[Self <: MemoryStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailcnt(value: Double): Self = StObject.set(x, "failcnt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_usage(value: Double): Self = StObject.set(x, "max_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Activeanon): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
  }
}
