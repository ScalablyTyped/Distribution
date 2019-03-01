package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

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
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The resource name for the SKU.
    * Example: "services/DA34-426B-A397/skus/AA95-CD31-42FE"
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** A timeline of pricing info for this SKU in chronological order. */
  var pricingInfo: js.UndefOr[js.Array[PricingInfo]] = js.undefined
  /**
    * Identifies the service provider.
    * This is 'Google' for first party services in Google Cloud Platform.
    */
  var serviceProviderName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of service regions this SKU is offered at.
    * Example: "asia-east1"
    * Service regions can be found at https://cloud.google.com/about/locations/
    */
  var serviceRegions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The identifier for the SKU.
    * Example: "AA95-CD31-42FE"
    */
  var skuId: js.UndefOr[java.lang.String] = js.undefined
}

object Sku {
  @scala.inline
  def apply(
    category: Category = null,
    description: java.lang.String = null,
    name: java.lang.String = null,
    pricingInfo: js.Array[PricingInfo] = null,
    serviceProviderName: java.lang.String = null,
    serviceRegions: js.Array[java.lang.String] = null,
    skuId: java.lang.String = null
  ): Sku = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pricingInfo != null) __obj.updateDynamic("pricingInfo")(pricingInfo)
    if (serviceProviderName != null) __obj.updateDynamic("serviceProviderName")(serviceProviderName)
    if (serviceRegions != null) __obj.updateDynamic("serviceRegions")(serviceRegions)
    if (skuId != null) __obj.updateDynamic("skuId")(skuId)
    __obj.asInstanceOf[Sku]
  }
}

