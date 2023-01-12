package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteLocation extends StObject {
  
  var host: String
  
  var port: integer
}
object RemoteLocation {
  
  inline def apply(host: String, port: integer): RemoteLocation = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteLocation] (val x: Self) extends AnyVal {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
