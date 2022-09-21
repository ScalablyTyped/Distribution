package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloneDefinition extends StObject {
  
  /**
    * [Required] Reference describing the ID of the table that was cloned.
    */
  var baseTableReference: js.UndefOr[SchemaTableReference] = js.undefined
  
  /**
    * [Required] The time at which the base table was cloned. This value is reported in the JSON response using RFC3339 format.
    */
  var cloneTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloneDefinition {
  
  inline def apply(): SchemaCloneDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloneDefinition]
  }
  
  extension [Self <: SchemaCloneDefinition](x: Self) {
    
    inline def setBaseTableReference(value: SchemaTableReference): Self = StObject.set(x, "baseTableReference", value.asInstanceOf[js.Any])
    
    inline def setBaseTableReferenceUndefined: Self = StObject.set(x, "baseTableReference", js.undefined)
    
    inline def setCloneTime(value: String): Self = StObject.set(x, "cloneTime", value.asInstanceOf[js.Any])
    
    inline def setCloneTimeNull: Self = StObject.set(x, "cloneTime", null)
    
    inline def setCloneTimeUndefined: Self = StObject.set(x, "cloneTime", js.undefined)
  }
}
