package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationGetFeatureUpgradeStatusMigrationFeatureIndexInfo extends StObject {
  
  var failure_cause: js.UndefOr[ErrorCause] = js.undefined
  
  var index: IndexName
  
  var version: VersionString
}
object MigrationGetFeatureUpgradeStatusMigrationFeatureIndexInfo {
  
  inline def apply(index: IndexName, version: VersionString): MigrationGetFeatureUpgradeStatusMigrationFeatureIndexInfo = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationGetFeatureUpgradeStatusMigrationFeatureIndexInfo]
  }
  
  extension [Self <: MigrationGetFeatureUpgradeStatusMigrationFeatureIndexInfo](x: Self) {
    
    inline def setFailure_cause(value: ErrorCause): Self = StObject.set(x, "failure_cause", value.asInstanceOf[js.Any])
    
    inline def setFailure_causeUndefined: Self = StObject.set(x, "failure_cause", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
