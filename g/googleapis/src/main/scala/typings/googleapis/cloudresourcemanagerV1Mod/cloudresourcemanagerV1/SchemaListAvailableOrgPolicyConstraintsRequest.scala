package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request sent to the [ListAvailableOrgPolicyConstraints]
  * google.cloud.OrgPolicy.v1.ListAvailableOrgPolicyConstraints] method.
  */
trait SchemaListAvailableOrgPolicyConstraintsRequest extends StObject {
  
  /**
    * Size of the pages to be returned. This is currently unsupported and will
    * be ignored. The server may at any point start using this field to limit
    * page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token used to retrieve the next page. This is currently unsupported
    * and will be ignored. The server may at any point start using this field.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object SchemaListAvailableOrgPolicyConstraintsRequest {
  
  inline def apply(): SchemaListAvailableOrgPolicyConstraintsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAvailableOrgPolicyConstraintsRequest]
  }
  
  extension [Self <: SchemaListAvailableOrgPolicyConstraintsRequest](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
