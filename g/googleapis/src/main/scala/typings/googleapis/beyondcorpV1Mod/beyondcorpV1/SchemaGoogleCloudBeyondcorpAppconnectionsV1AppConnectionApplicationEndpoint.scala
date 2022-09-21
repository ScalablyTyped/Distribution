package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectionsV1AppConnectionApplicationEndpoint extends StObject {
  
  /**
    * Required. Hostname or IP address of the remote application endpoint.
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Port of the remote application endpoint.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectionsV1AppConnectionApplicationEndpoint {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectionsV1AppConnectionApplicationEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectionsV1AppConnectionApplicationEndpoint]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectionsV1AppConnectionApplicationEndpoint](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
