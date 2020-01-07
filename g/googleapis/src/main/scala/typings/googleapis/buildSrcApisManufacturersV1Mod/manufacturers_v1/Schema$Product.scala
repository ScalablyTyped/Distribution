package typings.googleapis.buildSrcApisManufacturersV1Mod.manufacturers_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Product data.
  */
@js.native
trait Schema$Product extends js.Object {
  /**
    * Attributes of the product uploaded to the Manufacturer Center. Manually
    * edited attributes are taken into account.
    */
  var attributes: js.UndefOr[Schema$Attributes] = js.native
  /**
    * The content language of the product as a two-letter ISO 639-1 language
    * code (for example, en).
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * The status of the destinations.
    */
  var destinationStatuses: js.UndefOr[js.Array[Schema$DestinationStatus]] = js.native
  /**
    * A server-generated list of issues associated with the product.
    */
  var issues: js.UndefOr[js.Array[Schema$Issue]] = js.native
  /**
    * Name in the format `{target_country}:{content_language}:{product_id}`.
    * `target_country`   - The target country of the product as a CLDR
    * territory                      code (for example, US). `content_language`
    * - The content language of the product as a two-letter ISO 639-1 language
    * code (for example, en).  `product_id`     -   The ID of the product. For
    * more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Parent ID in the format `accounts/{account_id}`.  `account_id` - The ID
    * of the Manufacturer Center account.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The ID of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The target country of the product as a CLDR territory code (for example,
    * US).
    */
  var targetCountry: js.UndefOr[String] = js.native
}

object Schema$Product {
  @scala.inline
  def apply(
    attributes: Schema$Attributes = null,
    contentLanguage: String = null,
    destinationStatuses: js.Array[Schema$DestinationStatus] = null,
    issues: js.Array[Schema$Issue] = null,
    name: String = null,
    parent: String = null,
    productId: String = null,
    targetCountry: String = null
  ): Schema$Product = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (destinationStatuses != null) __obj.updateDynamic("destinationStatuses")(destinationStatuses.asInstanceOf[js.Any])
    if (issues != null) __obj.updateDynamic("issues")(issues.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Product]
  }
}

