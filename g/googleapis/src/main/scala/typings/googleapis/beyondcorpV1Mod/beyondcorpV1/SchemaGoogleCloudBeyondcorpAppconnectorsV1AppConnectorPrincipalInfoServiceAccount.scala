package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfoServiceAccount extends StObject {
  
  /**
    * Email address of the service account.
    */
  var email: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfoServiceAccount {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfoServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfoServiceAccount]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfoServiceAccount](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
