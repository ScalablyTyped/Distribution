package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BuyLink extends js.Object {
  /** URL to purchase this volume on the Google Books site. (In LITE projection) */
  var buyLink: js.UndefOr[java.lang.String] = js.undefined
  /** The two-letter ISO_3166-1 country code for which this sale information is valid. (In LITE projection.) */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** Whether or not this volume is an eBook (can be added to the My eBooks shelf). */
  var isEbook: js.UndefOr[scala.Boolean] = js.undefined
  /** Suggested retail price. (In LITE projection.) */
  var listPrice: js.UndefOr[Anon_Amount] = js.undefined
  /** Offers available for this volume (sales and rentals). */
  var offers: js.UndefOr[js.Array[Anon_FinskyOfferType]] = js.undefined
  /** The date on which this book is available for sale. */
  var onSaleDate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The actual selling price of the book. This is the same as the suggested retail or list price unless there are offers or discounts on this volume. (In
    * LITE projection.)
    */
  var retailPrice: js.UndefOr[Anon_Amount] = js.undefined
  /**
    * Whether or not this book is available for sale or offered for free in the Google eBookstore for the country listed above. Possible values are FOR_SALE,
    * FOR_RENTAL_ONLY, FOR_SALE_AND_RENTAL, FREE, NOT_FOR_SALE, or FOR_PREORDER.
    */
  var saleability: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BuyLink {
  @scala.inline
  def apply(
    buyLink: java.lang.String = null,
    country: java.lang.String = null,
    isEbook: js.UndefOr[scala.Boolean] = js.undefined,
    listPrice: Anon_Amount = null,
    offers: js.Array[Anon_FinskyOfferType] = null,
    onSaleDate: java.lang.String = null,
    retailPrice: Anon_Amount = null,
    saleability: java.lang.String = null
  ): Anon_BuyLink = {
    val __obj = js.Dynamic.literal()
    if (buyLink != null) __obj.updateDynamic("buyLink")(buyLink)
    if (country != null) __obj.updateDynamic("country")(country)
    if (!js.isUndefined(isEbook)) __obj.updateDynamic("isEbook")(isEbook)
    if (listPrice != null) __obj.updateDynamic("listPrice")(listPrice)
    if (offers != null) __obj.updateDynamic("offers")(offers)
    if (onSaleDate != null) __obj.updateDynamic("onSaleDate")(onSaleDate)
    if (retailPrice != null) __obj.updateDynamic("retailPrice")(retailPrice)
    if (saleability != null) __obj.updateDynamic("saleability")(saleability)
    __obj.asInstanceOf[Anon_BuyLink]
  }
}

