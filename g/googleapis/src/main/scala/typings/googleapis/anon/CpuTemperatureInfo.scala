package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpuTemperatureInfo extends StObject {
  
  var cpuTemperatureInfo: js.UndefOr[js.Array[Label]] = js.undefined
  
  var cpuUtilizationPercentageInfo: js.UndefOr[js.Array[Double]] = js.undefined
  
  var reportTime: js.UndefOr[String] = js.undefined
}
object CpuTemperatureInfo {
  
  @scala.inline
  def apply(): CpuTemperatureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CpuTemperatureInfo]
  }
  
  @scala.inline
  implicit class CpuTemperatureInfoMutableBuilder[Self <: CpuTemperatureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuTemperatureInfo(value: js.Array[Label]): Self = StObject.set(x, "cpuTemperatureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuTemperatureInfoUndefined: Self = StObject.set(x, "cpuTemperatureInfo", js.undefined)
    
    @scala.inline
    def setCpuTemperatureInfoVarargs(value: Label*): Self = StObject.set(x, "cpuTemperatureInfo", js.Array(value :_*))
    
    @scala.inline
    def setCpuUtilizationPercentageInfo(value: js.Array[Double]): Self = StObject.set(x, "cpuUtilizationPercentageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuUtilizationPercentageInfoUndefined: Self = StObject.set(x, "cpuUtilizationPercentageInfo", js.undefined)
    
    @scala.inline
    def setCpuUtilizationPercentageInfoVarargs(value: Double*): Self = StObject.set(x, "cpuUtilizationPercentageInfo", js.Array(value :_*))
    
    @scala.inline
    def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportTimeUndefined: Self = StObject.set(x, "reportTime", js.undefined)
  }
}
