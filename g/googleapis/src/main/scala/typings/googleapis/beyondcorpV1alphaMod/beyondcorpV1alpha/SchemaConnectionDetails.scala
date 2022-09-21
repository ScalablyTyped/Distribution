package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnectionDetails extends StObject {
  
  /**
    * A BeyondCorp Connection in the project.
    */
  var connection: js.UndefOr[SchemaConnection] = js.undefined
  
  /**
    * If type=GCP_REGIONAL_MIG, contains most recent VM instances, like "https://www.googleapis.com/compute/v1/projects/{project_id\}/zones/{zone_id\}/instances/{instance_id\}".
    */
  var recentMigVms: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaConnectionDetails {
  
  inline def apply(): SchemaConnectionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionDetails]
  }
  
  extension [Self <: SchemaConnectionDetails](x: Self) {
    
    inline def setConnection(value: SchemaConnection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setRecentMigVms(value: js.Array[String]): Self = StObject.set(x, "recentMigVms", value.asInstanceOf[js.Any])
    
    inline def setRecentMigVmsNull: Self = StObject.set(x, "recentMigVms", null)
    
    inline def setRecentMigVmsUndefined: Self = StObject.set(x, "recentMigVms", js.undefined)
    
    inline def setRecentMigVmsVarargs(value: String*): Self = StObject.set(x, "recentMigVms", js.Array(value*))
  }
}
