package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRowAccessPolicyReference extends StObject {
  
  /**
    * [Required] The ID of the dataset containing this row access policy.
    */
  var datasetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Required] The ID of the row access policy. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
    */
  var policyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Required] The ID of the project containing this row access policy.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Required] The ID of the table containing this row access policy.
    */
  var tableId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRowAccessPolicyReference {
  
  inline def apply(): SchemaRowAccessPolicyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRowAccessPolicyReference]
  }
  
  extension [Self <: SchemaRowAccessPolicyReference](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdNull: Self = StObject.set(x, "datasetId", null)
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setPolicyId(value: String): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdNull: Self = StObject.set(x, "policyId", null)
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "policyId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdNull: Self = StObject.set(x, "tableId", null)
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
