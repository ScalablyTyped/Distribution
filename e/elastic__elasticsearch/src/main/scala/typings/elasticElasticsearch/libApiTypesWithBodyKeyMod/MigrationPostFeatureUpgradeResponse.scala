package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationPostFeatureUpgradeResponse extends StObject {
  
  var accepted: Boolean
  
  var features: js.Array[MigrationPostFeatureUpgradeMigrationFeature]
}
object MigrationPostFeatureUpgradeResponse {
  
  inline def apply(accepted: Boolean, features: js.Array[MigrationPostFeatureUpgradeMigrationFeature]): MigrationPostFeatureUpgradeResponse = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationPostFeatureUpgradeResponse]
  }
  
  extension [Self <: MigrationPostFeatureUpgradeResponse](x: Self) {
    
    inline def setAccepted(value: Boolean): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: js.Array[MigrationPostFeatureUpgradeMigrationFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: MigrationPostFeatureUpgradeMigrationFeature*): Self = StObject.set(x, "features", js.Array(value*))
  }
}
