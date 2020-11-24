package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message of customer&#39;s listing configuration.
  */
@js.native
trait SchemaCustomerListConfigurationsResponse extends js.Object {
  
  /**
    * The configurations.
    */
  var configurations: js.UndefOr[js.Array[SchemaConfiguration]] = js.native
}
object SchemaCustomerListConfigurationsResponse {
  
  @scala.inline
  def apply(): SchemaCustomerListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerListConfigurationsResponse]
  }
  
  @scala.inline
  implicit class SchemaCustomerListConfigurationsResponseOps[Self <: SchemaCustomerListConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigurationsVarargs(value: SchemaConfiguration*): Self = this.set("configurations", js.Array(value :_*))
    
    @scala.inline
    def setConfigurations(value: js.Array[SchemaConfiguration]): Self = this.set("configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurations: Self = this.set("configurations", js.undefined)
  }
}
