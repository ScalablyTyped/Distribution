package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportingApiReportUpdatedEvent extends StObject {
  
  var report: ReportingApiReport
}
object ReportingApiReportUpdatedEvent {
  
  inline def apply(report: ReportingApiReport): ReportingApiReportUpdatedEvent = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportingApiReportUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportingApiReportUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setReport(value: ReportingApiReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
  }
}
