package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationPostFeatureUpgradeMigrationFeature extends StObject {
  
  var feature_name: String
}
object MigrationPostFeatureUpgradeMigrationFeature {
  
  inline def apply(feature_name: String): MigrationPostFeatureUpgradeMigrationFeature = {
    val __obj = js.Dynamic.literal(feature_name = feature_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationPostFeatureUpgradeMigrationFeature]
  }
  
  extension [Self <: MigrationPostFeatureUpgradeMigrationFeature](x: Self) {
    
    inline def setFeature_name(value: String): Self = StObject.set(x, "feature_name", value.asInstanceOf[js.Any])
  }
}
