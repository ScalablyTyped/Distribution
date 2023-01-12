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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportingApiReportAddedEvent] (val x: Self) extends AnyVal {
    
    inline def setReport(value: ReportingApiReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
  }
}
