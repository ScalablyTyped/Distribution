package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportingApiEndpoint extends StObject {
  
  /**
    * Name of the endpoint group.
    */
  var groupName: String
  
  /**
    * The URL of the endpoint to which reports may be delivered.
    */
  var url: String
}
object ReportingApiEndpoint {
  
  inline def apply(groupName: String, url: String): ReportingApiEndpoint = {
    val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportingApiEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportingApiEndpoint] (val x: Self) extends AnyVal {
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
