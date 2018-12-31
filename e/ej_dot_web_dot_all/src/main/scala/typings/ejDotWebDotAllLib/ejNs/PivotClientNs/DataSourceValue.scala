package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceValue extends js.Object {
  /** Allows to set the axis name to place the measures items.
    * @Default {rows}
    */
  var axis: js.UndefOr[java.lang.String] = js.undefined
  /** Allows to set the custom theme for the values.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the display caption for an item for the relational data source.
    */
  var fieldCaption: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to bind the item by using its unique name as field name for the relational data source.
    */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /** Allows to set the format of the values.
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** This property is set to display the formatted values with format types in the pivot grid.
    */
  var formatString: js.UndefOr[java.lang.String] = js.undefined
  /** Allows to set the formula for calculation of members values in the relational data source.
    */
  var formula: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the field is a calculated field or not with the relational data source.
    * @Default {false}
    */
  var isCalculatedField: js.UndefOr[scala.Boolean] = js.undefined
  /** This holds the list of unique names of measures to bind them from the OLAP cube.
    * @Default {[]}
    */
  var measures: js.UndefOr[js.Array[DataSourceValuesMeasure]] = js.undefined
  /** Allows to set the type of the pivot grid summary calculation for the value field with the relational data source.
    * @Default {ej.PivotAnalysis.SummaryType.Sum}
    */
  var summaryType: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SummaryType | java.lang.String] = js.undefined
}

