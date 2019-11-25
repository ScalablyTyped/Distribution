package typings.gapiDotClientDotCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sku extends js.Object {
  /** The category hierarchy of this SKU, purely for organizational purpose. */
  var category: js.UndefOr[Category] = js.undefined
  /**
    * A human readable description of the SKU, has a maximum length of 256
    * characters.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The resource name for the SKU.
    * Example: "services/DA34-426B-A397/skus/AA95-CD31-42FE"
    */
  var name: js.UndefOr[String] = js.undefined
  /** A timeline of pricing info for this SKU in chronological order. */
  var pricingInfo: js.UndefOr[js.Array[PricingInfo]] = js.undefined
  /**
    * Identifies the service provider.
    * This is 'Google' for first party services in Google Cloud Platform.
    */
  var serviceProviderName: js.UndefOr[String] = js.undefined
  /**
    * List of service regions this SKU is offered at.
    * Example: "asia-east1"
    * Service regions can be found at https://cloud.google.com/about/locations/
    */
  var serviceRegions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The identifier for the SKU.
    * Example: "AA95-CD31-42FE"
    */
  var skuId: js.UndefOr[String] = js.undefined
}

object Sku {
  @scala.inline
  def apply(
    category: Category = null,
    description: String = null,
    name: String = null,
    pricingInfo: js.Array[PricingInfo] = null,
    serviceProviderName: String = null,
    serviceRegions: js.Array[String] = null,
    skuId: String = null
  ): Sku = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pricingInfo != null) __obj.updateDynamic("pricingInfo")(pricingInfo.asInstanceOf[js.Any])
    if (serviceProviderName != null) __obj.updateDynamic("serviceProviderName")(serviceProviderName.asInstanceOf[js.Any])
    if (serviceRegions != null) __obj.updateDynamic("serviceRegions")(serviceRegions.asInstanceOf[js.Any])
    if (skuId != null) __obj.updateDynamic("skuId")(skuId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sku]
  }
}

