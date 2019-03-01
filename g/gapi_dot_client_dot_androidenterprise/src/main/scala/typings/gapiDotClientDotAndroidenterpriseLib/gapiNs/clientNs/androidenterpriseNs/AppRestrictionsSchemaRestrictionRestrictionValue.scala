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

object AppRestrictionsSchemaRestrictionRestrictionValue {
  @scala.inline
  def apply(
    `type`: java.lang.String = null,
    valueBool: js.UndefOr[scala.Boolean] = js.undefined,
    valueInteger: scala.Int | scala.Double = null,
    valueMultiselect: js.Array[java.lang.String] = null,
    valueString: java.lang.String = null
  ): AppRestrictionsSchemaRestrictionRestrictionValue = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(valueBool)) __obj.updateDynamic("valueBool")(valueBool)
    if (valueInteger != null) __obj.updateDynamic("valueInteger")(valueInteger.asInstanceOf[js.Any])
    if (valueMultiselect != null) __obj.updateDynamic("valueMultiselect")(valueMultiselect)
    if (valueString != null) __obj.updateDynamic("valueString")(valueString)
    __obj.asInstanceOf[AppRestrictionsSchemaRestrictionRestrictionValue]
  }
}

