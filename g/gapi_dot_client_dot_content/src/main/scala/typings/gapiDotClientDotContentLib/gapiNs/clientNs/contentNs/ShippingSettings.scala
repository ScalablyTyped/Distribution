package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingSettings extends js.Object {
  /** The ID of the account to which these account shipping settings belong. Ignored upon update, always present in get request responses. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** A list of postal code groups that can be referred to in services. Optional. */
  var postalCodeGroups: js.UndefOr[js.Array[PostalCodeGroup]] = js.undefined
  /** The target account's list of services. Optional. */
  var services: js.UndefOr[js.Array[Service]] = js.undefined
}

