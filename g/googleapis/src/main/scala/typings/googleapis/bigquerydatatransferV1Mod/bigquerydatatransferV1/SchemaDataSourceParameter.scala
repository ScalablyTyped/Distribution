package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a data source parameter with validation rules, so that
  * parameters can be rendered in the UI. These parameters are given to us by
  * supported data sources, and include all needed information for rendering
  * and validation. Thus, whoever uses this api can decide to generate either
  * generic ui, or custom data source specific forms.
  */
@js.native
trait SchemaDataSourceParameter extends js.Object {
  /**
    * All possible values for the parameter.
    */
  var allowedValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * Parameter description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Parameter display name in the user interface.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Deprecated. This field has no effect.
    */
  var fields: js.UndefOr[js.Array[SchemaDataSourceParameter]] = js.native
  /**
    * Cannot be changed after initial creation.
    */
  var immutable: js.UndefOr[Boolean] = js.native
  /**
    * For integer and double values specifies maxminum allowed value.
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * For integer and double values specifies minimum allowed value.
    */
  var minValue: js.UndefOr[Double] = js.native
  /**
    * Parameter identifier.
    */
  var paramId: js.UndefOr[String] = js.native
  /**
    * Deprecated. This field has no effect.
    */
  var recurse: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated. This field has no effect.
    */
  var repeated: js.UndefOr[Boolean] = js.native
  /**
    * Is parameter required.
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * Parameter type.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Description of the requirements for this field, in case the user input
    * does not fulfill the regex pattern or min/max values.
    */
  var validationDescription: js.UndefOr[String] = js.native
  /**
    * URL to a help document to further explain the naming requirements.
    */
  var validationHelpUrl: js.UndefOr[String] = js.native
  /**
    * Regular expression which can be used for parameter validation.
    */
  var validationRegex: js.UndefOr[String] = js.native
}

object SchemaDataSourceParameter {
  @scala.inline
  def apply(
    allowedValues: js.Array[String] = null,
    description: String = null,
    displayName: String = null,
    fields: js.Array[SchemaDataSourceParameter] = null,
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
  ): SchemaDataSourceParameter = {
    val __obj = js.Dynamic.literal()
    if (allowedValues != null) __obj.updateDynamic("allowedValues")(allowedValues.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (paramId != null) __obj.updateDynamic("paramId")(paramId.asInstanceOf[js.Any])
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse.asInstanceOf[js.Any])
    if (!js.isUndefined(repeated)) __obj.updateDynamic("repeated")(repeated.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validationDescription != null) __obj.updateDynamic("validationDescription")(validationDescription.asInstanceOf[js.Any])
    if (validationHelpUrl != null) __obj.updateDynamic("validationHelpUrl")(validationHelpUrl.asInstanceOf[js.Any])
    if (validationRegex != null) __obj.updateDynamic("validationRegex")(validationRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDataSourceParameter]
  }
}

