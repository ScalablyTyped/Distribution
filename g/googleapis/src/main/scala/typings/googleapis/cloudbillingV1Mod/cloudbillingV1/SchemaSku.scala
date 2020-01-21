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
  def apply(
    category: SchemaCategory = null,
    description: String = null,
    name: String = null,
    pricingInfo: js.Array[SchemaPricingInfo] = null,
    serviceProviderName: String = null,
    serviceRegions: js.Array[String] = null,
    skuId: String = null
  ): SchemaSku = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pricingInfo != null) __obj.updateDynamic("pricingInfo")(pricingInfo.asInstanceOf[js.Any])
    if (serviceProviderName != null) __obj.updateDynamic("serviceProviderName")(serviceProviderName.asInstanceOf[js.Any])
    if (serviceRegions != null) __obj.updateDynamic("serviceRegions")(serviceRegions.asInstanceOf[js.Any])
    if (skuId != null) __obj.updateDynamic("skuId")(skuId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSku]
  }
}

