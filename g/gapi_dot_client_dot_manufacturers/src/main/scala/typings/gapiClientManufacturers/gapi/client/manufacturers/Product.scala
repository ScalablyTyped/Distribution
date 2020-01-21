package typings.gapiClientManufacturers.gapi.client.manufacturers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  /**
    * The content language of the product as a two-letter ISO 639-1 language code
    * (for example, en).
    * @OutputOnly
    */
  var contentLanguage: js.UndefOr[String] = js.undefined
  /**
    * Final attributes of the product. The final attributes are obtained by
    * overriding the uploaded attributes with the manually provided and deleted
    * attributes. Google systems only process, evaluate, review, and/or use final
    * attributes.
    * @OutputOnly
    */
  var finalAttributes: js.UndefOr[Attributes] = js.undefined
  /**
    * A server-generated list of issues associated with the product.
    * @OutputOnly
    */
  var issues: js.UndefOr[js.Array[Issue]] = js.undefined
  /**
    * Names of the attributes of the product deleted manually via the
    * Manufacturer Center UI.
    * @OutputOnly
    */
  var manuallyDeletedAttributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Attributes of the product provided manually via the Manufacturer Center UI.
    * @OutputOnly
    */
  var manuallyProvidedAttributes: js.UndefOr[Attributes] = js.undefined
  /**
    * Name in the format `{target_country}:{content_language}:{product_id}`.
    *
    * `target_country`   - The target country of the product as a CLDR territory
    * code (for example, US).
    *
    * `content_language` - The content language of the product as a two-letter
    * ISO 639-1 language code (for example, en).
    *
    * `product_id`     -   The ID of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    * @OutputOnly
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Parent ID in the format `accounts/{account_id}`.
    *
    * `account_id` - The ID of the Manufacturer Center account.
    * @OutputOnly
    */
  var parent: js.UndefOr[String] = js.undefined
  /**
    * The ID of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    * @OutputOnly
    */
  var productId: js.UndefOr[String] = js.undefined
  /**
    * The target country of the product as a CLDR territory code (for example,
    * US).
    * @OutputOnly
    */
  var targetCountry: js.UndefOr[String] = js.undefined
  /**
    * Attributes of the product uploaded via the Manufacturer Center API or via
    * feeds.
    */
  var uploadedAttributes: js.UndefOr[Attributes] = js.undefined
}

object Product {
  @scala.inline
  def apply(
    contentLanguage: String = null,
    finalAttributes: Attributes = null,
    issues: js.Array[Issue] = null,
    manuallyDeletedAttributes: js.Array[String] = null,
    manuallyProvidedAttributes: Attributes = null,
    name: String = null,
    parent: String = null,
    productId: String = null,
    targetCountry: String = null,
    uploadedAttributes: Attributes = null
  ): Product = {
    val __obj = js.Dynamic.literal()
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (finalAttributes != null) __obj.updateDynamic("finalAttributes")(finalAttributes.asInstanceOf[js.Any])
    if (issues != null) __obj.updateDynamic("issues")(issues.asInstanceOf[js.Any])
    if (manuallyDeletedAttributes != null) __obj.updateDynamic("manuallyDeletedAttributes")(manuallyDeletedAttributes.asInstanceOf[js.Any])
    if (manuallyProvidedAttributes != null) __obj.updateDynamic("manuallyProvidedAttributes")(manuallyProvidedAttributes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry.asInstanceOf[js.Any])
    if (uploadedAttributes != null) __obj.updateDynamic("uploadedAttributes")(uploadedAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
}

