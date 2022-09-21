package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportingApiReportAddedEvent extends StObject {
  
  var report: ReportingApiReport
}
object ReportingApiReportAddedEvent {
  
  inline def apply(report: ReportingApiReport): ReportingApiReportAddedEvent = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportingApiReportAddedEvent]
  }
  
  extension [Self <: ReportingApiReportAddedEvent](x: Self) {
    
    inline def setReport(value: ReportingApiReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
  }
}
