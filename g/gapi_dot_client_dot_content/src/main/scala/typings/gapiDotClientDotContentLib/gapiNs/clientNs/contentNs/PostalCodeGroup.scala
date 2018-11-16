package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PostalCodeGroup extends js.Object {
  /** The CLDR territory code of the country the postal code group applies to. Required. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the postal code group, referred to in headers. Required. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** A range of postal codes. Required. */
  var postalCodeRanges: js.UndefOr[js.Array[PostalCodeRange]] = js.undefined
}

