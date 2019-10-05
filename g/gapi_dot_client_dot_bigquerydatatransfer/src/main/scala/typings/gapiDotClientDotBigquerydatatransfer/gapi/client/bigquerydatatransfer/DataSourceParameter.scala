package typings.gapiDotClientDotBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceParameter extends js.Object {
  /** All possible values for the parameter. */
  var allowedValues: js.UndefOr[js.Array[String]] = js.undefined
  /** Parameter description. */
  var description: js.UndefOr[String] = js.undefined
  /** Parameter display name in the user interface. */
  var displayName: js.UndefOr[String] = js.undefined
  /** When parameter is a record, describes child fields. */
  var fields: js.UndefOr[js.Array[DataSourceParameter]] = js.undefined
  /** Cannot be changed after initial creation. */
  var immutable: js.UndefOr[Boolean] = js.undefined
  /** For integer and double values specifies maxminum allowed value. */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** For integer and double values specifies minimum allowed value. */
  var minValue: js.UndefOr[Double] = js.undefined
  /** Parameter identifier. */
  var paramId: js.UndefOr[String] = js.undefined
  /**
    * If set to true, schema should be taken from the parent with the same
    * parameter_id. Only applicable when parameter type is RECORD.
    */
  var recurse: js.UndefOr[Boolean] = js.undefined
  /** Can parameter have multiple values. */
  var repeated: js.UndefOr[Boolean] = js.undefined
  /** Is parameter required. */
  var required: js.UndefOr[Boolean] = js.undefined
  /** Parameter type. */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Description of the requirements for this field, in case the user input does
    * not fulfill the regex pattern or min/max values.
    */
  var validationDescription: js.UndefOr[String] = js.undefined
  /** URL to a help document to further explain the naming requirements. */
  var validationHelpUrl: js.UndefOr[String] = js.undefined
  /** Regular expression which can be used for parameter validation. */
  var validationRegex: js.UndefOr[String] = js.undefined
}

object DataSourceParameter {
  @scala.inline
  def apply(
    allowedValues: js.Array[String] = null,
    description: String = null,
    displayName: String = null,
    fields: js.Array[DataSourceParameter] = null,
    immutable: js.UndefOr[Boolean] = js.undefined,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    paramId: String = null,
    recurse: js.UndefOr[Boolean] = js.undefined,
    repeated: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    validationDescription: String = null,
    validationHelpUrl: String = null,
    validationRegex: String = null
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

