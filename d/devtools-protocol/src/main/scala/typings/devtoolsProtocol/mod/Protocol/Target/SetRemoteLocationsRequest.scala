package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetRemoteLocationsRequest extends StObject {
  
  /**
    * List of remote locations.
    */
  var locations: js.Array[RemoteLocation]
}
object SetRemoteLocationsRequest {
  
  inline def apply(locations: js.Array[RemoteLocation]): SetRemoteLocationsRequest = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRemoteLocationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetRemoteLocationsRequest] (val x: Self) extends AnyVal {
    
    inline def setLocations(value: js.Array[RemoteLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsVarargs(value: RemoteLocation*): Self = StObject.set(x, "locations", js.Array(value*))
  }
}
