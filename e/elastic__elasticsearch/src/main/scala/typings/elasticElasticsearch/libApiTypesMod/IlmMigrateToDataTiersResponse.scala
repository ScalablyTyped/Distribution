package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmMigrateToDataTiersResponse extends StObject {
  
  var dry_run: Boolean
  
  var migrated_component_templates: js.Array[String]
  
  var migrated_composable_templates: js.Array[String]
  
  var migrated_ilm_policies: js.Array[String]
  
  var migrated_indices: Indices
  
  var migrated_legacy_templates: js.Array[String]
  
  var removed_legacy_template: String
}
object IlmMigrateToDataTiersResponse {
  
  inline def apply(
    dry_run: Boolean,
    migrated_component_templates: js.Array[String],
    migrated_composable_templates: js.Array[String],
    migrated_ilm_policies: js.Array[String],
    migrated_indices: Indices,
    migrated_legacy_templates: js.Array[String],
    removed_legacy_template: String
  ): IlmMigrateToDataTiersResponse = {
    val __obj = js.Dynamic.literal(dry_run = dry_run.asInstanceOf[js.Any], migrated_component_templates = migrated_component_templates.asInstanceOf[js.Any], migrated_composable_templates = migrated_composable_templates.asInstanceOf[js.Any], migrated_ilm_policies = migrated_ilm_policies.asInstanceOf[js.Any], migrated_indices = migrated_indices.asInstanceOf[js.Any], migrated_legacy_templates = migrated_legacy_templates.asInstanceOf[js.Any], removed_legacy_template = removed_legacy_template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmMigrateToDataTiersResponse]
  }
  
  extension [Self <: IlmMigrateToDataTiersResponse](x: Self) {
    
    inline def setDry_run(value: Boolean): Self = StObject.set(x, "dry_run", value.asInstanceOf[js.Any])
    
    inline def setMigrated_component_templates(value: js.Array[String]): Self = StObject.set(x, "migrated_component_templates", value.asInstanceOf[js.Any])
    
    inline def setMigrated_component_templatesVarargs(value: String*): Self = StObject.set(x, "migrated_component_templates", js.Array(value*))
    
    inline def setMigrated_composable_templates(value: js.Array[String]): Self = StObject.set(x, "migrated_composable_templates", value.asInstanceOf[js.Any])
    
    inline def setMigrated_composable_templatesVarargs(value: String*): Self = StObject.set(x, "migrated_composable_templates", js.Array(value*))
    
    inline def setMigrated_ilm_policies(value: js.Array[String]): Self = StObject.set(x, "migrated_ilm_policies", value.asInstanceOf[js.Any])
    
    inline def setMigrated_ilm_policiesVarargs(value: String*): Self = StObject.set(x, "migrated_ilm_policies", js.Array(value*))
    
    inline def setMigrated_indices(value: Indices): Self = StObject.set(x, "migrated_indices", value.asInstanceOf[js.Any])
    
    inline def setMigrated_indicesVarargs(value: IndexName*): Self = StObject.set(x, "migrated_indices", js.Array(value*))
    
    inline def setMigrated_legacy_templates(value: js.Array[String]): Self = StObject.set(x, "migrated_legacy_templates", value.asInstanceOf[js.Any])
    
    inline def setMigrated_legacy_templatesVarargs(value: String*): Self = StObject.set(x, "migrated_legacy_templates", js.Array(value*))
    
    inline def setRemoved_legacy_template(value: String): Self = StObject.set(x, "removed_legacy_template", value.asInstanceOf[js.Any])
  }
}
