package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppRestrictionsSchemaRestrictionRestrictionValue extends js.Object {
  /** The type of the value being provided. */
  var `type`: js.UndefOr[String] = js.undefined
  /** The boolean value - this will only be present if type is bool. */
  var valueBool: js.UndefOr[Boolean] = js.undefined
  /** The integer value - this will only be present if type is integer. */
  var valueInteger: js.UndefOr[Double] = js.undefined
  /** The list of string values - this will only be present if type is multiselect. */
  var valueMultiselect: js.UndefOr[js.Array[String]] = js.undefined
  /** The string value - this will be present for types string, choice and hidden. */
  var valueString: js.UndefOr[String] = js.undefined
}

object AppRestrictionsSchemaRestrictionRestrictionValue {
  @scala.inline
  def apply(
    `type`: String = null,
    valueBool: js.UndefOr[Boolean] = js.undefined,
    valueInteger: Int | Double = null,
    valueMultiselect: js.Array[String] = null,
    valueString: String = null
  ): AppRestrictionsSchemaRestrictionRestrictionValue = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(valueBool)) __obj.updateDynamic("valueBool")(valueBool.asInstanceOf[js.Any])
    if (valueInteger != null) __obj.updateDynamic("valueInteger")(valueInteger.asInstanceOf[js.Any])
    if (valueMultiselect != null) __obj.updateDynamic("valueMultiselect")(valueMultiselect.asInstanceOf[js.Any])
    if (valueString != null) __obj.updateDynamic("valueString")(valueString.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppRestrictionsSchemaRestrictionRestrictionValue]
  }
}

