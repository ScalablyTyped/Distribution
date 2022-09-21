package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfo extends StObject {
  
  /**
    * A GCP service account.
    */
  var serviceAccount: js.UndefOr[
    SchemaGoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfoServiceAccount
  ] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfo {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfo]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfo](x: Self) {
    
    inline def setServiceAccount(value: SchemaGoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfoServiceAccount): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
  }
}
