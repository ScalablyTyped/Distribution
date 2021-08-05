package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateTestReportRequest extends StObject {
  
  /**
    * Specifies the endpoint group to deliver the report to.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * Message to be displayed in the report.
    */
  var message: String
}
object GenerateTestReportRequest {
  
  inline def apply(message: String): GenerateTestReportRequest = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateTestReportRequest]
  }
  
  extension [Self <: GenerateTestReportRequest](x: Self) {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
