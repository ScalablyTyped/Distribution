package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMigrateBasePlanPricesRequest extends StObject {
  
  /**
    * Required. The regional prices to update.
    */
  var regionalPriceMigrations: js.UndefOr[js.Array[SchemaRegionalPriceMigrationConfig]] = js.undefined
  
  /**
    * Required. The version of the available regions being used for the regional_price_migrations.
    */
  var regionsVersion: js.UndefOr[SchemaRegionsVersion] = js.undefined
}
object SchemaMigrateBasePlanPricesRequest {
  
  inline def apply(): SchemaMigrateBasePlanPricesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMigrateBasePlanPricesRequest]
  }
  
  extension [Self <: SchemaMigrateBasePlanPricesRequest](x: Self) {
    
    inline def setRegionalPriceMigrations(value: js.Array[SchemaRegionalPriceMigrationConfig]): Self = StObject.set(x, "regionalPriceMigrations", value.asInstanceOf[js.Any])
    
    inline def setRegionalPriceMigrationsUndefined: Self = StObject.set(x, "regionalPriceMigrations", js.undefined)
    
    inline def setRegionalPriceMigrationsVarargs(value: SchemaRegionalPriceMigrationConfig*): Self = StObject.set(x, "regionalPriceMigrations", js.Array(value*))
    
    inline def setRegionsVersion(value: SchemaRegionsVersion): Self = StObject.set(x, "regionsVersion", value.asInstanceOf[js.Any])
    
    inline def setRegionsVersionUndefined: Self = StObject.set(x, "regionsVersion", js.undefined)
  }
}
