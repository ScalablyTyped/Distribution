package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportTime extends StObject {
  
  var reportTime: js.UndefOr[String] = js.undefined
  
  var systemRamFreeInfo: js.UndefOr[js.Array[String]] = js.undefined
}
object ReportTime {
  
  inline def apply(): ReportTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportTime]
  }
  
  extension [Self <: ReportTime](x: Self) {
    
    inline def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    inline def setReportTimeUndefined: Self = StObject.set(x, "reportTime", js.undefined)
    
    inline def setSystemRamFreeInfo(value: js.Array[String]): Self = StObject.set(x, "systemRamFreeInfo", value.asInstanceOf[js.Any])
    
    inline def setSystemRamFreeInfoUndefined: Self = StObject.set(x, "systemRamFreeInfo", js.undefined)
    
    inline def setSystemRamFreeInfoVarargs(value: String*): Self = StObject.set(x, "systemRamFreeInfo", js.Array(value*))
  }
}
