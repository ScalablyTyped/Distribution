package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPUUsage extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/cpu-usage
  /**
    * The number of average idle CPU wakeups per second since the last call to
    * getCPUUsage. First call returns 0. Will always return 0 on Windows.
    */
  var idleWakeupsPerSecond: Double = js.native
  
  /**
    * Percentage of CPU used since the last call to getCPUUsage. First call returns 0.
    */
  var percentCPUUsage: Double = js.native
}
object CPUUsage {
  
  @scala.inline
  def apply(idleWakeupsPerSecond: Double, percentCPUUsage: Double): CPUUsage = {
    val __obj = js.Dynamic.literal(idleWakeupsPerSecond = idleWakeupsPerSecond.asInstanceOf[js.Any], percentCPUUsage = percentCPUUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUUsage]
  }
  
  @scala.inline
  implicit class CPUUsageMutableBuilder[Self <: CPUUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdleWakeupsPerSecond(value: Double): Self = StObject.set(x, "idleWakeupsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentCPUUsage(value: Double): Self = StObject.set(x, "percentCPUUsage", value.asInstanceOf[js.Any])
  }
}
