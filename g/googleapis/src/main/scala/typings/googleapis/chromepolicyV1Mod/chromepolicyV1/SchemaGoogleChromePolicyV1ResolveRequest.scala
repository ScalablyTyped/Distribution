package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1ResolveRequest extends StObject {
  
  /**
    * The maximum number of policies to return, defaults to 100 and has a maximum of 1000.
    */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The page token used to retrieve a specific page of the request.
    */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The schema filter to apply to the resolve request. Specify a schema name to view a particular schema, for example: chrome.users.ShowLogoutButton Wildcards are supported, but only in the leaf portion of the schema name. Wildcards cannot be used in namespace directly. Please read https://developers.google.com/chrome/policy/guides/policy-schemas for details on schema namepsaces. For example: Valid: "chrome.users.*", "chrome.users.apps.*", "chrome.printers.*" Invalid: "*", "*.users", "chrome.*", "chrome.*.apps.*"
    */
  var policySchemaFilter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The key of the target resource on which the policies should be resolved. The target resource must point to an Org Unit.
    */
  var policyTargetKey: js.UndefOr[SchemaGoogleChromePolicyV1PolicyTargetKey] = js.undefined
}
object SchemaGoogleChromePolicyV1ResolveRequest {
  
  inline def apply(): SchemaGoogleChromePolicyV1ResolveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1ResolveRequest]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1ResolveRequest](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPolicySchemaFilter(value: String): Self = StObject.set(x, "policySchemaFilter", value.asInstanceOf[js.Any])
    
    inline def setPolicySchemaFilterNull: Self = StObject.set(x, "policySchemaFilter", null)
    
    inline def setPolicySchemaFilterUndefined: Self = StObject.set(x, "policySchemaFilter", js.undefined)
    
    inline def setPolicyTargetKey(value: SchemaGoogleChromePolicyV1PolicyTargetKey): Self = StObject.set(x, "policyTargetKey", value.asInstanceOf[js.Any])
    
    inline def setPolicyTargetKeyUndefined: Self = StObject.set(x, "policyTargetKey", js.undefined)
  }
}
