package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectRemoteLocationPermittedConnections extends StObject {
  
  /**
    * [Output Only] URL of an Interconnect location that is permitted to connect to this Interconnect remote location.
    */
  var interconnectLocation: js.UndefOr[String | Null] = js.undefined
}
object SchemaInterconnectRemoteLocationPermittedConnections {
  
  inline def apply(): SchemaInterconnectRemoteLocationPermittedConnections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectRemoteLocationPermittedConnections]
  }
  
  extension [Self <: SchemaInterconnectRemoteLocationPermittedConnections](x: Self) {
    
    inline def setInterconnectLocation(value: String): Self = StObject.set(x, "interconnectLocation", value.asInstanceOf[js.Any])
    
    inline def setInterconnectLocationNull: Self = StObject.set(x, "interconnectLocation", null)
    
    inline def setInterconnectLocationUndefined: Self = StObject.set(x, "interconnectLocation", js.undefined)
  }
}
