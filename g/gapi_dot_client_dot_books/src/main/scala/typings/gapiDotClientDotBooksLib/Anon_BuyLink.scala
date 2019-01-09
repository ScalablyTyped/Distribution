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

