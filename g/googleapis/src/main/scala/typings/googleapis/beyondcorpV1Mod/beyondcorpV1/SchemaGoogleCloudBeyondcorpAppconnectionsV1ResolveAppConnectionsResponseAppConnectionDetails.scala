package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponseAppConnectionDetails extends StObject {
  
  /**
    * A BeyondCorp AppConnection in the project.
    */
  var appConnection: js.UndefOr[SchemaGoogleCloudBeyondcorpAppconnectionsV1AppConnection] = js.undefined
  
  /**
    * If type=GCP_REGIONAL_MIG, contains most recent VM instances, like `https://www.googleapis.com/compute/v1/projects/{project_id\}/zones/{zone_id\}/instances/{instance_id\}`.
    */
  var recentMigVms: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponseAppConnectionDetails {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponseAppConnectionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponseAppConnectionDetails]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponseAppConnectionDetails](x: Self) {
    
    inline def setAppConnection(value: SchemaGoogleCloudBeyondcorpAppconnectionsV1AppConnection): Self = StObject.set(x, "appConnection", value.asInstanceOf[js.Any])
    
    inline def setAppConnectionUndefined: Self = StObject.set(x, "appConnection", js.undefined)
    
    inline def setRecentMigVms(value: js.Array[String]): Self = StObject.set(x, "recentMigVms", value.asInstanceOf[js.Any])
    
    inline def setRecentMigVmsNull: Self = StObject.set(x, "recentMigVms", null)
    
    inline def setRecentMigVmsUndefined: Self = StObject.set(x, "recentMigVms", js.undefined)
    
    inline def setRecentMigVmsVarargs(value: String*): Self = StObject.set(x, "recentMigVms", js.Array(value*))
  }
}
