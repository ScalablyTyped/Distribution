package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message of customer&#39;s listing configuration.
  */
trait SchemaCustomerListConfigurationsResponse extends StObject {
  
  /**
    * The configurations.
    */
  var configurations: js.UndefOr[js.Array[SchemaConfiguration]] = js.undefined
}
object SchemaCustomerListConfigurationsResponse {
  
  @scala.inline
  def apply(): SchemaCustomerListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerListConfigurationsResponse]
  }
  
  @scala.inline
  implicit class SchemaCustomerListConfigurationsResponseMutableBuilder[Self <: SchemaCustomerListConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurations(value: js.Array[SchemaConfiguration]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: SchemaConfiguration*): Self = StObject.set(x, "configurations", js.Array(value :_*))
  }
}
