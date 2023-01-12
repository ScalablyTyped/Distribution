package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableReportingApiRequest extends StObject {
  
  /**
    * Whether to enable or disable events for the Reporting API
    */
  var enable: Boolean
}
object EnableReportingApiRequest {
  
  inline def apply(enable: Boolean): EnableReportingApiRequest = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableReportingApiRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableReportingApiRequest] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
  }
}
