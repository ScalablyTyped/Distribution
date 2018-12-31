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

