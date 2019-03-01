package typings
package ejDotWebDotAllLib.ejNs.PivotGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceValue extends js.Object {
  /** Allows to set the axis name to place the measures items.
    * @Default {rows}
    */
  var axis: js.UndefOr[java.lang.String] = js.undefined
  /** Allows the user to set the display caption for an item for Relational datasource.
    */
  var fieldCaption: js.UndefOr[java.lang.String] = js.undefined
  /** Allows the user to bind the item by using its unique name as field name for Relational datasource.
    */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /** Allows to set the formula for calculation of values for calculated members in Relational datasource.
    */
  var formula: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the field is a calculated field or not with Relational datasource.
    * @Default {false}
    */
  var isCalculatedField: js.UndefOr[scala.Boolean] = js.undefined
  /** This holds the list of unique names of measures to bind them from the OLAP cube.
    * @Default {[]}
    */
  var measures: js.UndefOr[js.Array[DataSourceValuesMeasure]] = js.undefined
}

object DataSourceValue {
  @scala.inline
  def apply(
    axis: java.lang.String = null,
    fieldCaption: java.lang.String = null,
    fieldName: java.lang.String = null,
    formula: java.lang.String = null,
    isCalculatedField: js.UndefOr[scala.Boolean] = js.undefined,
    measures: js.Array[DataSourceValuesMeasure] = null
  ): DataSourceValue = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (fieldCaption != null) __obj.updateDynamic("fieldCaption")(fieldCaption)
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (!js.isUndefined(isCalculatedField)) __obj.updateDynamic("isCalculatedField")(isCalculatedField)
    if (measures != null) __obj.updateDynamic("measures")(measures)
    __obj.asInstanceOf[DataSourceValue]
  }
}

