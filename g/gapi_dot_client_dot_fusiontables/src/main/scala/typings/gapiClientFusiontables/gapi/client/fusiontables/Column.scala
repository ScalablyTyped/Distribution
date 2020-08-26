package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClientFusiontables.anon.ColumnId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  /** Identifier of the base column. If present, this column is derived from the specified base column. */
  var baseColumn: js.UndefOr[ColumnId] = js.native
  /** Identifier for the column. */
  var columnId: js.UndefOr[Double] = js.native
  /** JSON schema for interpreting JSON in this column. */
  var columnJsonSchema: js.UndefOr[String] = js.native
  /** JSON object containing custom column properties. */
  var columnPropertiesJson: js.UndefOr[String] = js.native
  /** Column description. */
  var description: js.UndefOr[String] = js.native
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
  var formatPattern: js.UndefOr[String] = js.native
  /**
    * Column graph predicate.
    * Used to map table to graph data model (subject,predicate,object)
    * See W3C Graph-based Data Model.
    */
  var graphPredicate: js.UndefOr[String] = js.native
  /** The kind of item this is. For a column, this is always fusiontables#column. */
  var kind: js.UndefOr[String] = js.native
  /** Name of the column. */
  var name: js.UndefOr[String] = js.native
  /** Type of the column. */
  var `type`: js.UndefOr[String] = js.native
  /** List of valid values used to validate data and supply a drop-down list of values in the web application. */
  var validValues: js.UndefOr[js.Array[String]] = js.native
  /** If true, data entered via the web application is validated. */
  var validateData: js.UndefOr[Boolean] = js.native
}

object Column {
  @scala.inline
  def apply(): Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column]
  }
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseColumn(value: ColumnId): Self = this.set("baseColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseColumn: Self = this.set("baseColumn", js.undefined)
    @scala.inline
    def setColumnId(value: Double): Self = this.set("columnId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnId: Self = this.set("columnId", js.undefined)
    @scala.inline
    def setColumnJsonSchema(value: String): Self = this.set("columnJsonSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnJsonSchema: Self = this.set("columnJsonSchema", js.undefined)
    @scala.inline
    def setColumnPropertiesJson(value: String): Self = this.set("columnPropertiesJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnPropertiesJson: Self = this.set("columnPropertiesJson", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFormatPattern(value: String): Self = this.set("formatPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatPattern: Self = this.set("formatPattern", js.undefined)
    @scala.inline
    def setGraphPredicate(value: String): Self = this.set("graphPredicate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphPredicate: Self = this.set("graphPredicate", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValidValuesVarargs(value: String*): Self = this.set("validValues", js.Array(value :_*))
    @scala.inline
    def setValidValues(value: js.Array[String]): Self = this.set("validValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidValues: Self = this.set("validValues", js.undefined)
    @scala.inline
    def setValidateData(value: Boolean): Self = this.set("validateData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateData: Self = this.set("validateData", js.undefined)
  }
  
}

