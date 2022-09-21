package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1PolicySchemaFieldDependencies extends StObject {
  
  /**
    * The source field which this field depends on.
    */
  var sourceField: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value which the source field must have for this field to be allowed to be set.
    */
  var sourceFieldValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromePolicyV1PolicySchemaFieldDependencies {
  
  inline def apply(): SchemaGoogleChromePolicyV1PolicySchemaFieldDependencies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1PolicySchemaFieldDependencies]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1PolicySchemaFieldDependencies](x: Self) {
    
    inline def setSourceField(value: String): Self = StObject.set(x, "sourceField", value.asInstanceOf[js.Any])
    
    inline def setSourceFieldNull: Self = StObject.set(x, "sourceField", null)
    
    inline def setSourceFieldUndefined: Self = StObject.set(x, "sourceField", js.undefined)
    
    inline def setSourceFieldValue(value: String): Self = StObject.set(x, "sourceFieldValue", value.asInstanceOf[js.Any])
    
    inline def setSourceFieldValueNull: Self = StObject.set(x, "sourceFieldValue", null)
    
    inline def setSourceFieldValueUndefined: Self = StObject.set(x, "sourceFieldValue", js.undefined)
  }
}
