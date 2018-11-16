package typings
package ejDotWebDotAllLib.ejNs.PivotGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSourceValue extends js.Object {
  /** Allows you to set the axis name to place measures items.
               * @Default {rows}
               */
  var axis: js.UndefOr[java.lang.String] = js.undefined
  /** Allows to set the custom theme for values.
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the display caption for the item in the relational datasource.
               */
  var fieldCaption: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to bind the item by using its unique name as field name for the relational datasource.
               */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /** Allows to set the format for values.
               */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** This property is set to display the formatted values with format types in the PivotGrid.
               */
  var formatString: js.UndefOr[java.lang.String] = js.undefined
  /** Allows to set the formula for calculation of values for calculated members in the relational datasource.
               */
  var formula: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the field is a calculated field with the relational datasource or not.
               * @Default {false}
               */
  var isCalculatedField: js.UndefOr[scala.Boolean] = js.undefined
  /** This holds the list of unique names of measures to bind them from the OLAP cube.
               * @Default {[]}
               */
  var measures: js.UndefOr[js.Array[DataSourceValuesMeasure]] = js.undefined
  /** Allows to set the type of PivotGrid summary calculation in the value field with the relational datasource.
               * @Default {ej.PivotAnalysis.SummaryType.Sum}
               */
  var summaryType: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SummaryType | java.lang.String] = js.undefined
}

