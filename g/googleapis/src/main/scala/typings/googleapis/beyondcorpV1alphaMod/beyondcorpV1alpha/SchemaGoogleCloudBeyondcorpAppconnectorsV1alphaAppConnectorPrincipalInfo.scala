package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnectorPrincipalInfo extends StObject {
  
  /**
    * A GCP service account.
    */
  var serviceAccount: js.UndefOr[
    SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnectorPrincipalInfoServiceAccount
  ] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnectorPrincipalInfo {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnectorPrincipalInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnectorPrincipalInfo]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnectorPrincipalInfo](x: Self) {
    
    inline def setServiceAccount(value: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnectorPrincipalInfoServiceAccount): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
  }
}
