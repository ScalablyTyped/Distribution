package typings
package gapiDotClientDotManufacturersLib.gapiNs.clientNs.manufacturersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  /**
    * The content language of the product as a two-letter ISO 639-1 language code
    * (for example, en).
    * @OutputOnly
    */
  var contentLanguage: js.UndefOr[java.lang.String] = js.undefined
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
  var manuallyDeletedAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Parent ID in the format `accounts/{account_id}`.
    *
    * `account_id` - The ID of the Manufacturer Center account.
    * @OutputOnly
    */
  var parent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    * @OutputOnly
    */
  var productId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The target country of the product as a CLDR territory code (for example,
    * US).
    * @OutputOnly
    */
  var targetCountry: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Attributes of the product uploaded via the Manufacturer Center API or via
    * feeds.
    */
  var uploadedAttributes: js.UndefOr[Attributes] = js.undefined
}

