package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuyLink extends js.Object {
  /** URL to purchase this volume on the Google Books site. (In LITE projection) */
  var buyLink: js.UndefOr[String] = js.undefined
  /** The two-letter ISO_3166-1 country code for which this sale information is valid. (In LITE projection.) */
  var country: js.UndefOr[String] = js.undefined
  /** Whether or not this volume is an eBook (can be added to the My eBooks shelf). */
  var isEbook: js.UndefOr[Boolean] = js.undefined
  /** Suggested retail price. (In LITE projection.) */
  var listPrice: js.UndefOr[Amount] = js.undefined
  /** Offers available for this volume (sales and rentals). */
  var offers: js.UndefOr[js.Array[FinskyOfferType]] = js.undefined
  /** The date on which this book is available for sale. */
  var onSaleDate: js.UndefOr[String] = js.undefined
  /**
    * The actual selling price of the book. This is the same as the suggested retail or list price unless there are offers or discounts on this volume. (In
    * LITE projection.)
    */
  var retailPrice: js.UndefOr[Amount] = js.undefined
  /**
    * Whether or not this book is available for sale or offered for free in the Google eBookstore for the country listed above. Possible values are FOR_SALE,
    * FOR_RENTAL_ONLY, FOR_SALE_AND_RENTAL, FREE, NOT_FOR_SALE, or FOR_PREORDER.
    */
  var saleability: js.UndefOr[String] = js.undefined
}

object BuyLink {
  @scala.inline
  def apply(
    buyLink: String = null,
    country: String = null,
    isEbook: js.UndefOr[Boolean] = js.undefined,
    listPrice: Amount = null,
    offers: js.Array[FinskyOfferType] = null,
    onSaleDate: String = null,
    retailPrice: Amount = null,
    saleability: String = null
  ): BuyLink = {
    val __obj = js.Dynamic.literal()
    if (buyLink != null) __obj.updateDynamic("buyLink")(buyLink.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (!js.isUndefined(isEbook)) __obj.updateDynamic("isEbook")(isEbook.get.asInstanceOf[js.Any])
    if (listPrice != null) __obj.updateDynamic("listPrice")(listPrice.asInstanceOf[js.Any])
    if (offers != null) __obj.updateDynamic("offers")(offers.asInstanceOf[js.Any])
    if (onSaleDate != null) __obj.updateDynamic("onSaleDate")(onSaleDate.asInstanceOf[js.Any])
    if (retailPrice != null) __obj.updateDynamic("retailPrice")(retailPrice.asInstanceOf[js.Any])
    if (saleability != null) __obj.updateDynamic("saleability")(saleability.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyLink]
  }
}

