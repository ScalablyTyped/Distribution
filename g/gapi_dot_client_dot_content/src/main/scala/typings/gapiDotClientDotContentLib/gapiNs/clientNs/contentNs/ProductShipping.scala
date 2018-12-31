package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductShipping extends js.Object {
  /** The CLDR territory code of the country to which an item will ship. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** The location where the shipping is applicable, represented by a location group name. */
  var locationGroupName: js.UndefOr[java.lang.String] = js.undefined
  /** The numeric id of a location that the shipping rate applies to as defined in the AdWords API. */
  var locationId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The postal code range that the shipping rate applies to, represented by a postal code, a postal code prefix followed by a &#42; wildcard, a range between
    * two postal codes or two postal code prefixes of equal length.
    */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /** Fixed shipping price, represented as a number. */
  var price: js.UndefOr[Price] = js.undefined
  /** The geographic region to which a shipping rate applies. */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** A free-form description of the service class or delivery speed. */
  var service: js.UndefOr[java.lang.String] = js.undefined
}

