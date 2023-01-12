package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationGetFeatureUpgradeStatusMigrationFeature extends StObject {
  
  var feature_name: String
  
  var indices: js.Array[MigrationGetFeatureUpgradeStatusMigrationFeatureIndexInfo]
  
  var migration_status: MigrationGetFeatureUpgradeStatusMigrationStatus
  
  var minimum_index_version: VersionString
}
object MigrationGetFeatureUpgradeStatusMigrationFeature {
  
  inline def apply(
    feature_name: String,
    indices: js.Array[MigrationGetFeatureUpgradeStatusMigrationFeatureIndexInfo],
    migration_status: MigrationGetFeatureUpgradeStatusMigrationStatus,
    minimum_index_version: VersionString
  ): MigrationGetFeatureUpgradeStatusMigrationFeature = {
    val __obj = js.Dynamic.literal(feature_name = feature_name.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], migration_status = migration_status.asInstanceOf[js.Any], minimum_index_version = minimum_index_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationGetFeatureUpgradeStatusMigrationFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MigrationGetFeatureUpgradeStatusMigrationFeature] (val x: Self) extends AnyVal {
    
    inline def setFeature_name(value: String): Self = StObject.set(x, "feature_name", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: js.Array[MigrationGetFeatureUpgradeStatusMigrationFeatureIndexInfo]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: MigrationGetFeatureUpgradeStatusMigrationFeatureIndexInfo*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setMigration_status(value: MigrationGetFeatureUpgradeStatusMigrationStatus): Self = StObject.set(x, "migration_status", value.asInstanceOf[js.Any])
    
    inline def setMinimum_index_version(value: VersionString): Self = StObject.set(x, "minimum_index_version", value.asInstanceOf[js.Any])
  }
}
