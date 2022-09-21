package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1PolicySchema extends StObject {
  
  /**
    * Output only. Specific access restrictions related to this policy.
    */
  var accessRestrictions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Additional key names that will be used to identify the target of the policy value. When specifying a `policyTargetKey`, each of the additional keys specified here will have to be included in the `additionalTargetKeys` map.
    */
  var additionalTargetKeyNames: js.UndefOr[js.Array[SchemaGoogleChromePolicyV1AdditionalTargetKeyName]] = js.undefined
  
  /**
    * Schema definition using proto descriptor.
    */
  var definition: js.UndefOr[SchemaProto2FileDescriptorProto] = js.undefined
  
  /**
    * Output only. Detailed description of each field that is part of the schema.
    */
  var fieldDescriptions: js.UndefOr[js.Array[SchemaGoogleChromePolicyV1PolicySchemaFieldDescription]] = js.undefined
  
  /**
    * Format: name=customers/{customer\}/policySchemas/{schema_namespace\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Special notice messages related to setting certain values in certain fields in the schema.
    */
  var notices: js.UndefOr[js.Array[SchemaGoogleChromePolicyV1PolicySchemaNoticeDescription]] = js.undefined
  
  /**
    * Output only. Current lifecycle information.
    */
  var policyApiLifecycle: js.UndefOr[SchemaChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle] = js.undefined
  
  /**
    * Deprecated field because of typo.
    */
  var policyApiLifeycle: js.UndefOr[SchemaChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle] = js.undefined
  
  /**
    * Output only. Description about the policy schema for user consumption.
    */
  var policyDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The fully qualified name of the policy schema. This value is used to fill the field `policy_schema` in PolicyValue when calling BatchInheritOrgUnitPolicies BatchModifyOrgUnitPolicies BatchModifyGroupPolicies or BatchDeleteGroupPolicies.
    */
  var schemaName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. URI to related support article for this schema.
    */
  var supportUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Information about applicable target resources for the policy.
    */
  var validTargetResources: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleChromePolicyV1PolicySchema {
  
  inline def apply(): SchemaGoogleChromePolicyV1PolicySchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1PolicySchema]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1PolicySchema](x: Self) {
    
    inline def setAccessRestrictions(value: js.Array[String]): Self = StObject.set(x, "accessRestrictions", value.asInstanceOf[js.Any])
    
    inline def setAccessRestrictionsNull: Self = StObject.set(x, "accessRestrictions", null)
    
    inline def setAccessRestrictionsUndefined: Self = StObject.set(x, "accessRestrictions", js.undefined)
    
    inline def setAccessRestrictionsVarargs(value: String*): Self = StObject.set(x, "accessRestrictions", js.Array(value*))
    
    inline def setAdditionalTargetKeyNames(value: js.Array[SchemaGoogleChromePolicyV1AdditionalTargetKeyName]): Self = StObject.set(x, "additionalTargetKeyNames", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTargetKeyNamesUndefined: Self = StObject.set(x, "additionalTargetKeyNames", js.undefined)
    
    inline def setAdditionalTargetKeyNamesVarargs(value: SchemaGoogleChromePolicyV1AdditionalTargetKeyName*): Self = StObject.set(x, "additionalTargetKeyNames", js.Array(value*))
    
    inline def setDefinition(value: SchemaProto2FileDescriptorProto): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setFieldDescriptions(value: js.Array[SchemaGoogleChromePolicyV1PolicySchemaFieldDescription]): Self = StObject.set(x, "fieldDescriptions", value.asInstanceOf[js.Any])
    
    inline def setFieldDescriptionsUndefined: Self = StObject.set(x, "fieldDescriptions", js.undefined)
    
    inline def setFieldDescriptionsVarargs(value: SchemaGoogleChromePolicyV1PolicySchemaFieldDescription*): Self = StObject.set(x, "fieldDescriptions", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotices(value: js.Array[SchemaGoogleChromePolicyV1PolicySchemaNoticeDescription]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
    
    inline def setNoticesUndefined: Self = StObject.set(x, "notices", js.undefined)
    
    inline def setNoticesVarargs(value: SchemaGoogleChromePolicyV1PolicySchemaNoticeDescription*): Self = StObject.set(x, "notices", js.Array(value*))
    
    inline def setPolicyApiLifecycle(value: SchemaChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle): Self = StObject.set(x, "policyApiLifecycle", value.asInstanceOf[js.Any])
    
    inline def setPolicyApiLifecycleUndefined: Self = StObject.set(x, "policyApiLifecycle", js.undefined)
    
    inline def setPolicyApiLifeycle(value: SchemaChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle): Self = StObject.set(x, "policyApiLifeycle", value.asInstanceOf[js.Any])
    
    inline def setPolicyApiLifeycleUndefined: Self = StObject.set(x, "policyApiLifeycle", js.undefined)
    
    inline def setPolicyDescription(value: String): Self = StObject.set(x, "policyDescription", value.asInstanceOf[js.Any])
    
    inline def setPolicyDescriptionNull: Self = StObject.set(x, "policyDescription", null)
    
    inline def setPolicyDescriptionUndefined: Self = StObject.set(x, "policyDescription", js.undefined)
    
    inline def setSchemaName(value: String): Self = StObject.set(x, "schemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNameNull: Self = StObject.set(x, "schemaName", null)
    
    inline def setSchemaNameUndefined: Self = StObject.set(x, "schemaName", js.undefined)
    
    inline def setSupportUri(value: String): Self = StObject.set(x, "supportUri", value.asInstanceOf[js.Any])
    
    inline def setSupportUriNull: Self = StObject.set(x, "supportUri", null)
    
    inline def setSupportUriUndefined: Self = StObject.set(x, "supportUri", js.undefined)
    
    inline def setValidTargetResources(value: js.Array[String]): Self = StObject.set(x, "validTargetResources", value.asInstanceOf[js.Any])
    
    inline def setValidTargetResourcesNull: Self = StObject.set(x, "validTargetResources", null)
    
    inline def setValidTargetResourcesUndefined: Self = StObject.set(x, "validTargetResources", js.undefined)
    
    inline def setValidTargetResourcesVarargs(value: String*): Self = StObject.set(x, "validTargetResources", js.Array(value*))
  }
}
