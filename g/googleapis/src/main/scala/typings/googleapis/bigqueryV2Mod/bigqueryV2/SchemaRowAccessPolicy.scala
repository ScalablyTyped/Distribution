package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRowAccessPolicy extends StObject {
  
  /**
    * Output only. The time when this row access policy was created, in milliseconds since the epoch.
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A hash of this resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A SQL boolean expression that represents the rows defined by this row access policy, similar to the boolean expression in a WHERE clause of a SELECT query on a table. References to other tables, routines, and temporary functions are not supported. Examples: region="EU" date_field = CAST('2019-9-27' as DATE) nullable_field is not NULL numeric_field BETWEEN 1.0 AND 5.0
    */
  var filterPredicate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when this row access policy was last modified, in milliseconds since the epoch.
    */
  var lastModifiedTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Reference describing the ID of this row access policy.
    */
  var rowAccessPolicyReference: js.UndefOr[SchemaRowAccessPolicyReference] = js.undefined
}
object SchemaRowAccessPolicy {
  
  inline def apply(): SchemaRowAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRowAccessPolicy]
  }
  
  extension [Self <: SchemaRowAccessPolicy](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFilterPredicate(value: String): Self = StObject.set(x, "filterPredicate", value.asInstanceOf[js.Any])
    
    inline def setFilterPredicateNull: Self = StObject.set(x, "filterPredicate", null)
    
    inline def setFilterPredicateUndefined: Self = StObject.set(x, "filterPredicate", js.undefined)
    
    inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeNull: Self = StObject.set(x, "lastModifiedTime", null)
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setRowAccessPolicyReference(value: SchemaRowAccessPolicyReference): Self = StObject.set(x, "rowAccessPolicyReference", value.asInstanceOf[js.Any])
    
    inline def setRowAccessPolicyReferenceUndefined: Self = StObject.set(x, "rowAccessPolicyReference", js.undefined)
  }
}
