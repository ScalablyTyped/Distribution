package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationGetFeatureUpgradeStatusResponse extends StObject {
  
  var features: js.Array[MigrationGetFeatureUpgradeStatusMigrationFeature]
  
  var migration_status: MigrationGetFeatureUpgradeStatusMigrationStatus
}
object MigrationGetFeatureUpgradeStatusResponse {
  
  inline def apply(
    features: js.Array[MigrationGetFeatureUpgradeStatusMigrationFeature],
    migration_status: MigrationGetFeatureUpgradeStatusMigrationStatus
  ): MigrationGetFeatureUpgradeStatusResponse = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], migration_status = migration_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationGetFeatureUpgradeStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MigrationGetFeatureUpgradeStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setFeatures(value: js.Array[MigrationGetFeatureUpgradeStatusMigrationFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: MigrationGetFeatureUpgradeStatusMigrationFeature*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setMigration_status(value: MigrationGetFeatureUpgradeStatusMigrationStatus): Self = StObject.set(x, "migration_status", value.asInstanceOf[js.Any])
  }
}
