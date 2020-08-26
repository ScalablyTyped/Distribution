package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates a single SKU in Google Cloud Platform
  */
@js.native
trait SchemaSku extends js.Object {
  /**
    * The category hierarchy of this SKU, purely for organizational purpose.
    */
  var category: js.UndefOr[SchemaCategory] = js.native
  /**
    * A human readable description of the SKU, has a maximum length of 256
    * characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The resource name for the SKU. Example:
    * &quot;services/DA34-426B-A397/skus/AA95-CD31-42FE&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A timeline of pricing info for this SKU in chronological order.
    */
  var pricingInfo: js.UndefOr[js.Array[SchemaPricingInfo]] = js.native
  /**
    * Identifies the service provider. This is &#39;Google&#39; for first party
    * services in Google Cloud Platform.
    */
  var serviceProviderName: js.UndefOr[String] = js.native
  /**
    * List of service regions this SKU is offered at. Example:
    * &quot;asia-east1&quot; Service regions can be found at
    * https://cloud.google.com/about/locations/
    */
  var serviceRegions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The identifier for the SKU. Example: &quot;AA95-CD31-42FE&quot;
    */
  var skuId: js.UndefOr[String] = js.native
}

object SchemaSku {
  @scala.inline
  def apply(): SchemaSku = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSku]
  }
  @scala.inline
  implicit class SchemaSkuOps[Self <: SchemaSku] (val x: Self) extends AnyVal {
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
    def setCategory(value: SchemaCategory): Self = this.set("category", value.asInstanceOf[js.Any])
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
    def setPricingInfoVarargs(value: SchemaPricingInfo*): Self = this.set("pricingInfo", js.Array(value :_*))
    @scala.inline
    def setPricingInfo(value: js.Array[SchemaPricingInfo]): Self = this.set("pricingInfo", value.asInstanceOf[js.Any])
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

