package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportTime extends StObject {
  
  var reportTime: js.UndefOr[String] = js.undefined
  
  var systemRamFreeInfo: js.UndefOr[js.Array[String]] = js.undefined
}
object ReportTime {
  
  @scala.inline
  def apply(): ReportTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportTime]
  }
  
  @scala.inline
  implicit class ReportTimeMutableBuilder[Self <: ReportTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportTimeUndefined: Self = StObject.set(x, "reportTime", js.undefined)
    
    @scala.inline
    def setSystemRamFreeInfo(value: js.Array[String]): Self = StObject.set(x, "systemRamFreeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemRamFreeInfoUndefined: Self = StObject.set(x, "systemRamFreeInfo", js.undefined)
    
    @scala.inline
    def setSystemRamFreeInfoVarargs(value: String*): Self = StObject.set(x, "systemRamFreeInfo", js.Array(value :_*))
  }
}
