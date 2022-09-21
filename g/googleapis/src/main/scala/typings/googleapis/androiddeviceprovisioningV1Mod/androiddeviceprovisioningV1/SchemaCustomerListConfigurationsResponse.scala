package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomerListConfigurationsResponse extends StObject {
  
  /**
    * The configurations.
    */
  var configurations: js.UndefOr[js.Array[SchemaConfiguration]] = js.undefined
}
object SchemaCustomerListConfigurationsResponse {
  
  inline def apply(): SchemaCustomerListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerListConfigurationsResponse]
  }
  
  extension [Self <: SchemaCustomerListConfigurationsResponse](x: Self) {
    
    inline def setConfigurations(value: js.Array[SchemaConfiguration]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: SchemaConfiguration*): Self = StObject.set(x, "configurations", js.Array(value*))
  }
}
