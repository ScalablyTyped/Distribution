package typings.gapiDotClientDotFusiontables.gapiNs.clientNs.fusiontablesNs

import typings.gapiDotClientDotFusiontables.Anon_ColumnId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /** Identifier of the base column. If present, this column is derived from the specified base column. */
  var baseColumn: js.UndefOr[Anon_ColumnId] = js.undefined
  /** Identifier for the column. */
  var columnId: js.UndefOr[Double] = js.undefined
  /** JSON schema for interpreting JSON in this column. */
  var columnJsonSchema: js.UndefOr[String] = js.undefined
  /** JSON object containing custom column properties. */
  var columnPropertiesJson: js.UndefOr[String] = js.undefined
  /** Column description. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Format pattern.
    * Acceptable values are DT_DATE_MEDIUMe.g Dec 24, 2008 DT_DATE_SHORTfor example 12/24/08 DT_DATE_TIME_MEDIUMfor example Dec 24, 2008 8:30:45 PM
    * DT_DATE_TIME_SHORTfor example 12/24/08 8:30 PM DT_DAY_MONTH_2_DIGIT_YEARfor example 24/12/08 DT_DAY_MONTH_2_DIGIT_YEAR_TIMEfor example 24/12/08 20:30
    * DT_DAY_MONTH_2_DIGIT_YEAR_TIME_MERIDIANfor example 24/12/08 8:30 PM DT_DAY_MONTH_4_DIGIT_YEARfor example 24/12/2008 DT_DAY_MONTH_4_DIGIT_YEAR_TIMEfor
    * example 24/12/2008 20:30 DT_DAY_MONTH_4_DIGIT_YEAR_TIME_MERIDIANfor example 24/12/2008 8:30 PM DT_ISO_YEAR_MONTH_DAYfor example 2008-12-24
    * DT_ISO_YEAR_MONTH_DAY_TIMEfor example 2008-12-24 20:30:45 DT_MONTH_DAY_4_DIGIT_YEARfor example 12/24/2008 DT_TIME_LONGfor example 8:30:45 PM UTC-6
    * DT_TIME_MEDIUMfor example 8:30:45 PM DT_TIME_SHORTfor example 8:30 PM DT_YEAR_ONLYfor example 2008 HIGHLIGHT_UNTYPED_CELLSHighlight cell data that does
    * not match the data type NONENo formatting (default) NUMBER_CURRENCYfor example $1234.56 NUMBER_DEFAULTfor example 1,234.56 NUMBER_INTEGERfor example
    * 1235 NUMBER_NO_SEPARATORfor example 1234.56 NUMBER_PERCENTfor example 123,456% NUMBER_SCIENTIFICfor example 1E3 STRING_EIGHT_LINE_IMAGEDisplays
    * thumbnail images as tall as eight lines of text STRING_FOUR_LINE_IMAGEDisplays thumbnail images as tall as four lines of text STRING_JSON_TEXTAllows
    * editing of text as JSON in UI STRING_JSON_LISTAllows editing of text as a JSON list in UI STRING_LINKTreats cell as a link (must start with http:// or
    * https://) STRING_ONE_LINE_IMAGEDisplays thumbnail images as tall as one line of text STRING_VIDEO_OR_MAPDisplay a video or map thumbnail
    */
  var formatPattern: js.UndefOr[String] = js.undefined
  /**
    * Column graph predicate.
    * Used to map table to graph data model (subject,predicate,object)
    * See W3C Graph-based Data Model.
    */
  var graphPredicate: js.UndefOr[String] = js.undefined
  /** The kind of item this is. For a column, this is always fusiontables#column. */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of the column. */
  var name: js.UndefOr[String] = js.undefined
  /** Type of the column. */
  var `type`: js.UndefOr[String] = js.undefined
  /** List of valid values used to validate data and supply a drop-down list of values in the web application. */
  var validValues: js.UndefOr[js.Array[String]] = js.undefined
  /** If true, data entered via the web application is validated. */
  var validateData: js.UndefOr[Boolean] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    baseColumn: Anon_ColumnId = null,
    columnId: Int | Double = null,
    columnJsonSchema: String = null,
    columnPropertiesJson: String = null,
    description: String = null,
    formatPattern: String = null,
    graphPredicate: String = null,
    kind: String = null,
    name: String = null,
    `type`: String = null,
    validValues: js.Array[String] = null,
    validateData: js.UndefOr[Boolean] = js.undefined
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (baseColumn != null) __obj.updateDynamic("baseColumn")(baseColumn)
    if (columnId != null) __obj.updateDynamic("columnId")(columnId.asInstanceOf[js.Any])
    if (columnJsonSchema != null) __obj.updateDynamic("columnJsonSchema")(columnJsonSchema)
    if (columnPropertiesJson != null) __obj.updateDynamic("columnPropertiesJson")(columnPropertiesJson)
    if (description != null) __obj.updateDynamic("description")(description)
    if (formatPattern != null) __obj.updateDynamic("formatPattern")(formatPattern)
    if (graphPredicate != null) __obj.updateDynamic("graphPredicate")(graphPredicate)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validValues != null) __obj.updateDynamic("validValues")(validValues)
    if (!js.isUndefined(validateData)) __obj.updateDynamic("validateData")(validateData)
    __obj.asInstanceOf[Column]
  }
}

