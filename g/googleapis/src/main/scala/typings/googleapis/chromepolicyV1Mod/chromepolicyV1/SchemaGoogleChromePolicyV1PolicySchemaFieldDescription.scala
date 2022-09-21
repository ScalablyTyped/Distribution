package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1PolicySchemaFieldDescription extends StObject {
  
  /**
    * Output only. The description for the field.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the field for associated with this description.
    */
  var field: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Provides a list of fields and values. At least one of the fields must have the corresponding value in order for this field to be allowed to be set.
    */
  var fieldDependencies: js.UndefOr[js.Array[SchemaGoogleChromePolicyV1PolicySchemaFieldDependencies]] = js.undefined
  
  /**
    * Output only. Any input constraints associated on the values for the field.
    */
  var inputConstraint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. If the field has a set of known values, this field will provide a description for these values.
    */
  var knownValueDescriptions: js.UndefOr[js.Array[SchemaGoogleChromePolicyV1PolicySchemaFieldKnownValueDescription]] = js.undefined
  
  /**
    * Output only. Provides the description of the fields nested in this field, if the field is a message type that defines multiple fields.
    */
  var nestedFieldDescriptions: js.UndefOr[js.Array[SchemaGoogleChromePolicyV1PolicySchemaFieldDescription]] = js.undefined
  
  /**
    * Output only. Provides a list of fields that are required to be set if this field has a certain value.
    */
  var requiredItems: js.UndefOr[js.Array[SchemaGoogleChromePolicyV1PolicySchemaRequiredItems]] = js.undefined
}
object SchemaGoogleChromePolicyV1PolicySchemaFieldDescription {
  
  inline def apply(): SchemaGoogleChromePolicyV1PolicySchemaFieldDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1PolicySchemaFieldDescription]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1PolicySchemaFieldDescription](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldDependencies(value: js.Array[SchemaGoogleChromePolicyV1PolicySchemaFieldDependencies]): Self = StObject.set(x, "fieldDependencies", value.asInstanceOf[js.Any])
    
    inline def setFieldDependenciesUndefined: Self = StObject.set(x, "fieldDependencies", js.undefined)
    
    inline def setFieldDependenciesVarargs(value: SchemaGoogleChromePolicyV1PolicySchemaFieldDependencies*): Self = StObject.set(x, "fieldDependencies", js.Array(value*))
    
    inline def setFieldNull: Self = StObject.set(x, "field", null)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setInputConstraint(value: String): Self = StObject.set(x, "inputConstraint", value.asInstanceOf[js.Any])
    
    inline def setInputConstraintNull: Self = StObject.set(x, "inputConstraint", null)
    
    inline def setInputConstraintUndefined: Self = StObject.set(x, "inputConstraint", js.undefined)
    
    inline def setKnownValueDescriptions(value: js.Array[SchemaGoogleChromePolicyV1PolicySchemaFieldKnownValueDescription]): Self = StObject.set(x, "knownValueDescriptions", value.asInstanceOf[js.Any])
    
    inline def setKnownValueDescriptionsUndefined: Self = StObject.set(x, "knownValueDescriptions", js.undefined)
    
    inline def setKnownValueDescriptionsVarargs(value: SchemaGoogleChromePolicyV1PolicySchemaFieldKnownValueDescription*): Self = StObject.set(x, "knownValueDescriptions", js.Array(value*))
    
    inline def setNestedFieldDescriptions(value: js.Array[SchemaGoogleChromePolicyV1PolicySchemaFieldDescription]): Self = StObject.set(x, "nestedFieldDescriptions", value.asInstanceOf[js.Any])
    
    inline def setNestedFieldDescriptionsUndefined: Self = StObject.set(x, "nestedFieldDescriptions", js.undefined)
    
    inline def setNestedFieldDescriptionsVarargs(value: SchemaGoogleChromePolicyV1PolicySchemaFieldDescription*): Self = StObject.set(x, "nestedFieldDescriptions", js.Array(value*))
    
    inline def setRequiredItems(value: js.Array[SchemaGoogleChromePolicyV1PolicySchemaRequiredItems]): Self = StObject.set(x, "requiredItems", value.asInstanceOf[js.Any])
    
    inline def setRequiredItemsUndefined: Self = StObject.set(x, "requiredItems", js.undefined)
    
    inline def setRequiredItemsVarargs(value: SchemaGoogleChromePolicyV1PolicySchemaRequiredItems*): Self = StObject.set(x, "requiredItems", js.Array(value*))
  }
}
