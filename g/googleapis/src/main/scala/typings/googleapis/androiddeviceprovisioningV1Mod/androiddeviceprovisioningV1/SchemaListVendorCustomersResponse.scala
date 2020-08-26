package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message to list customers of the vendor.
  */
@js.native
trait SchemaListVendorCustomersResponse extends js.Object {
  /**
    * List of customers of the vendor.
    */
  var customers: js.UndefOr[js.Array[SchemaCompany]] = js.native
  /**
    * A token to retrieve the next page of results. Omitted if no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total count of items in the list irrespective of pagination.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object SchemaListVendorCustomersResponse {
  @scala.inline
  def apply(): SchemaListVendorCustomersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVendorCustomersResponse]
  }
  @scala.inline
  implicit class SchemaListVendorCustomersResponseOps[Self <: SchemaListVendorCustomersResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
  
}

