package typings.googleapis.assuredworkloadsV1beta1Mod.assuredworkloadsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssuredworkloadsV1beta1ListWorkloadsResponse extends StObject {
  
  /**
    * The next page token. Return empty if reached the last page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of Workloads under a given parent.
    */
  var workloads: js.UndefOr[js.Array[SchemaGoogleCloudAssuredworkloadsV1beta1Workload]] = js.undefined
}
object SchemaGoogleCloudAssuredworkloadsV1beta1ListWorkloadsResponse {
  
  inline def apply(): SchemaGoogleCloudAssuredworkloadsV1beta1ListWorkloadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssuredworkloadsV1beta1ListWorkloadsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudAssuredworkloadsV1beta1ListWorkloadsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWorkloads(value: js.Array[SchemaGoogleCloudAssuredworkloadsV1beta1Workload]): Self = StObject.set(x, "workloads", value.asInstanceOf[js.Any])
    
    inline def setWorkloadsUndefined: Self = StObject.set(x, "workloads", js.undefined)
    
    inline def setWorkloadsVarargs(value: SchemaGoogleCloudAssuredworkloadsV1beta1Workload*): Self = StObject.set(x, "workloads", js.Array(value*))
  }
}
