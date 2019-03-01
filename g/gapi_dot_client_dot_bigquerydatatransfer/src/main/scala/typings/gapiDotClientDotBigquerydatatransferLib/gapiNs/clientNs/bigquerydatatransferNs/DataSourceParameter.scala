package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceParameter extends js.Object {
  /** All possible values for the parameter. */
  var allowedValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Parameter description. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Parameter display name in the user interface. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** When parameter is a record, describes child fields. */
  var fields: js.UndefOr[js.Array[DataSourceParameter]] = js.undefined
  /** Cannot be changed after initial creation. */
  var immutable: js.UndefOr[scala.Boolean] = js.undefined
  /** For integer and double values specifies maxminum allowed value. */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** For integer and double values specifies minimum allowed value. */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** Parameter identifier. */
  var paramId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to true, schema should be taken from the parent with the same
    * parameter_id. Only applicable when parameter type is RECORD.
    */
  var recurse: js.UndefOr[scala.Boolean] = js.undefined
  /** Can parameter have multiple values. */
  var repeated: js.UndefOr[scala.Boolean] = js.undefined
  /** Is parameter required. */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /** Parameter type. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Description of the requirements for this field, in case the user input does
    * not fulfill the regex pattern or min/max values.
    */
  var validationDescription: js.UndefOr[java.lang.String] = js.undefined
  /** URL to a help document to further explain the naming requirements. */
  var validationHelpUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Regular expression which can be used for parameter validation. */
  var validationRegex: js.UndefOr[java.lang.String] = js.undefined
}

object DataSourceParameter {
  @scala.inline
  def apply(
    allowedValues: js.Array[java.lang.String] = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    fields: js.Array[DataSourceParameter] = null,
    immutable: js.UndefOr[scala.Boolean] = js.undefined,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    paramId: java.lang.String = null,
    recurse: js.UndefOr[scala.Boolean] = js.undefined,
    repeated: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    validationDescription: java.lang.String = null,
    validationHelpUrl: java.lang.String = null,
    validationRegex: java.lang.String = null
  ): DataSourceParameter = {
    val __obj = js.Dynamic.literal()
    if (allowedValues != null) __obj.updateDynamic("allowedValues")(allowedValues)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (paramId != null) __obj.updateDynamic("paramId")(paramId)
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse)
    if (!js.isUndefined(repeated)) __obj.updateDynamic("repeated")(repeated)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validationDescription != null) __obj.updateDynamic("validationDescription")(validationDescription)
    if (validationHelpUrl != null) __obj.updateDynamic("validationHelpUrl")(validationHelpUrl)
    if (validationRegex != null) __obj.updateDynamic("validationRegex")(validationRegex)
    __obj.asInstanceOf[DataSourceParameter]
  }
}

