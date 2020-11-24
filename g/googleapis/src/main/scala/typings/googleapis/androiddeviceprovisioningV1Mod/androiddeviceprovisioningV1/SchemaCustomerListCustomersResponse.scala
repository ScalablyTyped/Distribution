package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing my customers.
  */
@js.native
trait SchemaCustomerListCustomersResponse extends js.Object {
  
  /**
    * The customer accounts the calling user is a member of.
    */
  var customers: js.UndefOr[js.Array[SchemaCompany]] = js.native
  
  /**
    * A token used to access the next page of results. Omitted if no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaCustomerListCustomersResponse {
  
  @scala.inline
  def apply(): SchemaCustomerListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerListCustomersResponse]
  }
  
  @scala.inline
  implicit class SchemaCustomerListCustomersResponseOps[Self <: SchemaCustomerListCustomersResponse] (val x: Self) extends AnyVal {
    
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
    def setCustomersVarargs(value: SchemaCompany*): Self = this.set("customers", js.Array(value :_*))
    
    @scala.inline
    def setCustomers(value: js.Array[SchemaCompany]): Self = this.set("customers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomers: Self = this.set("customers", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
