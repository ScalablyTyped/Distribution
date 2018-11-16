package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestOrderLineItemProduct extends js.Object {
  /** Brand of the item. */
  var brand: js.UndefOr[java.lang.String] = js.undefined
  /** The item's channel. */
  var channel: js.UndefOr[java.lang.String] = js.undefined
  /** Condition or state of the item. */
  var condition: js.UndefOr[java.lang.String] = js.undefined
  /** The two-letter ISO 639-1 language code for the item. */
  var contentLanguage: js.UndefOr[java.lang.String] = js.undefined
  /** Global Trade Item Number (GTIN) of the item. Optional. */
  var gtin: js.UndefOr[java.lang.String] = js.undefined
  /** URL of an image of the item. */
  var imageLink: js.UndefOr[java.lang.String] = js.undefined
  /** Shared identifier for all variants of the same product. Optional. */
  var itemGroupId: js.UndefOr[java.lang.String] = js.undefined
  /** Manufacturer Part Number (MPN) of the item. Optional. */
  var mpn: js.UndefOr[java.lang.String] = js.undefined
  /** An identifier of the item. */
  var offerId: js.UndefOr[java.lang.String] = js.undefined
  /** The price for the product. */
  var price: js.UndefOr[Price] = js.undefined
  /** The CLDR territory code of the target country of the product. */
  var targetCountry: js.UndefOr[java.lang.String] = js.undefined
  /** The title of the product. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Variant attributes for the item. Optional. */
  var variantAttributes: js.UndefOr[js.Array[OrderLineItemProductVariantAttribute]] = js.undefined
}

