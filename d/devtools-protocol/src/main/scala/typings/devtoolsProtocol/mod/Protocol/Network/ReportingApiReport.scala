package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportingApiReport extends StObject {
  
  var body: Any
  
  /**
    * The number of delivery attempts made so far, not including an active attempt.
    */
  var completedAttempts: integer
  
  /**
    * How many uploads deep the related request was.
    */
  var depth: integer
  
  /**
    * The name of the endpoint group that should be used to deliver the report.
    */
  var destination: String
  
  var id: ReportId
  
  /**
    * The URL of the document that triggered the report.
    */
  var initiatorUrl: String
  
  var status: ReportStatus
  
  /**
    * When the report was generated.
    */
  var timestamp: TimeSinceEpoch
  
  /**
    * The type of the report (specifies the set of data that is contained in the report body).
    */
  var `type`: String
}
object ReportingApiReport {
  
  inline def apply(
    body: Any,
    completedAttempts: integer,
    depth: integer,
    destination: String,
    id: ReportId,
    initiatorUrl: String,
    status: ReportStatus,
    timestamp: TimeSinceEpoch,
    `type`: String
  ): ReportingApiReport = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], completedAttempts = completedAttempts.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initiatorUrl = initiatorUrl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportingApiReport]
  }
  
  extension [Self <: ReportingApiReport](x: Self) {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCompletedAttempts(value: integer): Self = StObject.set(x, "completedAttempts", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: integer): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setId(value: ReportId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUrl(value: String): Self = StObject.set(x, "initiatorUrl", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ReportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: TimeSinceEpoch): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
