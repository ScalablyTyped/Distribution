package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulation of billing information for a GCP Console project. A project
  * has at most one associated billing account at a time (but a billing account
  * can be assigned to multiple projects).
  */
trait SchemaProjectBillingInfo extends StObject {
  
  /**
    * The resource name of the billing account associated with the project, if
    * any. For example, `billingAccounts/012345-567890-ABCDEF`.
    */
  var billingAccountName: js.UndefOr[String] = js.undefined
  
  /**
    * True if the project is associated with an open billing account, to which
    * usage on the project is charged. False if the project is associated with
    * a closed billing account, or no billing account at all, and therefore
    * cannot use paid services. This field is read-only.
    */
  var billingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resource name for the `ProjectBillingInfo`; has the form
    * `projects/{project_id}/billingInfo`. For example, the resource name for
    * the billing information for project `tokyo-rain-123` would be
    * `projects/tokyo-rain-123/billingInfo`. This field is read-only.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the project that this `ProjectBillingInfo` represents, such as
    * `tokyo-rain-123`. This is a convenience field so that you don&#39;t need
    * to parse the `name` field to obtain a project ID. This field is
    * read-only.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object SchemaProjectBillingInfo {
  
  inline def apply(): SchemaProjectBillingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectBillingInfo]
  }
  
  extension [Self <: SchemaProjectBillingInfo](x: Self) {
    
    inline def setBillingAccountName(value: String): Self = StObject.set(x, "billingAccountName", value.asInstanceOf[js.Any])
    
    inline def setBillingAccountNameUndefined: Self = StObject.set(x, "billingAccountName", js.undefined)
    
    inline def setBillingEnabled(value: Boolean): Self = StObject.set(x, "billingEnabled", value.asInstanceOf[js.Any])
    
    inline def setBillingEnabledUndefined: Self = StObject.set(x, "billingEnabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
