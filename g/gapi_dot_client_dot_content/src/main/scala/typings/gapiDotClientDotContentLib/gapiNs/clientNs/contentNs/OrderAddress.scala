package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderAddress extends js.Object {
  /** CLDR country code (e.g. "US"). */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Strings representing the lines of the printed label for mailing the order, for example:
    * John Smith
    * 1600 Amphitheatre Parkway
    * Mountain View, CA, 94043
    * United States
    */
  var fullAddress: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether the address is a post office box. */
  var isPostOfficeBox: js.UndefOr[scala.Boolean] = js.undefined
  /** City, town or commune. May also include dependent localities or sublocalities (e.g. neighborhoods or suburbs). */
  var locality: js.UndefOr[java.lang.String] = js.undefined
  /** Postal Code or ZIP (e.g. "94043"). */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the recipient. */
  var recipientName: js.UndefOr[java.lang.String] = js.undefined
  /** Top-level administrative subdivision of the country (e.g. "CA"). */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** Street-level part of the address. */
  var streetAddress: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

