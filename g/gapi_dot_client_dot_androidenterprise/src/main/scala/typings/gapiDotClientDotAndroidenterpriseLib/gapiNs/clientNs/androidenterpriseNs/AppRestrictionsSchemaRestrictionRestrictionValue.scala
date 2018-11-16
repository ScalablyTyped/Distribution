package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AppRestrictionsSchemaRestrictionRestrictionValue extends js.Object {
  /** The type of the value being provided. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The boolean value - this will only be present if type is bool. */
  var valueBool: js.UndefOr[scala.Boolean] = js.undefined
  /** The integer value - this will only be present if type is integer. */
  var valueInteger: js.UndefOr[scala.Double] = js.undefined
  /** The list of string values - this will only be present if type is multiselect. */
  var valueMultiselect: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The string value - this will be present for types string, choice and hidden. */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
}

