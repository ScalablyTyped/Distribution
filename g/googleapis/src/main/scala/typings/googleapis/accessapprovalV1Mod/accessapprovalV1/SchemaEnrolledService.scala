package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnrolledService extends StObject {
  
  /**
    * The product for which Access Approval will be enrolled. Allowed values are listed below (case-sensitive): * all * GA * App Engine * BigQuery * Cloud Bigtable * Cloud Key Management Service * Compute Engine * Cloud Dataflow * Cloud DLP * Cloud EKM * Cloud HSM * Cloud Identity and Access Management * Cloud Logging * Cloud Pub/Sub * Cloud Spanner * Cloud SQL * Cloud Storage * Google Kubernetes Engine * Organization Policy Serivice * Persistent Disk * Resource Manager * Speaker ID Note: These values are supported as input for legacy purposes, but will not be returned from the API. * all * ga-only * appengine.googleapis.com * bigquery.googleapis.com * bigtable.googleapis.com * container.googleapis.com * cloudkms.googleapis.com * cloudresourcemanager.googleapis.com * cloudsql.googleapis.com * compute.googleapis.com * dataflow.googleapis.com * dlp.googleapis.com * iam.googleapis.com * logging.googleapis.com * orgpolicy.googleapis.com * pubsub.googleapis.com * spanner.googleapis.com * speakerid.googleapis.com * storage.googleapis.com Calls to UpdateAccessApprovalSettings using 'all' or any of the XXX.googleapis.com will be translated to the associated product name ('all', 'App Engine', etc.). Note: 'all' will enroll the resource in all products supported at both 'GA' and 'Preview' levels. More information about levels of support is available at https://cloud.google.com/access-approval/docs/supported-services
    */
  var cloudProduct: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The enrollment level of the service.
    */
  var enrollmentLevel: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnrolledService {
  
  inline def apply(): SchemaEnrolledService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnrolledService]
  }
  
  extension [Self <: SchemaEnrolledService](x: Self) {
    
    inline def setCloudProduct(value: String): Self = StObject.set(x, "cloudProduct", value.asInstanceOf[js.Any])
    
    inline def setCloudProductNull: Self = StObject.set(x, "cloudProduct", null)
    
    inline def setCloudProductUndefined: Self = StObject.set(x, "cloudProduct", js.undefined)
    
    inline def setEnrollmentLevel(value: String): Self = StObject.set(x, "enrollmentLevel", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentLevelNull: Self = StObject.set(x, "enrollmentLevel", null)
    
    inline def setEnrollmentLevelUndefined: Self = StObject.set(x, "enrollmentLevel", js.undefined)
  }
}
