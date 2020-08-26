package typings.gapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sku extends js.Object {
  /** The category hierarchy of this SKU, purely for organizational purpose. */
  var category: js.UndefOr[Category] = js.native
  /**
    * A human readable description of the SKU, has a maximum length of 256
    * characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The resource name for the SKU.
    * Example: "services/DA34-426B-A397/skus/AA95-CD31-42FE"
    */
  var name: js.UndefOr[String] = js.native
  /** A timeline of pricing info for this SKU in chronological order. */
  var pricingInfo: js.UndefOr[js.Array[PricingInfo]] = js.native
  /**
    * Identifies the service provider.
    * This is 'Google' for first party services in Google Cloud Platform.
    */
  var serviceProviderName: js.UndefOr[String] = js.native
  /**
    * List of service regions this SKU is offered at.
    * Example: "asia-east1"
    * Service regions can be found at https://cloud.google.com/about/locations/
    */
  var serviceRegions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The identifier for the SKU.
    * Example: "AA95-CD31-42FE"
    */
  var skuId: js.UndefOr[String] = js.native
}

object Sku {
  @scala.inline
  def apply(): Sku = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sku]
  }
  @scala.inline
  implicit class SkuOps[Self <: Sku] (val x: Self) extends AnyVal {
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
    def setCategory(value: Category): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPricingInfoVarargs(value: PricingInfo*): Self = this.set("pricingInfo", js.Array(value :_*))
    @scala.inline
    def setPricingInfo(value: js.Array[PricingInfo]): Self = this.set("pricingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricingInfo: Self = this.set("pricingInfo", js.undefined)
    @scala.inline
    def setServiceProviderName(value: String): Self = this.set("serviceProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceProviderName: Self = this.set("serviceProviderName", js.undefined)
    @scala.inline
    def setServiceRegionsVarargs(value: String*): Self = this.set("serviceRegions", js.Array(value :_*))
    @scala.inline
    def setServiceRegions(value: js.Array[String]): Self = this.set("serviceRegions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRegions: Self = this.set("serviceRegions", js.undefined)
    @scala.inline
    def setSkuId(value: String): Self = this.set("skuId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkuId: Self = this.set("skuId", js.undefined)
  }
  
}

