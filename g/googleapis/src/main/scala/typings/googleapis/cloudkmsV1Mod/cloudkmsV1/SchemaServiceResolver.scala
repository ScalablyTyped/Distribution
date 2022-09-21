package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceResolver extends StObject {
  
  /**
    * Optional. The filter applied to the endpoints of the resolved service. If no filter is specified, all endpoints will be considered. An endpoint will be chosen arbitrarily from the filtered list for each request. For endpoint filter syntax and examples, see https://cloud.google.com/service-directory/docs/reference/rpc/google.cloud.servicedirectory.v1#resolveservicerequest.
    */
  var endpointFilter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The hostname of the EKM replica used at TLS and HTTP layers.
    */
  var hostname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A list of leaf server certificates used to authenticate HTTPS connections to the EKM replica. Currently, a maximum of 10 Certificate is supported.
    */
  var serverCertificates: js.UndefOr[js.Array[SchemaCertificate]] = js.undefined
  
  /**
    * Required. The resource name of the Service Directory service pointing to an EKM replica, in the format `projects/x/locations/x/namespaces/x/services/x`.
    */
  var serviceDirectoryService: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceResolver {
  
  inline def apply(): SchemaServiceResolver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceResolver]
  }
  
  extension [Self <: SchemaServiceResolver](x: Self) {
    
    inline def setEndpointFilter(value: String): Self = StObject.set(x, "endpointFilter", value.asInstanceOf[js.Any])
    
    inline def setEndpointFilterNull: Self = StObject.set(x, "endpointFilter", null)
    
    inline def setEndpointFilterUndefined: Self = StObject.set(x, "endpointFilter", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setServerCertificates(value: js.Array[SchemaCertificate]): Self = StObject.set(x, "serverCertificates", value.asInstanceOf[js.Any])
    
    inline def setServerCertificatesUndefined: Self = StObject.set(x, "serverCertificates", js.undefined)
    
    inline def setServerCertificatesVarargs(value: SchemaCertificate*): Self = StObject.set(x, "serverCertificates", js.Array(value*))
    
    inline def setServiceDirectoryService(value: String): Self = StObject.set(x, "serviceDirectoryService", value.asInstanceOf[js.Any])
    
    inline def setServiceDirectoryServiceNull: Self = StObject.set(x, "serviceDirectoryService", null)
    
    inline def setServiceDirectoryServiceUndefined: Self = StObject.set(x, "serviceDirectoryService", js.undefined)
  }
}
