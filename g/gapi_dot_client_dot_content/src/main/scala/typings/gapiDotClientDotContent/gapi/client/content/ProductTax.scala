package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductTax extends js.Object {
  /** The country within which the item is taxed, specified as a CLDR territory code. */
  var country: js.UndefOr[String] = js.undefined
  /** The numeric id of a location that the tax rate applies to as defined in the AdWords API. */
  var locationId: js.UndefOr[String] = js.undefined
  /**
    * The postal code range that the tax rate applies to, represented by a ZIP code, a ZIP code prefix using &#42; wildcard, a range between two ZIP codes or two
    * ZIP code prefixes of equal length. Examples: 94114, 94&#42;, 94002-95460, 94&#42;-95&#42;.
    */
  var postalCode: js.UndefOr[String] = js.undefined
  /** The percentage of tax rate that applies to the item price. */
  var rate: js.UndefOr[Double] = js.undefined
  /** The geographic region to which the tax rate applies. */
  var region: js.UndefOr[String] = js.undefined
  /** Set to true if tax is charged on shipping. */
  var taxShip: js.UndefOr[Boolean] = js.undefined
}

object ProductTax {
  @scala.inline
  def apply(
    country: String = null,
    locationId: String = null,
    postalCode: String = null,
    rate: Int | Double = null,
    region: String = null,
    taxShip: js.UndefOr[Boolean] = js.undefined
  ): ProductTax = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (locationId != null) __obj.updateDynamic("locationId")(locationId)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (!js.isUndefined(taxShip)) __obj.updateDynamic("taxShip")(taxShip)
    __obj.asInstanceOf[ProductTax]
  }
}

